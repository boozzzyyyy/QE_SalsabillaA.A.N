package src;

public class Luas extends Keliling {
    private int panjangPersegi, alasSegitiga, tinggiSegitiga, panjangPersegiPanjang, lebarPersegiPanjang;

    public int luasPersegi (int panjang){
        this.setPersegi(panjang);

        return (this.panjangPersegi * this.panjangPersegi);
    }

    private void setPersegi(int panjang){
        this.panjangPersegi = panjang;
    }

    public int luasSegitiga (int tinggi, int alas){
        this.setSegitiga(alas, tinggi);

        return ((this.alasSegitiga * this.tinggiSegitiga) / 2);
    }

    private void setSegitiga(int alas, int tinggi){
        this.alasSegitiga = alas;
        this.tinggiSegitiga = tinggi;
    }

    public int luasPersegiPanjang (int panjang, int lebar){
        this.setPersegiPanjang(panjang, lebar);

        return (this.panjangPersegiPanjang * this.lebarPersegiPanjang);
    }

    private void setPersegiPanjang(int panjang, int lebar){
        this.panjangPersegiPanjang = panjang;
        this.lebarPersegiPanjang = lebar;
    }
}
