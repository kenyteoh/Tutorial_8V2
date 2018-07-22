public class Song {

    //Define relevant elements to go into the song object
    public String songTitle;
    public String songLocation;


    // Create the Song object based on the elements
    public Song (String songTitle,String songLocation){
        this.songTitle=songTitle;
        this.songLocation=songLocation;
    }

    //Accessor method to get song title
    public String getSongTitle() {
        return songTitle;
    }

    //Accessor method to get song location
    public String getSongLocation() {
        return songTitle;
    }
}