package com.sample;


public class Actor {

  private long actorId;
  private String firstName;
  private String lastName;
  private java.sql.Timestamp lastUpdate;


  public long getActorId() {
    return actorId;
  }

  public void setActorId(long actorId) {
    this.actorId = actorId;
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


  public java.sql.Timestamp getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(java.sql.Timestamp lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

}
