package models;

import java.util.ArrayList;

public class JobList{
  private ArrayList<Job> jobList;

  public JobList(){
    jobList = new ArrayList<>();
    jobList.add(new Job("Developer", "Develop cutting edge software solutions", 100000, "Google"));
  }

  public ArrayList<Job> getJobList(){
    return jobList;
  }

}
