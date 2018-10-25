package models;

public class Profile{

  private String firstName;
  private String lastName;
  private String username;
  private String password;
  private int age;

  public Profile(String firstName, String lastName, String username, String password, int age){
    this.firstName = firstName;
    this.lastName = lastName;
    this.username = username;
    this.password = password;
    this.age = age;
  }


}
