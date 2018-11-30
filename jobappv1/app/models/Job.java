package models;

import java.util.ArrayList;

public class Job{

  private String title;
  private double salary;
  private String description;
  private String company;
  private ArrayList<Applicant> appliedUsers;

  public Job(String title, String description, double salary, String company){

    this.title = title;
    this.description = description;
    this.salary = salary;
    this.company = company;
    this.appliedUsers = new ArrayList<>();

  }

  public String getTitle(){

    return title;

  }

  public double getSalary(){

    return salary;

  }

  public String getDescription(){

    return description;

  }

  public void setTitle(String title){

    this.title = title;

  }

  public void setDescription(String description){

    this.description = description;

  }

  public void setSalary(double salary){

    this.salary = salary;

  }

  public String getCompany(){
    return company;
  }

  public void setCompany(String company){
    this.company = company;
  }

  public ArrayList<Applicant> getApplicants(){
    return appliedUsers;
  }

}
