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

    //Unit Tested
    public boolean searchArtist(String artist)
    {
        boolean artistFound = false;
        for(Song testSong: SongBook)
        {
            if(artist == testSong.getArtist())
            {
                artistFound = true;
                System.out.printf("%s has been found.");
            }
        }

        if(!artistFound)
        {
            System.out.println("No such user has been found.");
        }

        return artistFound;
    }






    //Unit Tested
    public void removeSong(String title)
    {
        if(title.equals(null) || title.equals(""))
        {
            throw new IllegalArgumentException("You can't remove a song without a title!");
        }

        else
        {
            boolean isRemoved = false;

            for(Song testSong: SongBook)
            {
                if(testSong.getTitle().equals(title))
                {
                    isRemoved = true;
                    SongBook.remove(testSong);
                    System.out.printf("The song %s has been removed! %n", testSong.getTitle());
                    break;
                }

                else
                {
                    continue;
                }
            }

            if(!isRemoved)
            {
                System.out.printf("%s is not in our list of songs... %n", title);
            }
        }

    }



}
