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

  @Inject
  public JobController(FormFactory formFactory){

    this.form = formFactory.form(JobData.class);
    this.jobs = com.google.common.collect.Lists.newArrayList(new Job("Developer", "Develop cutting edge software solutions", 100000));

  }

  public Result listJobs(){

    JobData data = new JobData();
    data.setTitle("");
    data.setDescription("");
    data.setSalary(0.0);
    form = form.fill(data);

    if(controllers.ProfileController.getLoggedInUser() >= 0){

      return ok(views.html.jobList.render(asScala(jobs), form));

    } else {

      return redirect(routes.ProfileController.login());

    }

  }

  public Result createJob(){

    final Form<JobData> boundForm = form.bindFromRequest();

    if(controllers.ProfileController.getLoggedInUser() >= 0){

      if(boundForm.hasErrors()){

        return badRequest(views.html.jobList.render(asScala(jobs), form));

      } else {

        JobData data = boundForm.get();
        jobs.add(new Job(data.getTitle(), data.getDescription(), data.getSalary()));
        flash("info", "Job added!");
        return redirect(routes.JobController.listJobs());

      }

    } else {

      return redirect(routes.ProfileController.login());

    }

  }

  public Result deleteJob(int id){

    if(controllers.ProfileController.getLoggedInUser() >= 0){

      if(id < jobs.size()){

        jobs.remove(id);
        return ok(views.html.jobList.render(asScala(jobs), form));

      } else {

        return badRequest(views.html.jobList.render(asScala(jobs), form));

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
      form = form.fill(data);
      return ok(views.html.job.render(jobs.get(id), form, id));

    } else {

      return redirect(routes.ProfileController.login());

    }

  }

  public Result updateJob(int id){

    if(controllers.ProfileController.getLoggedInUser() >= 0){

      final Form<JobData> boundForm = form.bindFromRequest();

      if(boundForm.hasErrors()){

        return badRequest(views.html.jobList.render(asScala(jobs), form));

      } else {

        JobData data = boundForm.get();
        jobs.get(id).setTitle(data.getTitle());
        jobs.get(id).setDescription(data.getDescription());
        jobs.get(id).setSalary(data.getSalary());
        flash("info", "Job updated!");
        return redirect(routes.JobController.listJobs());

      }

    } else {

      return redirect(routes.ProfileController.login());

    }

  }

}
