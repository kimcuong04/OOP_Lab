package hust.soict.ict.test.disc;
import hust.soict.ict.aims.media.DigiVideoDisc;
public class TestPassingParameter {
    public static void main(String[] args) {
        DigiVideoDisc jungleDVD = new DigiVideoDisc("Jungle");
        DigiVideoDisc cinderellaDVD = new DigiVideoDisc("Cinderella");
        swap(jungleDVD, cinderellaDVD);
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
    }
    public static void swap(Object o1, Object o2) {
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }
    public static void changeTitle(DigiVideoDisc dvd, String title) {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigiVideoDisc(oldTitle);
    }
}
