package src;

public class Keliling {
    private int panjangPersegi, alasSegitiga, tinggiSegitiga, panjangPersegiPanjang, lebarPersegiPanjang;

    public int kelilingPersegi (int panjang){
        this.setPersegi(panjang);

        return (this.panjangPersegi * 4);
    }

    private void setPersegi(int panjang){
        this.panjangPersegi = panjang;
    }

    public int kelilingSegitiga (int tinggi, int alas){
        this.setSegitiga(alas, tinggi);

        return (this.alasSegitiga * 3);
    }

    private void setSegitiga(int alas, int tinggi){
        this.alasSegitiga = alas;
        this.tinggiSegitiga = tinggi;
    }

    public int kelilingPersegiPanjang (int panjang, int lebar){
        this.setPersegiPanjang(panjang, lebar);

        return ((this.panjangPersegiPanjang + this.lebarPersegiPanjang) * 2);
    }

    private void setPersegiPanjang(int panjang, int lebar){
        this.panjangPersegiPanjang = panjang;
        this.lebarPersegiPanjang = lebar;
    }
}
