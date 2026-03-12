void main() {
    // int number = 30;
    // String name = "Kingsley Akwa";
    // System.out.print("This is my first Java lesson\n");
    // System.out.print("It feels like fun");
    // System.out.print("My name is " + name + ", and I am " + number + " years
    // old");

    Car car1 = new Car("Mercedez Benz", "G-Wagon G63", 234478009.00);
    Car car2 = new Car("Toyota", "Camry 2025 LE", 45045000.59);
    car1.welcomeMessage();

    System.out.println(car1.make);
    System.out.println(car1.model);
    System.out.println(car1.price);
    System.out.println(car1.isBrandNew);

    System.out.println(car2.make);
    System.out.println(car2.model);
    System.out.println(car2.price);
    System.out.println(car2.isBrandNew);
}
