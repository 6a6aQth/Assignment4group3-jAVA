import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class Main {
    public static void main (String[] args) {

        VehicleContainer BeyondUs = new VehicleContainer("BeyondUs");
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Alice", "USA", "alice@example.com"));
        customers.add(new Customer("Bob", "UK", "bob@example.com"));
        customers.add(new Customer("Charlie", "Canada", "charlie@example.com"));

        Customer customer1 = new Customer("Michael", "USA", "qylumanga@gmail.com");
        customers.add(customer1);

        Sedan v1 = new Sedan("Corolla", "Toyota", 2018, "Black", 1.8, 1200, 8600, 5, 30000, true, true, true);
        Sedan v2 = new Sedan("Camry", "Toyota", 2019, "White", 2.4, 1400, 5410, 5, 25000, false, true, false);
        Sedan v3 = new Sedan("Golf", "Volkswagen", 2017, "Silver", 1.6, 1100, 10000, 5, 35000, false, false, false);
        Sedan v4 = new Sedan("Vitz", "Toyota", 2015, "Blue", 1.8, 1200, 3500, 4, 35000, false, true, true);
        Sedan v5 = new Sedan("Juke", "Nissan", 2010, "gray", 1.5, 9000, 4400, 4, 16555, false, true, true);
        Sedan v6 = new Sedan("Demio", "Mazda", 2016, "white", 1.8, 6700, 6330, 4, 15610, false, false, true);

        SUV suv1 = new SUV("Pilot", "Honda", 2020, "Red", 3.5, 2000, 21000, 7, 15000, true);
        SUV suv2 = new SUV("Explorer", "Ford", 2019, "Blue", 3.0, 1800, 15650, 7, 18000, true);
        SUV suv3 = new SUV("Tiguan", "Volkswagen", 2021, "White", 2.0, 1900, 11890, 5, 12000, true);
        SUV suv4 = new SUV("CX-5", "Mazda", 2018, "Black", 2.5, 1700, 9900, 5, 20000, false);
        SUV suv5 = new SUV("Q5", "Audi", 2020, "Silver", 3.0, 2100, 12310, 5, 16000, true);
        SUV suv6 = new SUV("X6", "BMW", 2016, "Black", 3.0, 2100, 17500, 5, 16000, true);
        SUV suv7 = new SUV("Pathfinder", "Nissan", 2015, "green", 2.5, 2000, 11100, 5, 23419, true);
        SUV suv8 = new SUV("GLE", "Mercedes-Benz", 2020, "Obsidian", 4.5, 4000, 63000, 5, 11419, true);


        Tractor tractor1 = new Tractor("Deere", "John Deere", 2015, "Green", 6.0, 5000, 19900, 5000);
        Tractor tractor2 = new Tractor("Farmall", "International Harvester", 2017, "Red", 4.5, 4500, 22500, 8000);
        Tractor tractor3 = new Tractor("MF 8700", "Massey Ferguson", 2019, "Blue", 5.0, 4800, 24000, 6000);
        Tractor tractor4 = new Tractor("T8", "New Holland", 2016, "Yellow", 6.7, 5200, 17700, 7000);
        Tractor tractor5 = new Tractor("Agrotron", "Deutz-Fahr", 2018, "Green", 5.5, 4900, 20010, 5500);

        Bus bus1 = new Bus("Crafter", "Volkswagen", 2018, "Yellow", 3.0, 3500, 33600, 20, 20000, true);
        Bus bus2 = new Bus("Sprinter", "Mercedes-Benz", 2017, "White", 3.5, 3800, 29850, 25, 22000, true);
        Bus bus3 = new Bus("Iveco Daily", "Iveco", 2019, "Blue", 3.0, 3400, 30000, 18, 18000, false);
        Bus bus4 = new Bus("Transit", "Ford", 2020, "Silver", 3.2, 3700, 31200, 22, 21000, true);
        Bus bus5 = new Bus("Coach", "Volvo", 2016, "Red", 3.8, 4000, 44000, 30, 25000, true);

        Machinery machinery1 = new Machinery("Excavator", "Caterpillar", 2017, "Yellow", 12.0, 10000, 18000, 3000, "Excavator");
        Machinery machinery2 = new Machinery("Loader", "Komatsu", 2018, "Orange", 8.0, 8000, 27980, 2500, "Loader");
        Machinery machinery3 = new Machinery("Bulldozer", "Liebherr", 2019, "Green", 15.0, 12000, 23100, 2000, "Bulldozer");
        Machinery machinery4 = new Machinery("Grader", "Caterpillar", 2020, "Gray", 10.0, 9000, 32000, 1800, "Grader");
        Machinery machinery5 = new Machinery("Crane", "Terex", 2016, "Blue", 20.0, 15000, 24400, 4000, "Crane");

// Add SUVs to the appropriate VehicleContainer
        BeyondUs.addVehicleToStock(suv8);
        BeyondUs.addVehicleToStock(v1);
        BeyondUs.addVehicleToStock(suv1);
        BeyondUs.addVehicleToStock(suv2);
        BeyondUs.addVehicleToStock(v2);
        BeyondUs.addVehicleToStock(suv3);
        BeyondUs.addVehicleToStock(v5);
        BeyondUs.addVehicleToStock(suv4);
        BeyondUs.addVehicleToStock(v4);
        BeyondUs.addVehicleToStock(v3);
        BeyondUs.addVehicleToStock(suv5);
        BeyondUs.addVehicleToStock(suv6);
        BeyondUs.addVehicleToStock(suv7);
        BeyondUs.soldVehicle(v6);

        // Add tractors to the appropriate VehicleContainer
        BeyondUs.addVehicleToStock(tractor1);
        BeyondUs.addVehicleToStock(bus1);
        BeyondUs.addVehicleToStock(bus2);
        BeyondUs.addVehicleToStock(bus4);
        BeyondUs.addVehicleToStock(tractor3);
        BeyondUs.soldVehicle(tractor4);
        BeyondUs.soldVehicle(tractor5);
        BeyondUs.soldVehicle(bus3);

        // Add buses to the appropriate VehicleContainer

        BeyondUs.addVehicleToStock(bus5);
        BeyondUs.soldVehicle(tractor2);

        // Add machinery to the appropriate VehicleContainer
        BeyondUs.addVehicleToStock(machinery1);
        BeyondUs.soldVehicle(machinery2);
        BeyondUs.soldVehicle(machinery3);
        BeyondUs.soldVehicle(machinery4);
        BeyondUs.addVehicleToStock(machinery5);


        Scanner scann = new Scanner(System.in);
        int choice0ne = 0;


        while (choice0ne != 4) {
            System.out.println("  ");
            System.out.println("  ");
            System.out.println("                                       Welcome to BeyondUs Login Page");
            System.out.println("                                           1. Administrator Login");
            System.out.println("                                           2. Customer Login");
            System.out.println("                                           3. Create Account");
            System.out.print("                                             4. Exit");
            // Read user input
            choice0ne = scann.nextInt();
            if (choice0ne == 1) {
                Scanner scanner = new Scanner(System.in);
                int choice = 0;

                while (choice != 7) {
                    System.out.println(" ");
                    System.out.println("                                                                 BeyondUs Menu          ");
                    System.out.println(" ");
                    System.out.println("                                                          1.View Vehicles in Stock");
                    System.out.println("                                                          2.View Sold Vehicles");
                    System.out.println("                                                          3.Search Vehicle by name");
                    System.out.println("                                                          4.List Vehicle by price range");
                    System.out.println("                                                          5.Set vehicle Discount");
                    System.out.println("                                                          6.List all vehicles on Discount");
                    System.out.println("                                                          7.Exit");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.print("Enter your choice: ");

                    // Read user input
                    choice = scanner.nextInt();

                    // Process user choice
                    if (choice == 1) {
                        System.out.println("View Vehicles in Stock");
                        BeyondUs.listVehiclesInStock();
                    } else if (choice == 2) {
                        System.out.println(" ");
                        BeyondUs.listSoldVehicles();
                    } else if (choice == 3) {
                        System.out.println(" ");
                        Scanner Carname = new Scanner(System.in);
                        System.out.println("Enter car name");
                        String carname = Carname.nextLine();
                        BeyondUs.searchVehiclesByName(carname);
                    } else if (choice == 4) {
                        System.out.println(" ");
                        Scanner maxx = new Scanner(System.in);
                        Scanner minn = new Scanner(System.in);
                        System.out.println("Enter minimum price $");
                        double min = minn.nextDouble();
                        System.out.println("Enter maximum price $");
                        double max = maxx.nextDouble();
                        BeyondUs.listVehiclesInPriceRange(min, max);
                    } else if (choice == 5) {
                        System.out.println(" ");
                        Scanner manuf = new Scanner(System.in);
                        System.out.println("Enter manufacturer name");
                        String manu = manuf.nextLine();
                        Scanner dis = new Scanner(System.in);
                        double disc = dis.nextDouble();
                        BeyondUs.setDiscountByManufacturer(manu, disc);
                    } else if (choice == 6) {
                        System.out.println(" ");
                        BeyondUs.listVehiclesWithDiscount();
                    } else if (choice == 7) {
                        System.out.println("Exiting...");
                        // Exiting loop
                    } else {
                        System.out.println("Invalid choice. Please enter a number between 1 and 7.");
                        break;
                    }
                }
                // Close the scanner
                scanner.close();

            } else if(choice0ne==2) {
                // Get input from the user
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter your name: ");
                String inputName = scanner.nextLine();

                // Check if the entered name matches any customer's name
                boolean isValidLogin = false;
                for (Customer customer : customers) {
                    if (customer.isNameMatch(inputName)) {
                        isValidLogin = true;
                        System.out.println("Login successful!");
                        System.out.println("");
                        BeyondUs.listVehiclesInStock();
                        Scanner inputint = new Scanner(System.in);
                        System.out.print("Select Vehicle to buy:  ");
                        int input = inputint.nextInt();
                        System.out.println(BeyondUs.SelectVehiclesInStock(input));
                        Order order = new Order(customer, BeyondUs.SelectVehiclesInStock(input), new Date());
                        System.out.println("The following are the order details");
                        order.displayOrderDetails();
                        System.out.println(" ");
                        System.out.println(" ");
                        break;
                    }
                }if(!isValidLogin){
                    System.out.println("Invalid Login");
                    System.out.println("   ");
                }

            }else if(choice0ne==4){
                System.out.println("Exiting...");
            }else if(choice0ne==3){
                Scanner namer =new Scanner(System.in);
                System.out.println("Enter name");
                String name = namer.nextLine();
                System.out.println("Enter country");
                String country = namer.nextLine();
                System.out.println("Enter Email");
                String email = namer.nextLine();
                customers.add(new Customer(name ,country,email));
                System.out.println("Account Created Successfully");
                System.out.println("  ");
            }else System.out.println("Invalid Input");

        }







        //BeyondUs.listSoldVehicles();
        //BeyondUs.listVehiclesInStock();

      //Order order = new Order(customer1, v1, new Date());

//      Display order details
      // order.displayOrderDetails();





    }
}

// Customer places an order
//Order order = new Order(customer1, v1, new Date());

// Display order details
//order.displayOrderDetails();