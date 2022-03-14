package com.sample;


public class City {

  private long cityId;
  private String city;
  private long countryId;
  private java.sql.Timestamp lastUpdate;


  public long getCityId() {
    return cityId;
  }

  public void setCityId(long cityId) {
    this.cityId = cityId;
  }


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  public long getCountryId() {
    return countryId;
  }

  public void setCountryId(long countryId) {
    this.countryId = countryId;
  }


  public java.sql.Timestamp getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(java.sql.Timestamp lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

}
