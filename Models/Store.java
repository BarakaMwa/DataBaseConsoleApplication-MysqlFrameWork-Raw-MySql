package com.sample;


public class Store {

  private long storeId;
  private long managerStaffId;
  private long addressId;
  private java.sql.Timestamp lastUpdate;


  public long getStoreId() {
    return storeId;
  }

  public void setStoreId(long storeId) {
    this.storeId = storeId;
  }


  public long getManagerStaffId() {
    return managerStaffId;
  }

  public void setManagerStaffId(long managerStaffId) {
    this.managerStaffId = managerStaffId;
  }


  public long getAddressId() {
    return addressId;
  }

  public void setAddressId(long addressId) {
    this.addressId = addressId;
  }


  public java.sql.Timestamp getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(java.sql.Timestamp lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

}
