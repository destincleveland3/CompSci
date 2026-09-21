public class SongTester {
    public static void main(String[] args) {
        
   
Song song1 = new Song("Blinding Lights", "The Weeknd", 180);
double minutes = song1.getDurationMinutes();     // expected: 3.0
String initial = song1.getArtistInitial();       // expected: T
int titleLen   = song1.getTitleLength();          // expected: 15

System.out.println("Duration in minutes: " + minutes);
System.out.println("Artist initial: " + initial);
System.out.println("Title length: " + titleLen);

Song a = new Song("Blinding Lights", "The Weeknd", 180);
Song b = new Song("Blinding Lights", "The Weeknd", 180);
System.out.println(a == b);        // false - different objects
System.out.println(a.equals(b));   // true  - same title and artist

}
}