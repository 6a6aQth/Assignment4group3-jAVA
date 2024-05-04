class Sedan extends Vehicle implements Electric, RightHandDrive, Automatic {
    private boolean electric;
    private boolean rightHandDrive;
    private boolean automatic;

    public Sedan(String make, String manufacturer, int yearOfMake, String color, double engineSize,
                 double weight, double price, int numberOfSeats, int mileage,boolean electric, boolean rightHandDrive, boolean automatic) {
        super(make, manufacturer, yearOfMake, color, engineSize, weight, price, numberOfSeats, mileage);
        this.electric = electric;
        this.rightHandDrive = rightHandDrive;
        this.automatic = automatic;
    }

    @Override
    public boolean isElectric() {
        return electric;
    }

    @Override
    public boolean isRightHandDrive() {
        return rightHandDrive;
    }

    @Override
    public boolean isAutomatic() {
        return automatic;
    }
}
