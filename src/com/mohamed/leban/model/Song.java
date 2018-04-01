package com.mohamed.leban.model;

public class Song
{
    private String artist;
    private String title;
    private String videoURL;

    public Song(String artist, String title, String videoURL)
    {
        this.artist = artist;
        this.title = title;
        this.videoURL = videoURL;
    }

    public String getArtist()
    {
        return artist;
    }

    public void setArtist(String artist)
    {
        this.artist = artist;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getVideoURL()
    {
        return videoURL;
    }

    public void setVideoURL(String videoURL)
    {
        this.videoURL = videoURL;
    }
}
