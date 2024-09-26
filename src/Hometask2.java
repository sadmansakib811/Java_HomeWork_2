import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



public class Hometask2 {
    public static void main(String[] args) {
        // Check the working directory
        System.out.println("Working Directory: " + System.getProperty("user.dir"));

        // Creating an array of Car objects
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Toyota", "Corolla", 2010, "White", 15000, "AB123CD"));
        carList.add(new Car("Honda", "Civic", 2005, "Black", 12000, "EF456GH"));
        carList.add(new Car("Ford", "Mustang", 2018, "Red", 30000, "IJ789KL"));
        carList.add(new Car("Toyota", "Camry", 2000, "Blue", 18000, "TY789GH"));
        carList.add(new Car("Honda", "Accord", 2015, "Gray", 25000, "LK321CD"));

        // Part a) Save a list of cars of a given brand
        saveCarsByMake(carList, "Toyota", "cars_by_make.txt");

        // Part b) Save a list of cars of a given model that have been in use for more than n years
        saveCarsByModelAndYears(carList, "Civic", 10, "cars_by_model_and_years.txt");

        // Part c) Save a list of cars of a given year of manufacture, the price of which is higher than the specified one
        saveCarsByYearAndPrice(carList, 2010, 14000, "cars_by_year_and_price.txt");
    }

    private static void saveCarsByMake(List<Car> cars, String make, String filename) {
        System.out.println("Attempting to write cars of make: " + make + " to file: " + filename);
        try (FileWriter writer = new FileWriter(filename)) {
            for (Car car : cars) {
                if (car.getMake().equalsIgnoreCase(make)) {
                    writer.write(car.toString() + "\n");
                }
            }
            System.out.println("Successfully wrote to " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void saveCarsByModelAndYears(List<Car> cars, String model, int years, String filename) {
        System.out.println("Attempting to write cars of model: " + model + " to file: " + filename);
        int currentYear = java.time.Year.now().getValue();
        try (FileWriter writer = new FileWriter(filename)) {
            for (Car car : cars) {
                if (car.getModel().equalsIgnoreCase(model) && (currentYear - car.getYearOfManufacture()) > years) {
                    writer.write(car.toString() + "\n");
                }
            }
            System.out.println("Successfully wrote to " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void saveCarsByYearAndPrice(List<Car> cars, int year, double price, String filename) {
        System.out.println("Attempting to write cars from the year: " + year + " with a price > " + price + " to file: " + filename);
        try (FileWriter writer = new FileWriter(filename)) {
            for (Car car : cars) {
                if (car.getYearOfManufacture() == year && car.getPrice() > price) {
                    writer.write(car.toString() + "\n");
                }
            }
            System.out.println("Successfully wrote to " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
