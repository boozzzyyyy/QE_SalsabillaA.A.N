package src;

public class Main extends Volume {
    public static void main(String[] args) {
        Main objMain = new Main();
        System.out.println("Volume");
        System.out.println("Kubus : " + objMain.volumeKubus(10));
        System.out.println("Balok : " + objMain.volumeBalok(3, 6, 10));
        System.out.println("Tabung : " + objMain.volumeTabung(7, 10));
    }
}