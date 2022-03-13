package src;

public class Animals {
    public String namaBinatang = "Binatang";
    public String jenisMakanan = "";
    public String gigiBinatang = "";
    public String nameClass = "Parent of All Animal";

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
