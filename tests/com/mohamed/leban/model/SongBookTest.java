package com.mohamed.leban.model;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.function.Executable;

import javax.annotation.processing.Generated;
import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SongBookTest
{

    SongBook songList;
    private Song mockSong, mockSong2, mockSong3, mockSong4, mockSong5;

    @BeforeAll
    public void setUp() throws Exception {
        //Adding various songs to the SongBook
        //色々な歌を唱歌集に追加する
        songList = new SongBook();
        mockSong = new Song("Village People", "Macho Man", "https://www.youtube.com/watch?v=rV6gYFKrT7Y");
        songList.addSong(mockSong);
        mockSong2 = new Song("Dr. Dre", "Still DRE", "https://www.youtube.com/watch?v=x7yPhExdj3E");
        songList.addSong(mockSong2);
        mockSong3 = new Song("Ice Cube", "Check Yo Self", "https://www.youtube.com/watch?v=5aAbOgdbTbM");
        songList.addSong(mockSong3);
        mockSong4 = new Song("Bruno Mars", "24K Magic", "https://www.youtube.com/watch?v=UqyT8IEBkvY");
        songList.addSong(mockSong4);
        mockSong5 = new Song("Eric Clapton", "Change The World", "https://www.youtube.com/watch?v=x11NA63gLDM");
        songList.addSong(mockSong5);
    }


    @Test
    @Generated("Test adding the songs!")
    public void addSongTest()
    {

        assertEquals(songList.getSongBookSize(), 5, "The expected song book size test failed...");
    }

    @Test
    public void noSongWithoutAnArtist() throws Exception
    {
        Song noArtist = new Song("", "Unknown Song", "https://www.youtube.com/");
        assertThrows(IllegalArgumentException.class, () -> {songList.addSong(noArtist);});
    }


    @Test
    public void noSongWithoutATitle() throws Exception
    {
        Song noTitle = new Song("Dr. Dre", "", "https://www.youtube.com/watch?v=qg4NkA1B9Pc");
        assertThrows(IllegalArgumentException.class, ()-> {songList.addSong(noTitle);});

    }

    @Test
    public void noSongWithoutAVideoURL() throws Exception
    {
        Song noURL = new Song("Dr. Dre", "Forgot About Dre", "");
        assertThrows(IllegalArgumentException.class, () -> {songList.addSong(noURL);});
    }

    @Test
    @Generated("Confirm that a certain Artist is on the Songbook List")
    public void searchArtist() throws Exception {
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
        songList.removeSong(mockSong2.getTitle());
        assertNull(mockSong2, "Song has not been removed");

    }

    @AfterAll
    public void destroyAll()
    {


    }

}