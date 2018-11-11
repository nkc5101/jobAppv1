package models;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Document{
  private String name;
  private File file;

  public Document(String name, File file){
    this.name = name;
    this.file = file;
  }

  public String getName(){
    return name;
  }

  public File getFile(){
    return file;
  }

  public void setName(String name){
    this.name = name;
  }

  public void setFile(File file){
    this.file = file;
  }
}
