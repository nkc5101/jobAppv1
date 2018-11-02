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
  private final Form<JobData> form;
  private List<Job> jobs;

  @Inject
  public JobController(FormFactory formFactory){
    this.form = formFactory.form(JobData.class);
    this.jobs = com.google.common.collect.Lists.newArrayList(new Job("Developer", "Develop cutting edge software solutions", 100000));

  }

  public Result listJobs(){
    if(controllers.ProfileController.getLoggedInUser() >= 0){
      return ok(views.html.jobList.render());
    } else {
      return redirect(routes.ProfileController.login());
    }
  }
}
