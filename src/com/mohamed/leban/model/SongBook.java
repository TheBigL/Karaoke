package com.mohamed.leban.model;

import java.util.ArrayList;
import java.util.List;

public class SongBook
{
    List<Song> SongBook;

    public SongBook() {
        SongBook = new ArrayList<Song>();
    }


    void addSong(Song song) throws Exception
    {
        if(song.getArtist().equals(null) || song.getArtist().equals(""))
        {
            throw new IllegalArgumentException("You gotta add an artist to the list!");
        }

        else if(song.getTitle().equals(null) || song.getTitle().equals(""))
        {
            throw new IllegalArgumentException("You gotta add an artist to track you're trying to add!");
        }

        else if (song.getVideoURL().equals(null) || song.getVideoURL().equals(""))
        {
            throw new IllegalArgumentException("You gotta add a video URL to the track you're trying to add!");
        }
        else
        {
        SongBook.add(song);
        }

    }

    int getSongBookSize()
    {
        return SongBook.size();
    }

    public boolean searchArtist(String artist)
    {
        boolean artistFound = false;
        for(Song testSong: SongBook)
        {
            if(artist == testSong.getArtist())
            {
                artistFound = true;
            }
        }

        return artistFound;
    }





    public void removeSong(String title)
    {

        for(Song testSong: SongBook)
        {
            if(title.equals(testSong.getTitle()))
            {
                SongBook.remove(testSong);
                System.out.printf("The song %s has been removed!", testSong.getTitle());
                break;
            }
        }

        System.out.printf("%s is not in our list of songs...", title);


    }



}
