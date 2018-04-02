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



    @BeforeAll
    public void setUp()
    {
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        menu = new HashMap<>();
        songBook = new SongBook();
        karaokeMachine = new KaraokeMachine(songBook);

    }



}