import javax.swing.*;

public class MusicLibrary {

    public static void main(String[] args) {
        setAlbum();

    }

    // Method to create a new Album object from user input
    public static String setAlbum() {
        String albumTitle2 = InputOutputAndValidation.getInput("What is the title of the album?");
        int albumNumberOfSongs = InputOutputAndValidation.getIntInputAndValidate("How many songs are there in the album?");
        return albumTitle2;
    }
}
    /*
    // Method to add Song to an Album
    public String getAlbumByTitle () {

    }

    // Method to add Song to an Album
    public String loadAlbums () {

    }

    // Method to add Song to an Album
    public String loadSongs () {

    }

    // Method to add Song to an Album
    public String playSongs () {

    }
    */

