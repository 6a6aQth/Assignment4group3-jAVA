import java.util.Date;

class Order {
    private Customer customer;
    private Vehicle vehicle;
    private Date date;
    private double totalAmount;

    public Order(Customer customer, Vehicle vehicle, Date date) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.date = date;
        calculateTotalAmount();
    }

    // Method to calculate total amount of the purchase
    private void calculateTotalAmount() {
        double vehiclePrice = vehicle.price * (1 - vehicle.discount); // Applying vehicle discount
        double customerDiscount = customer.getDiscount();
        double shippingFee = 200;
        double portClearanceFee = 150;

        totalAmount = vehiclePrice * (1 - customerDiscount) + shippingFee + portClearanceFee;
    }

    // Method to display order details
    public void displayOrderDetails() {
        System.out.println("Order Details:");
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Customer Email: " + customer.getEmail());
        System.out.println("Vehicle: " +vehicle.manufacturer+" "+vehicle.make + "  Color:" + vehicle.color + " "+"  Year:" + vehicle.yearOfMake);
        System.out.println("Date: " + date);
        System.out.println("Total Amount: $" + totalAmount);
    }
}
