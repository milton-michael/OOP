package mod1;

class Car {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    public void showModel() {
        System.out.println("Model: " + model);
    }
}

public class TestCar {
    public static void main(String[] args) {
        Car c1 = new Car("Tesla");
        // System.out.println(c1.model);  // error
        c1.showModel();
    }
}
// Milton Michael
// 16/8/25