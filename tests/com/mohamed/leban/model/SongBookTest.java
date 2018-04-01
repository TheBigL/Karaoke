package com.mohamed.leban.model;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import com.mohamed.leban.model.Song;

import javax.annotation.processing.Generated;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SongBookTest
{
    SongBook songList;
    private Song mockSong;

    @BeforeAll
    public void setUp()
    {
        //Adding various songs to the SongBook
        //色々な歌を唱歌集に追加する
        songList = new SongBook();
        mockSong = new Song("Ice Cube", "The Nigga you love to hate", "https://www.youtube.com/watch?v=UN2D9yct2tY");
        songList.addSong(mockSong);
        Song mockSong2 = new Song("Dr. Dre", "Still DRE", "https://www.youtube.com/watch?v=x7yPhExdj3E");
        songList.addSong(mockSong2);
        Song mockSong3 = new Song("Ice Cube", "Check Yo Self", "https://www.youtube.com/watch?v=5aAbOgdbTbM");
        songList.addSong(mockSong3);
        Song mockSong4 = new Song("Bruno Mars", "24K Magic", "https://www.youtube.com/watch?v=UqyT8IEBkvY");
        songList.addSong(mockSong4);
        Song mockSong5 = new Song("Eric Clapton", "Change The World", "https://www.youtube.com/watch?v=x11NA63gLDM");
        songList.addSong(mockSong5);
    }


    @Test
    @Generated("Test adding the songs!")
    public void addSongTest()
    {
        songList.addSong(mockSong);
        assertEquals(songList.getSongBookSize(), 1, "The expected song book size test failed...");
    }

    @Test
    @Generated("Confirm that a certain Artist is on the Songbook List")
    public void searchArtist()
    {
        songList.addSong(mockSong);
        boolean artistFound = songList.searchArtist("Ice Cube");
        assertTrue(artistFound, "Artist not found...");
    }

    @Test
    @Generated("Get Individual Song by Artist")
    public void getSongByTitle()
    {



    }

    @Test
    @Generated("Bring up the Song List")
    public void removeSongByTitle()
    {
        assertTrue(songList.removeSong("Macho Man"), "That song doesn't exist on the Songbook.");

    }

}