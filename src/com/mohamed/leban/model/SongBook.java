package com.mohamed.leban.model;

import java.util.ArrayList;
import java.util.List;

public class SongBook
{
    List<Song> SongBook;

    public SongBook() {
        SongBook = new ArrayList<Song>();
    }


    public void addSong(Song song)
    {
        SongBook.add(song);
    }

    public int getSongBookSize()
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


}
