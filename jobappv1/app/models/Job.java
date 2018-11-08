package models;

public class Job{
  private String title;
  private double salary;
  private String description;
  public Job(String title, String description, double salary){
    this.title = title;
    this.description = description;
    this.salary = salary;
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
}
