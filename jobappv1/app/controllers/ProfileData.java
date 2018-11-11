package controllers;

import play.data.validation.Constraints;

public class ProfileData{

  @Constraints.Required
  private String firstName;

  @Constraints.Min(0)
  private int age;

  @Constraints.Required
  private String lastName;

  @Constraints.Required
  private String username;

  @Constraints.Required
  private String password;

  @Constraints.Required
  private String biography;

  public void setFirstName(String firstName){
    
    this.firstName = firstName;
  
  }

  public void setLastName(String LastName){
    
    this.lastName = LastName;
  
  }

  public void setUsername(String username){
    
    this.username = username;
  
  }

  public void setPassword(String password){
    
    this.password = password;
  
  }

  public void setAge(int age){
    
    this.age = age;
  
  }

  public void setBiography(String biography){
    
    this.biography = biography;
  
  }

  public int getAge(){
    
    return age;
  
  }

  public String getPassword(){
    
    return password;
  
  }

  public String getUsername(){
    
    return username;
  
  }

  public String getLastName(){
    
    return lastName;
  
  }

  public String getFirstName(){
    
    return firstName;
  
  }

  public String getBiography(){
    
    return biography;
  
  }

}
