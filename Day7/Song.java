public class Song{
private String title;
private String artist;
private int durationSeconds;

public Song(String title, String artist, int durationSeconds) {
    this.title = title;
    this.artist = artist;
    this.durationSeconds = durationSeconds;
}
public Song() {
    this.title = "Unknown";
    this.artist = "Unknown";
    this.durationSeconds = 0;
}
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
public int getDurationSeconds() {
    return durationSeconds;
}
public void setDurationSeconds(int durationSeconds) {
this.durationSeconds = durationSeconds;
}
public double getDurationMinutes() {
    double duration = (double) durationSeconds / 60;
    return duration;
}
public String getArtistInitial() {
    String initial = artist.substring(0, 1);
    return initial;
}
public int getTitleLength() {
    int title_length = title.length();
    return title_length;
}
public String getLabel() {
    return title + "-" + artist;
}
public String toString() {
    return title + "by" + artist + durationSeconds;
}
public boolean equals(Song other) {
    boolean same = this.artist.equals(other.artist) && this.title.equals(other.title);
    return same;
}


}