package controllers;

import play.data.*;
import play.mvc.*;
import static play.libs.Scala.asScala;
import java.util.List;
import models.*;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class JobController extends Controller{

  private Form<JobData> form;
  private JobList jobList;
  private Form<SearchForm> searchForm;
  private Form<ApplyForm> applyForm;

  @Inject
  public JobController(FormFactory formFactory){

    this.form = formFactory.form(JobData.class);
    this.searchForm = formFactory.form(SearchForm.class);
    this.applyForm = formFactory.form(ApplyForm.class);
    this.jobList = new JobList();

  }

  public Result listJobs(){

    JobData data = new JobData();
    data.setTitle("");
    data.setDescription("");
    data.setSalary(0.0);
    form = form.fill(data);

    if(controllers.ProfileController.getLoggedInUser() >= 0){

      return ok(views.html.jobList.render(asScala(jobList.getJobList()), form, searchForm));

    } else {

      return redirect(routes.ProfileController.login());

    }

  }

  public Result createJob(){

    final Form<JobData> boundForm = form.bindFromRequest();

    if(controllers.ProfileController.getLoggedInUser() >= 0){

      if(boundForm.hasErrors()){

        return badRequest(views.html.jobList.render(asScala(jobList.getJobList()), form, searchForm));

      } else {

        JobData data = boundForm.get();
        jobList.getJobList().add(new Job(data.getTitle(), data.getDescription(), data.getSalary(), data.getCompany()));
        flash("info", "Job added!");
        return redirect(routes.JobController.listJobs());

      }

    } else {

      return redirect(routes.ProfileController.login());

    }

  }

  public Result deleteJob(int id){

    if(controllers.ProfileController.getLoggedInUser() >= 0){

      if(id < jobList.getJobList().size() && id >= 0){

        jobList.getJobList().remove(id);
        return ok(views.html.jobList.render(asScala(jobList.getJobList()), form, searchForm));

      } else {

        return badRequest(views.html.jobList.render(asScala(jobList.getJobList()), form, searchForm));

      }

    } else {

      return redirect(routes.ProfileController.login());

    }

  }

  public Result getJob(int id){

    if(controllers.ProfileController.getLoggedInUser() >= 0){

      JobData data = new JobData();
      data.setTitle(jobList.getJobList().get(id).getTitle());
      data.setDescription(jobList.getJobList().get(id).getDescription());
      data.setSalary(jobList.getJobList().get(id).getSalary());
      data.setCompany(jobList.getJobList().get(id).getCompany());
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

        return badRequest(views.html.jobList.render(asScala(jobList.getJobList()), form, searchForm));

      } else {

        JobData data = boundForm.get();
        jobList.getJobList().get(id).setTitle(data.getTitle());
        jobList.getJobList().get(id).setDescription(data.getDescription());
        jobList.getJobList().get(id).setSalary(data.getSalary());
        jobList.getJobList().get(id).setCompany(data.getCompany());
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
      for(int i = 0; i < jobList.getJobList().size(); i++){
        if(jobList.getJobList().get(i).getTitle().contains(data.getSearchTerms())){
          results.add(jobList.getJobList().get(i));
        }

        if(jobList.getJobList().get(i).getDescription().contains(data.getSearchTerms()) && !results.contains(jobList.getJobList().get(i))){
          results.add(jobList.getJobList().get(i));
        }

        if(jobList.getJobList().get(i).getCompany().contains(data.getSearchTerms()) && !results.contains(jobList.getJobList().get(i))){
          results.add(jobList.getJobList().get(i));
        }
      }

      return ok(views.html.search.render(asScala(results), searchForm));

    }
  }

  public Result getApply(int index){
    if(controllers.ProfileController.getLoggedInUser() >= 0){
      return ok(views.html.apply.render(jobList.getJobList().get(index), applyForm, searchForm, index));
    } else {
      return redirect(routes.ProfileController.login());
    }
  }

  public Result applyToJob(int index){
    if(controllers.ProfileController.getLoggedInUser() >= 0){
      final Form<ApplyForm> apply = applyForm.bindFromRequest();
      if(apply.hasErrors()){
        return redirect(routes.JobController.getApply(index));
      } else {
        ApplyForm data = apply.get();
        Profile user = controllers.ProfileController.getLoggedInUserProfile();
        jobList.getJobList().get(index).getApplicants().add(new Applicant(user, data.getResume(), data.getComments()));
        return redirect(routes.JobController.listJobs());
      }

    } else {
      return redirect(routes.ProfileController.login());
    }
  }
}
