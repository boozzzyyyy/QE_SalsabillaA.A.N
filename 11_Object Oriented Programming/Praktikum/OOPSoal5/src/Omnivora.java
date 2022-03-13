package src;

public class Omnivora extends Animals{
    public String namaBinatang = "Ayam";
    public String jenisMakanan = " semua";
    public String gigiBinatang = "tajam dan tumpul";
    public String nameClass = "Omnivore";

    @Override
    public void identify_myself(){
        System.out.print("Hi I'm " + this.nameClass + ", My Name is " + this.namaBinatang);
        if (this.jenisMakanan != ""){
            System.out.print(", My food is '" + this.jenisMakanan + "'");
        }
        if (this.gigiBinatang != "") {
            System.out.println(", I have " + this.gigiBinatang + " teeth");
        }else {
            System.out.println();
        }
    }
}
