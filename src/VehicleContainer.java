import java.util.ArrayList;

// Your existing Vehicle class and other classes remain the same

// Enhanced VehicleContainer class
public class VehicleContainer {
    private String name;
    private ArrayList<Vehicle> vehiclesInStock; // List of vehicles available for sale
    private ArrayList<Vehicle> vehiclesSold; // List of vehicles sold

    public VehicleContainer(String name) {
        this.name = name;
        this.vehiclesInStock = new ArrayList<>();
        this.vehiclesSold = new ArrayList<>();
    }

    public void addVehicleToStock(Vehicle vehicle) {
        this.vehiclesInStock.add(vehicle);
    }

    public void listVehiclesByManufacturer(String manufacturer) {
        System.out.println("Vehicles by Manufacturer " + manufacturer + ":");
        for (Vehicle vehicle : this.vehiclesInStock) {
            if (vehicle.manufacturer.equalsIgnoreCase(manufacturer)) {
                System.out.println(vehicle.make + " - Color: " + vehicle.color + " - Price: " + vehicle.price +
                        " - Year of Make: " + vehicle.yearOfMake);
            }
        }
    }

    // Method to search for vehicles by name (make or model)
    public void searchVehiclesByName(String name) {
        System.out.println("                                    Searching for vehicles by name: " + name);
        System.out.println(" ");
        boolean found = false;
        int i = 1;
        for (Vehicle vehicle : this.vehiclesInStock) {
            if (vehicle.make.equalsIgnoreCase(name) || vehicle.manufacturer.equalsIgnoreCase(name)) {
                System.out.println("Vehicle Found:");
                System.out.println(i+"."+vehicle.manufacturer+" "+vehicle.make + "  Color:" + vehicle.color + "  Price:$" + vehicle.price +
                        "  Year:" + vehicle.yearOfMake);
                System.out.println(" ");
                i++;
                found = true;
            }
        }
        if (!found) {
            System.out.println("No vehicles found with name: " + name);
        }
    }

    // Method to list vehicles within a particular price range
    public void listVehiclesInPriceRange(double minPrice, double maxPrice) {
        System.out.println("                                             Vehicles in Price Range $" + minPrice + " - $" + maxPrice + ":");
        int i = 1;
        System.out.println("  ");
        for (Vehicle vehicle : this.vehiclesInStock) {
            if (vehicle.price >= minPrice && vehicle.price <= maxPrice) {
                System.out.println(i+"."+vehicle.manufacturer+" "+vehicle.make + "  Color:" + vehicle.color + "  Price:$" + vehicle.price +
                        "  Year:" + vehicle.yearOfMake);
                System.out.println(" ");
                i++;
            }
        }
    }

    // Method to list vehicles with discounts
    public void listVehiclesWithDiscount() {
        System.out.println("Vehicles with Discounts:");
        int i = 1;
        System.out.println(" ");
        for (Vehicle vehicle : this.vehiclesInStock) {
            if (vehicle.discount > 0) {
                System.out.println(i+"."+vehicle.manufacturer+" "+vehicle.make + "  Color:" + vehicle.color + "  Price:$" + vehicle.price +
                        "  Year:" + vehicle.yearOfMake);
                System.out.println(" ");
                i++;
            }

        }
        System.out.println("No vehicles with Discounts");
    }

    // Method to set discount on vehicles based on manufacturer
    public void setDiscountByManufacturer(String manufacturer, double discountPercent) {
        System.out.println("Setting discount of " + discountPercent + "% on vehicles manufactured by " + manufacturer);
        for (Vehicle vehicle : this.vehiclesInStock) {
            if (vehicle.manufacturer.equalsIgnoreCase(manufacturer)) {
                vehicle.discount = discountPercent / 100;
            }
        }
    }

    // Method to move a vehicle from stock to sold list
    public void soldVehicle(Vehicle vehicle) {
        this.vehiclesInStock.remove(vehicle);
        this.vehiclesSold.add(vehicle);
    }

    // Method to list all vehicles in stock
    public void listVehiclesInStock() {
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("                                                   Vehicles in Stock for " + name + ":");
        System.out.println(" ");
        System.out.println(" ");
        int i = 1;
        for (Vehicle vehicle : this.vehiclesInStock) {

            System.out.println(i+"."+vehicle.manufacturer+" "+vehicle.make + "  Color:" + vehicle.color + "  Price:$" + vehicle.price +
                    "  Year:" + vehicle.yearOfMake);
            System.out.println(" ");
            i++;
        }
    }

    public Vehicle SelectVehiclesInStock(int j) {
        for (int i = 0; i < vehiclesInStock.size(); i++) {
            if (i == j - 1) {
                SelectVehiclesInStockDisplay(j);
                return vehiclesInStock.get(i);
            }
        }
        return null; // Return null if the index is out of bounds
    }


    public void SelectVehiclesInStockDisplay(int j) {
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("                                                   Vehicle Selected " + name + ":");
        System.out.println(" ");
        System.out.println(" ");
        int i = 1;
        for (Vehicle vehicle : this.vehiclesInStock) {
            if(i==j){
                System.out.println(i+"."+vehicle.manufacturer+" "+vehicle.make + "  Color:" + vehicle.color + "  Price:$" + vehicle.price +
                        "  Year:" + vehicle.yearOfMake);
                System.out.println(" ");
                return;
                //System.out.println(vehicle.getClass().getSimpleName());
            }
            i++;
        }
    }

    // Method to list all vehicles sold
    public void listSoldVehicles() {
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("                                                   " + name +" Sold Vehicles" +":");
        System.out.println(" ");
        System.out.println(" ");
        int i = 1;
        for (Vehicle vehicle : this.vehiclesSold) {
            System.out.println(i+"."+vehicle.manufacturer+" "+vehicle.make + "  Color:" + vehicle.color + "  Price:$" + vehicle.price +
                    "  Year:" + vehicle.yearOfMake);
            System.out.println(" ");
            i++;
        }
    }
}
