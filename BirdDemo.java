package mod2;

class Bird {
    void fly() {
        System.out.println("Bird can fly in general.");
    }
}

class Sparrow extends Bird {
    @Override
    void fly() {
        System.out.println("Sparrow flies short distances.");
    }
}

class Eagle extends Bird {
    @Override
    void fly() {
        System.out.println("Eagle soars high in the sky.");
    }
}

public class BirdDemo {
    public static void main(String[] args) {
        Bird[] birds = new Bird[3];
        birds[0] = new Bird();
        birds[1] = new Sparrow();
        birds[2] = new Eagle();

        System.out.println("--- Bird Flying Demo ---");
        for (Bird b : birds) {
            b.fly();
        }
    }
 // Milton Michael
 // 16/08/25
}