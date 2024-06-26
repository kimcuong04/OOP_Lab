package hust.soict.ict.aims.media;
import hust.soict.ict.aims.media.Disc;

public class DigitalVideoDisc extends Disc implements Playable {
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, cost, director);
        this.length = length;
    }

    public boolean isMatch(String title) {
        title = title.toLowerCase();
        String[] words = title.split(" ");
        for (String word : words) {
            if (this.title.toLowerCase().contains(word)) {
                return true;
            }
        }
        return false;
    }

    public void play() {
        System.out.println("Playing DVD: " + this.title);
        System.out.println("DVD length: " + this.length);
    }

    public String toString() {
        return "DVD - " + this.id + " - " + this.title + " - " + this.category + " - " + this.director + " - " + this.length + " - " + this.cost + "$";
    }
}
