package com.sample;


public class FilmCategory {

  private long filmId;
  private long categoryId;
  private java.sql.Timestamp lastUpdate;


  public long getFilmId() {
    return filmId;
  }

  public void setFilmId(long filmId) {
    this.filmId = filmId;
  }


  public long getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(long categoryId) {
    this.categoryId = categoryId;
  }


  public java.sql.Timestamp getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(java.sql.Timestamp lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

}
