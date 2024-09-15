import java.util.List;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Car {
    // Car attributes
    private int id;
    private String make;
    private String model;
    private int yearOfManufacture;
    private String color;
    private double price;
    private String registrationNumber;

    // Constructor
    public Car(int id, String make, String model, int yearOfManufacture, String color, double price, String registrationNumber) {
        this.id = id;
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

    // Save lists of cars to different files based on filters
    public static void saveCarsByBrand(List<Car> cars, String brand, String filePath) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Car car : cars) {
                if (car.getMake().equalsIgnoreCase(brand)) {
                    writer.write(car.toString() + "\n");
                }
            }
        }
    }

    public static void saveCarsByModelAndAge(List<Car> cars, String model, int n, String filePath) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Car car : cars) {
                if (car.getModel().equalsIgnoreCase(model) && (2024 - car.getYearOfManufacture() > n)) {
                    writer.write(car.toString() + "\n");
                }
            }
        }
    }

    public static void saveCarsByYearAndPrice(List<Car> cars, int year, double minPrice, String filePath) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Car car : cars) {
                if (car.getYearOfManufacture() == year && car.getPrice() > minPrice) {
                    writer.write(car.toString() + "\n");
                }
            }
        }
    }

    // Custom toString method for Car
    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", registrationNumber='" + registrationNumber + '\'' +
                '}';
    }
}
