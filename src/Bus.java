class Bus extends Vehicle implements Automatic {

    private boolean automatic;

    public Bus(String make, String manufacturer, int yearOfMake, String color, double engineSize,
               double weight, int price, int numberOfSeats, int mileage, boolean automatic) {
        super(make, manufacturer, yearOfMake, color, engineSize, weight, price, numberOfSeats, mileage);
        this.automatic = automatic;
    }

    @Override
    public boolean isAutomatic() {
        return automatic;
    }
}