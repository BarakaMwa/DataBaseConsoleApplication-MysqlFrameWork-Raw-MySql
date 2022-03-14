package com.sample;


public class Address {

  private long addressId;
  private String address;
  private String address2;
  private String district;
  private long cityId;
  private String postalCode;
  private String phone;
  private String location;
  private java.sql.Timestamp lastUpdate;


  public long getAddressId() {
    return addressId;
  }

  public void setAddressId(long addressId) {
    this.addressId = addressId;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }


  public String getDistrict() {
    return district;
  }

  public void setDistrict(String district) {
    this.district = district;
  }


  public long getCityId() {
    return cityId;
  }

  public void setCityId(long cityId) {
    this.cityId = cityId;
  }


  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }


  public java.sql.Timestamp getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(java.sql.Timestamp lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

}
