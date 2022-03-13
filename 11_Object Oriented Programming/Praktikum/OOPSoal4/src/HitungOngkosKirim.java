package src;

public class HitungOngkosKirim {
    public int panjang, lebar, tinggi, berat, volume, volumeC = 0, kaliHarga, harga = 0, hargaMin = 5000;

    public int hitung(){
        this.volume = this.panjang * this.lebar * this.tinggi;
        this.hitungKaliharga();

        this.kaliHarga = (this.volumeC > this.berat) ? this.volumeC : this.berat;
        this.harga = this.hargaMin * this.kaliHarga;
        return this.harga;
    }

    private void hitungKaliharga(){
        while(this.volume > 0) {
            this.volume -= 50;
            if (this.volume >= 0) {
                this.volumeC++;
            }
        }
    }
}
