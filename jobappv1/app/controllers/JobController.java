package controllers;

import play.data.*;
import play.mvc.*;
import static play.libs.Scala.asScala;
import java.util.List;
import models.Job;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class JobController extends Controller{

  private Form<JobData> form;
  private List<Job> jobs;
  private Form<SearchForm> searchForm;

  @Inject
  public JobController(FormFactory formFactory){

    this.form = formFactory.form(JobData.class);
    this.searchForm = formFactory.form(SearchForm.class);
    this.jobs = com.google.common.collect.Lists.newArrayList(new Job("Developer", "Develop cutting edge software solutions", 100000, "Google"));

  }

  public Result listJobs(){

    JobData data = new JobData();
    data.setTitle("");
    data.setDescription("");
    data.setSalary(0.0);
    form = form.fill(data);

    if(controllers.ProfileController.getLoggedInUser() >= 0){

      return ok(views.html.jobList.render(asScala(jobs), form, searchForm));

    } else {

      return redirect(routes.ProfileController.login());

    }

  }

  public Result createJob(){

    final Form<JobData> boundForm = form.bindFromRequest();

    if(controllers.ProfileController.getLoggedInUser() >= 0){

      if(boundForm.hasErrors()){

        return badRequest(views.html.jobList.render(asScala(jobs), form, searchForm));

      } else {

        JobData data = boundForm.get();
        jobs.add(new Job(data.getTitle(), data.getDescription(), data.getSalary(), data.getCompany()));
        flash("info", "Job added!");
        return redirect(routes.JobController.listJobs());

      }

    } else {

      return redirect(routes.ProfileController.login());

    }

  }

  public Result deleteJob(int id){

    if(controllers.ProfileController.getLoggedInUser() >= 0){

      if(id < jobs.size() && id >= 0){

        jobs.remove(id);
        return ok(views.html.jobList.render(asScala(jobs), form, searchForm));

      } else {

        return badRequest(views.html.jobList.render(asScala(jobs), form, searchForm));

      }

    } else {

      return redirect(routes.ProfileController.login());

    }

  }

  public Result getJob(int id){

    if(controllers.ProfileController.getLoggedInUser() >= 0){

      JobData data = new JobData();
      data.setTitle(jobs.get(id).getTitle());
      data.setDescription(jobs.get(id).getDescription());
      data.setSalary(jobs.get(id).getSalary());
      data.setCompany(jobs.get(id).getCompany());
      form = form.fill(data);
      return ok(views.html.job.render(form, searchForm, id));

    } else {

      return redirect(routes.ProfileController.login());

    }

  }

  public Result updateJob(int id){

    if(controllers.ProfileController.getLoggedInUser() >= 0){

      final Form<JobData> boundForm = form.bindFromRequest();

      if(boundForm.hasErrors()){

        return badRequest(views.html.jobList.render(asScala(jobs), form, searchForm));

      } else {

        JobData data = boundForm.get();
        jobs.get(id).setTitle(data.getTitle());
        jobs.get(id).setDescription(data.getDescription());
        jobs.get(id).setSalary(data.getSalary());
        jobs.get(id).setCompany(data.getCompany());
        flash("info", "Job updated!");
        return redirect(routes.JobController.listJobs());

      }

    } else {

      return redirect(routes.ProfileController.login());

    }

  }

  public Result search(){
    final Form<SearchForm> search = searchForm.bindFromRequest();
    List<Job> results = com.google.common.collect.Lists.newArrayList();


    if(search.hasErrors()){
      return redirect(routes.JobController.listJobs());
    } else {
      SearchForm data = search.get();
      for(int i = 0; i < jobs.size(); i++){
        if(jobs.get(i).getTitle().contains(data.getSearchTerms())){
          results.add(jobs.get(i));
        }

        if(jobs.get(i).getDescription().contains(data.getSearchTerms())){
          results.add(jobs.get(i));
        }

        if(jobs.get(i).getCompany().contains(data.getSearchTerms())){
          results.add(jobs.get(i));
        }
      }

      return ok(views.html.search.render(asScala(results), searchForm));

    }
  }

}
