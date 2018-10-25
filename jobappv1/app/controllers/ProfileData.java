package controllers;

public class ProfileData{
  @Constraints.Required
  private String firstName;

  @Constraints.Min(0)
  @Constraints.Required
  private int age;

  @Constraints.Required
  private String lastName;

  @Constraints.Required
  private String username;

  @Constraints.Required
  private Sting password;

  
}
