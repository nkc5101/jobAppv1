package controllers;

import play.data.validation.Constraints;

public class SearchForm{
  @Constraints.Required
  private String searchTerms;

  public String getSearchTerms(){
    return searchTerms;
  }

  public void setSearchTerms(String searchTerms){
    this.searchTerms = searchTerms;
  }
}
