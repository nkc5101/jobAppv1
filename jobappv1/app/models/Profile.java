package models;

public class Profile{

  private String firstName;
  private String lastName;
  private String username;
  private String password;
  private int age;
  private String biography;

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

  public String getFirstName(){
    
    return firstName;
  
  }

  public String getLastName(){
    
    return lastName;
  
  }

  public String getUsername(){
    
    return username;
  
  }

  public String getPassword(){
    
    return password;
  
  }

  public int getAge(){
    
    return age;
  
  }

  public String getBiography(){
    
    return biography;
  
  }

}
