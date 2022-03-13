package src;

public class Main extends HitungOngkosKirim{
    public static void main(String[] args) {
        HitungOngkosKirim objHOK = new HitungOngkosKirim();

        objHOK.panjang = 5;
        objHOK.lebar = 2;
        objHOK.tinggi = 4;
        objHOK.berat = 1;

        System.out.println("Harga : Rp " + objHOK.hitung());
    }
}
