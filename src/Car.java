public class Car {
    String make;
    String model;
    double price;
    boolean isBrandNew;

    Car(String make, String model, double price) {
        this.make = make;
        this.model = model;
        this.price = price;
    }

    void welcomeMessage() {
        this.isBrandNew = true;
        System.out.println("This is the latest " + this.make + " " + this.model + ", Price: " + this.price);
    }
}
