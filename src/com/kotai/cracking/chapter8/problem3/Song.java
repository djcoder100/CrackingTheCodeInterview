package com.kotai.cracking.chapter8.problem3;

import lombok.Data;

@Data
public class Song {
  private String id;
  private String title;
  private String artist;
  private long length;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getArtist() {
    return artist;
  }

  public void setArtist(String artist) {
    this.artist = artist;
  }

  public long getLength() {
    return length;
  }

  public void setLength(long length) {
    this.length = length;
  }


}
