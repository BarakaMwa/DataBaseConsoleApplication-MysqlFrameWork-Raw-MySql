package com.sample;


public class Rental {

  private long rentalId;
  private java.sql.Timestamp rentalDate;
  private long inventoryId;
  private long customerId;
  private java.sql.Timestamp returnDate;
  private long staffId;
  private java.sql.Timestamp lastUpdate;


  public long getRentalId() {
    return rentalId;
  }

  public void setRentalId(long rentalId) {
    this.rentalId = rentalId;
  }


  public java.sql.Timestamp getRentalDate() {
    return rentalDate;
  }

  public void setRentalDate(java.sql.Timestamp rentalDate) {
    this.rentalDate = rentalDate;
  }


  public long getInventoryId() {
    return inventoryId;
  }

  public void setInventoryId(long inventoryId) {
    this.inventoryId = inventoryId;
  }


  public long getCustomerId() {
    return customerId;
  }

  public void setCustomerId(long customerId) {
    this.customerId = customerId;
  }


  public java.sql.Timestamp getReturnDate() {
    return returnDate;
  }

  public void setReturnDate(java.sql.Timestamp returnDate) {
    this.returnDate = returnDate;
  }


  public long getStaffId() {
    return staffId;
  }

  public void setStaffId(long staffId) {
    this.staffId = staffId;
  }


  public java.sql.Timestamp getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(java.sql.Timestamp lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

}
