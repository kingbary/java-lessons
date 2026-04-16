public abstract class Car {
    String model;
    double price;

    abstract void speed(); // Abstract method

    void announcement(){
        System.out.println("This is a car!");
    }

    boolean isBrandNew;

    Car(String model, double price) {
        this.model = model;
        this.price = price;
    }

    void welcomeMessage() {
        this.isBrandNew = true;
        System.out.println("This is the latest " + this.model + ", Price: " + this.price);
    }
}
