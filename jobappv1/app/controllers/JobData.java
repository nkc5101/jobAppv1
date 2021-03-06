package controllers;

import play.data.validation.Constraints;

public class JobData{

  @Constraints.Required
  private String title;

  @Constraints.Required
  private String description;

  @Constraints.Min(0)
  private double salary;

  @Constraints.Required
  private String company;

  public void setTitle(String title){

    this.title = title;

  }

  public void setDescription(String description){

    this.description = description;

  }

  public void setSalary(double salary){

    this.salary = salary;

  }

  public double getSalary(){

    return salary;

  }

  public String getDescription(){

    return description;

  }

  public String getTitle(){

    return title;

  }

  public void setCompany(String company){
    this.company = company;
  }

  public String getCompany(){
    return company;
  }

}
