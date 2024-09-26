
import java.util.UUID;

class Car {
    private String id;
    private String make;
    private String model;
    private int yearOfManufacture;
    private String color;
    private double price;
    private String registrationNumber;

    // Constructor
    public Car(String make, String model, int yearOfManufacture, String color, double price, String registrationNumber) {
        this.id = UUID.randomUUID().toString();
        this.make = make;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.color = color;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }

    // Getters
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("ID: %s, Make: %s, Model: %s, Year: %d, Color: %s, Price: %.2f, RegNumber: %s",
                id, make, model, yearOfManufacture, color, price, registrationNumber);
    }
}