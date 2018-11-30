package models;

import java.util.ArrayList;

public class JobList{
  private ArrayList<Job> jobList;
  private ArrayList<Profile> appliedUsers;

  public JobList(){
    jobList = new ArrayList<>();
    appliedUsers = new ArrayList<>();
    jobList.add(new Job("Developer", "Develop cutting edge software solutions", 100000, "Google"));
  }

  public ArrayList<Job> getJobList(){
    return jobList;
  }


  public ArrayList<Profile> getAppliedUsers(){
    return appliedUsers;
  }
}
