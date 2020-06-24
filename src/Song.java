import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Song {
    private String title;
    private String artist;
    private String lyrics;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getLyrics() {
        return lyrics;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }

    public Song(String title, String artist, String lyrics){
        this.title = title;
        this.artist = artist;
        this.lyrics = lyrics;
    }

    public static List<String> parseLyrics(String lyrics) {
        List<String> parsedLyrics;
        String [] strArray = lyrics.split(" ");
        parsedLyrics = Arrays.asList(strArray);
        return parsedLyrics;
    }
}

