import java.util.Scanner;

// i) Base Class: Vehicle
class Vehicle {
    String brand;
    String model;
    int year;

    // Constructor to initialize fields
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method to display basic vehicle details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year:  " + year);
    }
}
// ii) Subclass: Car (Inherits from Vehicle)
class Car extends Vehicle {
    String fuelType;

    // Constructor initializing all fields, including those from Vehicle
    public Car(String brand, String model, int year, String fuelType) {
        super(brand, model, year);
        this.fuelType = fuelType;
    }

    // Overriding the displayDetails method
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Fuel Type: " + fuelType);
    }
}

// iii) Main Class: Showroom
public class showroom {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("--- Welcome to the Car Showroom ---");
            
            System.out.print("Enter Car Brand: ");
            String brand = input.nextLine().trim();
            
            System.out.print("Enter Car Model: ");
            String model = input.nextLine().trim();
            
            int year = 0;
            while (true) {
                System.out.print("Enter Year of Manufacture: ");
                if (input.hasNextInt()) {
                    year = input.nextInt();
                    input.nextLine(); // consume newline
                    break;
                } else {
                    System.out.println("Please enter a valid integer for year.");
                    input.nextLine(); // discard invalid input
                }
            }
            
            System.out.print("Enter Fuel Type (e.g., Petrol, Diesel, Electric): ");
            String fuelType = input.nextLine().trim();
            
            Car myCar = new Car(brand, model, year, fuelType);
            
            System.out.println("\n--- Displaying Car Details ---");
            myCar.displayDetails();
        }
    }
}