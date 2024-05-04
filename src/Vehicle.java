abstract class Vehicle {
    protected String make;
    protected String manufacturer;
    protected int yearOfMake;
    protected String color;
    protected double engineSize;
    protected double weight;
    protected double price;
    protected int numberOfSeats;
    protected int mileage;
    protected double discount;

    public Vehicle(String make, String manufacturer, int yearOfMake, String color, double engineSize,
                   double weight, double price, int numberOfSeats, int mileage) {
        this.make = make;
        this.manufacturer = manufacturer;
        this.yearOfMake = yearOfMake;
        this.color = color;
        this.engineSize = engineSize;
        this.weight = weight;
        this.price = price;
        this.numberOfSeats = numberOfSeats;
        this.mileage = mileage;
        this.discount = 0;
    }


}
