package GroupProject;

class Car {
    private double carPrice;
    private String color;

    public Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }

    // Method to calculate the sale price (to be overridden by subclasses)
    public double calculateSalePrice() {
        return carPrice; // Default implementation
    }
}

// Subclass Sedan
class Sedan extends Car {
    private double length;

    public Sedan(double carPrice, String color, double length) {
        super(carPrice, color);
        this.length = length;
    }

    @Override
    public double calculateSalePrice() {
        if (length > 20) {
            // 5% discount for sedans longer than 20 feet
            return super.calculateSalePrice() * 0.95;
        } else {
            // 10% discount for other sedans
            return super.calculateSalePrice() * 0.90;
        }
    }
}

// Subclass Truck
class Truck extends Car {
    private double weight;

    public Truck(double carPrice, String color, double weight) {
        super(carPrice, color);
        this.weight = weight;
    }

    @Override
    public double calculateSalePrice() {
        if (weight > 2000) {
            // 10% discount for trucks heavier than 2000 pounds
            return super.calculateSalePrice() * 0.90;
        } else {
            // 20% discount for other trucks
            return super.calculateSalePrice() * 0.80;
        }
    }

    public static void main(String[] args) {
        // Create instances of Sedan and Truck
        Sedan sedan = new Sedan(25000, "Blue", 22.5);
        Truck truck = new Truck(35000, "Red", 2200);

        // Calculate and display the sale price for each vehicle
        System.out.println("Sedan Sale Price: $" + sedan.calculateSalePrice());
        System.out.println("Truck Sale Price: $" + truck.calculateSalePrice());
    }
}