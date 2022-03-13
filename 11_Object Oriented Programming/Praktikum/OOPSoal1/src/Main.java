package src;

public class Main extends Luas {
    public static void main(String[] args) {
        Main objMain = new Main();
        System.out.println("Luas");
        System.out.println("Persegi : " + objMain.luasPersegi(4));
        System.out.println("Segitiga : " + objMain.luasSegitiga(3,4));
        System.out.println("Persegi Panjang : " + objMain.luasPersegiPanjang(7,8));

        System.out.println("Keliling");
        System.out.println("Persegi : " + objMain.kelilingPersegi(4));
        System.out.println("Segitiga : " + objMain.kelilingSegitiga(3,4));
        System.out.println("Persegi Panjang : " + objMain.kelilingPersegiPanjang(7,8));
    }
}