package com.sample;


public class Country {

  private long countryId;
  private String country;
  private java.sql.Timestamp lastUpdate;


  public long getCountryId() {
    return countryId;
  }

  public void setCountryId(long countryId) {
    this.countryId = countryId;
  }


  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  public java.sql.Timestamp getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(java.sql.Timestamp lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

}
