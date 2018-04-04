package com.mohamed.leban.model;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KaraokeMachine
{
    private SongBook songBook;
    private BufferedReader bufferedReader;
    private HashMap<String, String> menu;

    public KaraokeMachine(SongBook songBook)
    {
        this.songBook = songBook;
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        menu = new HashMap<String, String>();
        menu.put("add", "Add a song to the Songbook");
        menu.put("delete", "Delete a song from the Songbook");
        menu.put("quit", "Add");
    }

    private String promptAction() throws IOException
    {
        System.out.printf("There are %d available. The songs available are: %n");
        for(Map.Entry<String, String> option: menu.entrySet() )
        {
            System.out.printf("%s - %s %n", option.getKey(), option.getValue());
        }

        System.out.println("What do you want to sing!");
        String choice = bufferedReader.readLine();
        return choice.trim().toLowerCase();

    }

    public void run()
    {
        String choice = "";
        do
        {
            try
            {
                choice = promptAction();
                switch (choice)
                {
                    case "add":
                        Song newSong = addSong();
                        try {
                            songBook.addSong(newSong);
                            System.out.printf("The song %s has been added!", newSong.getTitle());
                        } catch (Exception e) {
                            e.getMessage();
                        }

                    case "delete":
                        //TODO: Delete a song

                    case "sing":
                        //TODO: Add a method in which the user can perform a copypasta on the URL

                    case "quit":
                        System.out.println("Thanks for playing!%n I hope you play again sometime.%n");
                        break;

                }


            }

            catch (IOException e)
            {
                System.out.println("Something's up with the input");
                e.printStackTrace();
            }

        }
        while (!choice.equals("quit"));

        System.exit(0);

    }







    private Song addSong() throws IOException
    {
        System.out.println("Enter an Artist's name");
        String artist = bufferedReader.readLine();
        System.out.println("Enter the song title");
        String title = bufferedReader.readLine();
        System.out.println("Enter the URL for the song");
        String url = bufferedReader.readLine();
        Song newSong = new Song(artist, title, url);
        return newSong;
    }
}
