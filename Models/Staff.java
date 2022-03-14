package com.sample;


public class Staff {

  private long staffId;
  private String firstName;
  private String lastName;
  private long addressId;
  private String picture;
  private String email;
  private long storeId;
  private long active;
  private String username;
  private String password;
  private java.sql.Timestamp lastUpdate;


  public long getStaffId() {
    return staffId;
  }

  public void setStaffId(long staffId) {
    this.staffId = staffId;
  }


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public long getAddressId() {
    return addressId;
  }

  public void setAddressId(long addressId) {
    this.addressId = addressId;
  }


  public String getPicture() {
    return picture;
  }

  public void setPicture(String picture) {
    this.picture = picture;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public long getStoreId() {
    return storeId;
  }

  public void setStoreId(long storeId) {
    this.storeId = storeId;
  }


  public long getActive() {
    return active;
  }

  public void setActive(long active) {
    this.active = active;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public java.sql.Timestamp getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(java.sql.Timestamp lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

}
