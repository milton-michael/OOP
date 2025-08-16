package mod1;

class Animal {
    String species;

    Animal(String species) {
        this.species = species;
    }

    void displaySpecies() {
        System.out.println("Species: " + species);
    }
}

public class TestAnimal {
    public static void main(String[] args) {
        Animal a1 = new Animal("Lion");
        System.out.println("Direct access: " + a1.species);
        a1.displaySpecies();
    }
}
// Milton Michael
// 16/8/25