package models;

public class Profile{

  public String firstName;
  public String lastName;
  public String username;
  public String password;
  public int age;

  public Profile(String firstName, String lastName, String username, String password, int age){
    this.firstName = firstName;
    this.lastName = lastName;
    this.username = username;
    this.password = password;
    this.age = age;
  }


}
