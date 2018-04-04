package com.mohamed.leban.model;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.function.Executable;

import javax.annotation.processing.Generated;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SongBookTest
{

    SongBook songList;
    List<Song> listOfSongs;
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


    //Test Passed! :thumbsup:
    @Test
    @Generated("Test adding the songs!")
    public void addSongTest() throws Exception {
        Song testSong = new Song("Hi Tide Harris", "Bison's Dream", "https://www.youtube.com/watch?v=dx9a2gYZu4Y&t=95s");
        songList.addSong(testSong);
        assertEquals(songList.getSongBookSize(), 6, "The expected song book size test failed...");
    }
/*
Exception Handling Testing
Keep in mind that I am using JUnit5 to build these Unit Tests.

*/

    //Test Passed! :thumbsup:
    @Test
    public void cantAddSongWithoutAnArtist() throws Exception
    {
        Song noArtist = new Song("", "Unknown Song", "https://www.youtube.com/");
        assertThrows(IllegalArgumentException.class, () -> {songList.addSong(noArtist);});
    }


    //Test Passed! :thumbsup:
    @Test
    public void cantAddSongWithoutATitle() throws Exception
    {
        Song noTitle = new Song("Dr. Dre", "", "https://www.youtube.com/watch?v=qg4NkA1B9Pc");
        assertThrows(IllegalArgumentException.class, ()-> {songList.addSong(noTitle);});

    }

    //Test Passed! :thumbsup:
    @Test
    public void cantAddSongWithoutAVideoURL() throws Exception
    {
        Song noURL = new Song("Dr. Dre", "Forgot About Dre", "");
        assertThrows(IllegalArgumentException.class, () -> {songList.addSong(noURL);});
    }

    //Test Passed! :thumbsup:
    @Test
    @Generated("Confirm that a certain Artist is on the Songbook List")
    public void searchArtist() throws Exception {
        boolean artistFound = songList.searchArtist("Ice Cube");
        assertTrue(artistFound, "Artist not found...");
    }


    //Test Passed! :thumbsup:
    @Test
    @Generated("Bring up the Song List")
    public void removeSongByTitle()
    {
        songList.removeSong("Still DRE");
        assertEquals(songList.getSongBookSize(), 4, "Song hasn't been removed from the Song Book");

    }

    //Test Passed! :thumbsup:
    @Test
    public void cantRemoveSongWithoutTitle() throws Exception
    {
        assertThrows(IllegalArgumentException.class, () -> {songList.removeSong("");});
    }

    //Test Passed! :Thumbsup:
    @Test
    public void cantRemoveSongIfTitleIsWrong()
    {
        songList.removeSong("Chunky");
        assertEquals(songList.getSongBookSize(), 5, "Oh Snap! Song has been removed!");
    }



}