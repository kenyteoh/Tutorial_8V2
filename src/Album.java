public class Album {

    //Define relevant elements to go into the Album object
    public String albumName;
    public int albumNumberOfSongs;

    //Create Album object and create array of songs within it
    public Album() {

        //Create array of songs
        Song[] songArray = new Song[albumNumberOfSongs];

        // Build array based on default names and locations
        int i=0;
        while (i<albumNumberOfSongs) {
            songArray[i] = new Song("NAME", "LOCATION");
            i++;
        }
    }

    public addSong () {
        int i=0;
        int j=1;
        while (i<albumNumberOfSongs){
            String songTitle ="songNAME";
            String songLocation = "songLOCATION";
            Album   = new Song (songTitle,songLocation);

        }




    }

    // Method to search for a song
    public String getSongByTitle () {

    }
}