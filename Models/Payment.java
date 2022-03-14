package com.sample;


public class Payment {

  private long paymentId;
  private long customerId;
  private long staffId;
  private long rentalId;
  private double amount;
  private java.sql.Timestamp paymentDate;
  private java.sql.Timestamp lastUpdate;


  public long getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(long paymentId) {
    this.paymentId = paymentId;
  }


  public long getCustomerId() {
    return customerId;
  }

  public void setCustomerId(long customerId) {
    this.customerId = customerId;
  }


  public long getStaffId() {
    return staffId;
  }

  public void setStaffId(long staffId) {
    this.staffId = staffId;
  }


  public long getRentalId() {
    return rentalId;
  }

  public void setRentalId(long rentalId) {
    this.rentalId = rentalId;
  }


  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }


  public java.sql.Timestamp getPaymentDate() {
    return paymentDate;
  }

  public void setPaymentDate(java.sql.Timestamp paymentDate) {
    this.paymentDate = paymentDate;
  }


  public java.sql.Timestamp getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(java.sql.Timestamp lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

}
