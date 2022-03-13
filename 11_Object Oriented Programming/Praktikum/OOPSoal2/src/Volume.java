package src;

public class Volume {
    private int sisiKubus, panjangBalok, lebarbalok, tinggiBalok, jarijariTabung, tinggiTabung;

    public int volumeKubus (int sisi){
        this.setKubus(sisi);

        return (this.sisiKubus * this.sisiKubus * this.sisiKubus);
    }

    private void setKubus(int sisi){
        this.sisiKubus = sisi;
    }

    public int volumeBalok (int panjang, int lebar, int tinggi){
        this.setBalok(panjang, lebar, tinggi);

        return (this.panjangBalok * this.lebarbalok * this.tinggiBalok);
    }

    private void setBalok(int panjang, int lebar, int tinggi){
        this.panjangBalok = panjang;
        this.lebarbalok = lebar;
        this.tinggiBalok = tinggi;
    }

    public int volumeTabung (int jarijari, int tinggi){
        this.setTabung(jarijari, tinggi);

        return ((22 * this.jarijariTabung * this.jarijariTabung * this.tinggiTabung) / 7);
    }

    private void setTabung(int jarijari, int tinggi){
        this.jarijariTabung = jarijari;
        this.tinggiTabung = tinggi;
    }
}
