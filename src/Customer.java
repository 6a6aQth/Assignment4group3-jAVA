import java.util.ArrayList;

class Customer {
    private String name;
    private String country;
    private String email;
    private double discount;
    private ArrayList<Vehicle> vehiclesInStock;

    public Customer(String name, String country, String email) {
        this.name = name;
        this.country = country;
        this.email = email;
        this.discount = 0.02; // 2% discount for creating an account
    }
    public boolean isNameMatch(String inputName) {
        return this.name.equalsIgnoreCase(inputName);
    }
    public void cusadd(String name, String Country, String email){
        int i = 2;

    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getEmail() {
        return email;
    }

    public double getDiscount() {
        return discount;
    }


    // Method to apply discount for purchasing a vehicle
    public void applyPurchaseDiscount() {
        this.discount += 0.01; // 1% discount on future purchase
    }
}
