package src;

public class Main {
    public static void main(String[] args) {
        Animals objAnimals = new Animals();
        objAnimals.identify_myself();

        Herbivora objHerbivora = new Herbivora();
        objHerbivora.identify_myself();

        Carnivora objCarnivora = new Carnivora();
        objCarnivora.identify_myself();

        Omnivora objOmnivora = new Omnivora();
        objOmnivora.identify_myself();
    }

}
