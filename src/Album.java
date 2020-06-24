import java.util.List;

public class Album {
    private String name;
    private List<Song> songs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public Album(String name, List<Song> songs){
        this.name = name;
        this.songs = songs;
    }
    public void printTrackListings(List<Song> songs){
        int num = 1;
        for(Song song : songs){
            System.out.println(num++ + ". " +  song.getTitle() + " by " + song.getArtist());
        }
    }
}
