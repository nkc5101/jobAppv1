package controllers;

public class DocData{
  private String name;

  public DocData(){

  }

  public DocData(String name){
    this.name = name;
  }

  public String getName(){
    return name;
  }

  public void setName(String name){
    this.name = name;
  }
}
