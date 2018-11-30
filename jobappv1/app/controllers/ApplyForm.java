package controllers;

import java.io.File;
import play.data.validation.Constraints;

public class ApplyForm{

  @Constraints.Required
  private File resume;

  @Constraints.Required
  private String comments;

  public File getResume(){
    return resume;
  }

  public String getComments(){
    return comments;
  }

  public void setResume(File resume){
    this.resume = resume;
  }

  public void setComments(String comments){
    this.comments = comments;
  }

}
