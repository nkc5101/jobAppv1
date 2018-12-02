package models;

import java.io.File;

public class Applicant{
  private Profile user;
  private File resume;

  public Applicant(Profile user, File resume){
    this.user = user;
    this.resume = resume;
  }

  public File getResume(){
    return resume;
  }

  public Profile getUser(){
    return user;
  }

}
