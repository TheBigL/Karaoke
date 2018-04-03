package com.mohamed.leban;

import com.mohamed.leban.model.*;

import java.util.List;

public class Main {

    public static void main(String[] args)
    {

        SongBook songBook = new SongBook();

        KaraokeMachine karaokeMachine = new KaraokeMachine(songBook);

        try {
            karaokeMachine.run();
        } catch (Exception e) {
            e.getMessage();
        }


    }
}
