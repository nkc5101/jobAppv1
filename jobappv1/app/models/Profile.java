package models;

public class Profile{

  public String firstName;
  public String lastName;
  public String username;
  public String password;
  public int age;
  public String biography;

  public Profile(String firstName, String lastName, String username, String password, int age, String biography){
    this.firstName = firstName;
    this.lastName = lastName;
    this.username = username;
    this.password = password;
    this.age = age;
    this.biography = biography;
  }

  public boolean authenticate(String username, String password){
    if(this.username.equals(username) && this.password.equals(password)){
      return true;
    } else{
      return false;
    }
  }

}
