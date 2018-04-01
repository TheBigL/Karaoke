package com.mohamed.leban.model;

import java.util.ArrayList;
import java.util.List;

class SongBook
{
    List<Song> SongBook;

    SongBook() {
        SongBook = new ArrayList<Song>();
    }


    void addSong(Song song)
    {
        SongBook.add(song);
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




    //TODO: Create a method to remove a song from a list.
    public boolean removeSong(String title)
    {
        boolean songExists = false;
        for(Song testSong: SongBook)
        {
            if(testSong.getTitle().equals(title))
            {
                songExists = true;
                SongBook.remove(testSong);
                break;
            }
        }

        return songExists;
    }



}
