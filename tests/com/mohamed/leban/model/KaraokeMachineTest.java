package com.mohamed.leban.model;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import javax.annotation.processing.Generated;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class KaraokeMachineTest
{
    private SongBook songBook;
    private BufferedReader bufferedReader;
    private HashMap<String, String> menu;
    KaraokeMachine karaokeMachine;
    SongBook songList;
    Song mockSong, mockSong2, mockSong3, mockSong4, mockSong5;



    @BeforeAll
    public void setUp()
    {
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        menu = new HashMap<>();
        songBook = new SongBook();
        karaokeMachine = new KaraokeMachine(songBook);
        mockSong = new Song("Village People", "Macho Man", "https://www.youtube.com/watch?v=rV6gYFKrT7Y");
        mockSong2 = new Song("Dr. Dre", "Still DRE", "https://www.youtube.com/watch?v=x7yPhExdj3E");
        mockSong3 = new Song("Ice Cube", "Check Yo Self", "https://www.youtube.com/watch?v=5aAbOgdbTbM");
        mockSong4 = new Song("Bruno Mars", "24K Magic", "https://www.youtube.com/watch?v=UqyT8IEBkvY");
        mockSong5 = new Song("Eric Clapton", "Change The World", "https://www.youtube.com/watch?v=x11NA63gLDM");

        try {
            songList.addSong(mockSong);
            songList.addSong(mockSong2);
            songList.addSong(mockSong3);
            songList.addSong(mockSong4);
            songList.addSong(mockSong5);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }





}