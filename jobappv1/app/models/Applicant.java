package models;

import java.io.File;

public class Applicant{
  private Profile user;
  private File resume;
  private String comments;

  public Applicant(Profile user, File resume, String comments){
    this.user = user;
    this.resume = resume;
    this.comments = comments;
  }
}
