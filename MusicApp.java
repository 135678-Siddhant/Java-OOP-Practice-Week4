class Song {
    private String title;
    private String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() { return title; }
    public String getArtist() { return artist; }

    public void play() {
        System.out.println("Playing audio tracking: " + title);
    }
}

class PopSong extends Song {
    public PopSong(String title, String artist) { super(title, artist); }

    @Override
    public void play() {
        System.out.println("Playing upbeat pop: '" + getTitle() + "' by " + getArtist() + " [Synth Hooks active]");
    }
}

class RockSong extends Song {
    public RockSong(String title, String artist) { super(title, artist); }

    @Override
    public void play() {
        System.out.println("Playing rock anthem: '" + getTitle() + "' by " + getArtist() + " [Guitars Max Overdrive!]");
    }
}

class JazzSong extends Song {
    public JazzSong(String title, String artist) { super(title, artist); }

    @Override
    public void play() {
        System.out.println("Playing smooth jazz: '" + getTitle() + "' by " + getArtist() + " [Saxophone Solo running]");
    }
}

public class MusicApp {
    public static void main(String[] args) {
        Song[] playlist = {
            new PopSong("Blinding Lights", "The Weeknd"),
            new RockSong("Back in Black", "AC/DC"),
            new JazzSong("Take Five", "Dave Brubeck")
        };

        for (Song track : playlist) {
            track.play();
        }
    }
}