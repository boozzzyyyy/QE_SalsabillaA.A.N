package src;

public class Carnivora extends Animals{
    public String namaBinatang = "Singa";
    public String jenisMakanan = "daging";
    public String gigiBinatang = "tajam";
    public String nameClass = "Carnivore";

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
