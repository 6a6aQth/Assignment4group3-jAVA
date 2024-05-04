class Machinery extends Vehicle {
    private String category;

    public Machinery(String make, String manufacturer, int yearOfMake, String color, double engineSize,
                     double weight, int price, int mileage, String category) {
        super(make, manufacturer, yearOfMake, color, engineSize, weight, price,1, mileage);
        this.category = category;
    }
}