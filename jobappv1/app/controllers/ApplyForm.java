package controllers;

import java.io.File;
import play.data.validation.Constraints;

public class ApplyForm{

  @Constraints.Required
  private String resume;



  public String getResume(){
    return resume;
  }



  public void setResume(String resume){
    this.resume = resume;
  }


}
