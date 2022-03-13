package src;

public class Main extends Kalkulator{
    public static void main(String[] args) {
        Kalkulator objKal = new Kalkulator();

        objKal.angka1 = 3;
        objKal.angka2 = 4;
        System.out.println("Penjumlahan : " + objKal.Penjumlahan());

        objKal.angka1 = 15;
        objKal.angka2 = 4;
        System.out.println("Pengurangan : " + objKal.Pengurangan());

        objKal.angka1 = 10;
        objKal.angka2 = 10;
        System.out.println("Perkalian : " + objKal.Perkalian());

        objKal.angka1 = 12;
        objKal.angka2 = 3;
        System.out.println("Pembagian : " + objKal.Pembagian());
    }
}
