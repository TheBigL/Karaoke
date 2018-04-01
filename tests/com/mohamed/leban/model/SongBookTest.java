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
        songList = new SongBook();
        mockSong = new Song("Ice Cube", "The Nigga you love to hate", "https://www.youtube.com/watch?v=UN2D9yct2tY");
    }


    @Test
    @Generated("Test adding the songs!")
    public void addSongTest()
    {
        songList.addSong(mockSong);
        assertEquals(songList.getSongBookSize(), 1, "The test works!");
    }

    @Test
    @Generated("Get the SongBook size!")
    public void searchArtist()
    {
        mockSong = new Song("Ice Cube", "No Vaseline", "https://www.youtube.com/watch?v=Zi_XLOBDo_Y");
        songList.addSong(mockSong);
        boolean artistFound = songList.searchArtist("Ice Cube");
        assertTrue(artistFound, "Artist not found...");
    }

}