package src;

public class Herbivora extends Animals{
    public String namaBinatang = "Kambing";
    public String jenisMakanan = "tumbuhan";
    public String gigiBinatang = "tumpul";
    public String nameClass = "Herbivore";

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
