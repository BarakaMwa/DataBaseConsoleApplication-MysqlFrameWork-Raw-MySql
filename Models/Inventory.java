package com.sample;


public class Inventory {

  private long inventoryId;
  private long filmId;
  private long storeId;
  private java.sql.Timestamp lastUpdate;


  public long getInventoryId() {
    return inventoryId;
  }

  public void setInventoryId(long inventoryId) {
    this.inventoryId = inventoryId;
  }


  public long getFilmId() {
    return filmId;
  }

  public void setFilmId(long filmId) {
    this.filmId = filmId;
  }


  public long getStoreId() {
    return storeId;
  }

  public void setStoreId(long storeId) {
    this.storeId = storeId;
  }


  public java.sql.Timestamp getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(java.sql.Timestamp lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

}
