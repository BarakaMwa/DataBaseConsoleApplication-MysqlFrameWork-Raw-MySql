package com.sample;


public class FilmActor {

  private long actorId;
  private long filmId;
  private java.sql.Timestamp lastUpdate;


  public long getActorId() {
    return actorId;
  }

  public void setActorId(long actorId) {
    this.actorId = actorId;
  }


  public long getFilmId() {
    return filmId;
  }

  public void setFilmId(long filmId) {
    this.filmId = filmId;
  }


  public java.sql.Timestamp getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(java.sql.Timestamp lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

}
