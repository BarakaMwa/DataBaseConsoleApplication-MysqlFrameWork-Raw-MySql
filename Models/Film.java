package com.sample;


public class Film {

  private long filmId;
  private String title;
  private String description;
  private String releaseYear;
  private long languageId;
  private long originalLanguageId;
  private long rentalDuration;
  private double rentalRate;
  private long length;
  private double replacementCost;
  private String rating;
  private String specialFeatures;
  private java.sql.Timestamp lastUpdate;


  public long getFilmId() {
    return filmId;
  }

  public void setFilmId(long filmId) {
    this.filmId = filmId;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public String getReleaseYear() {
    return releaseYear;
  }

  public void setReleaseYear(String releaseYear) {
    this.releaseYear = releaseYear;
  }


  public long getLanguageId() {
    return languageId;
  }

  public void setLanguageId(long languageId) {
    this.languageId = languageId;
  }


  public long getOriginalLanguageId() {
    return originalLanguageId;
  }

  public void setOriginalLanguageId(long originalLanguageId) {
    this.originalLanguageId = originalLanguageId;
  }


  public long getRentalDuration() {
    return rentalDuration;
  }

  public void setRentalDuration(long rentalDuration) {
    this.rentalDuration = rentalDuration;
  }


  public double getRentalRate() {
    return rentalRate;
  }

  public void setRentalRate(double rentalRate) {
    this.rentalRate = rentalRate;
  }


  public long getLength() {
    return length;
  }

  public void setLength(long length) {
    this.length = length;
  }


  public double getReplacementCost() {
    return replacementCost;
  }

  public void setReplacementCost(double replacementCost) {
    this.replacementCost = replacementCost;
  }


  public String getRating() {
    return rating;
  }

  public void setRating(String rating) {
    this.rating = rating;
  }


  public String getSpecialFeatures() {
    return specialFeatures;
  }

  public void setSpecialFeatures(String specialFeatures) {
    this.specialFeatures = specialFeatures;
  }


  public java.sql.Timestamp getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(java.sql.Timestamp lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

}
