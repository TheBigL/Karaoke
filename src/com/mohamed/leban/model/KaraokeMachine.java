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
        if(songBook.getSongBookSize() > 0)
        {
            menu.put("sing", "Sing a song from the list");
            menu.put("delete", "Delete a song from the Songbook");
        }
        menu.put("quit", "Quit and turn off the Karaoke Machine.");
    }

    private String promptAction() throws IOException
    {
        System.out.printf("There are %d songs available.%n", songBook.getSongBookSize());
        for(Map.Entry<String, String> option: menu.entrySet() )
        {
            System.out.printf("%s - %s %n", option.getKey(), option.getValue());
        }

        System.out.println("What do you want do?\n");
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
                            menu.put("sing", "Sing a song from the list");
                            menu.put("delete", "Delete a song from the Songbook");
                            break;
                        } catch (Exception e) {
                            e.getMessage();
                        }

                    case "delete":
                        //TODO: Delete a song
                        deleteSong();
                        if(songBook.getSongBookSize() == 0)
                        {
                            menu.remove("delete");
                            menu.remove("sing");
                        }


                    case "sing":
                        //TODO: Add a method in which the user can perform a copypasta on the URL
                        pickSong();

                    case "quit":
                        System.out.println("Thanks for playing!\n I hope you play again sometime.\n");
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

    private void pickSong() throws IOException
    {
        Song song = null;
        System.out.println("What do you want to sing?");
        for(Song pickSong: songBook.SongBook)
        {
            System.out.printf("%s - %s\n", pickSong.getTitle(), pickSong.getArtist());
        }
        do
        {
            System.out.println("Select a song!\n If you want to go back to the main menu, type 'quit' or 'exit'");
            String selectedSong = bufferedReader.readLine();
            if(selectedSong == "quit".toLowerCase().trim() || selectedSong == "exit".toLowerCase().trim())
            {
                run();
                break;
            }
            song = songBook.findSong(selectedSong);
            if(song == null)
            {
                System.out.println("The song needs to exist first!");
            }


        }
        while (song == null);



        System.out.printf("Here's the link: \n %s\n Enjoy!", song.getVideoURL());



    }

    private void deleteSong() throws IOException {
        System.out.println("What's the song's title?");
        String deleteTitle = bufferedReader.readLine();
        songBook.removeSong(deleteTitle);
    }
}
