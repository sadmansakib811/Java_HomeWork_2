import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1, "Toyota", "Corolla", 2010, "Red", 5000, "XYZ123"));
        cars.add(new Car(2, "Honda", "Civic", 2012, "Blue", 7000, "ABC456"));
        cars.add(new Car(3, "Toyota", "Camry", 2015, "White", 10000, "DEF789"));

        try {
            Car.saveCarsByBrand(cars, "Toyota", "toyota_cars.txt");
            Car.saveCarsByModelAndAge(cars, "Civic", 5, "old_civic_cars.txt");
            Car.saveCarsByYearAndPrice(cars, 2012, 6000, "expensive_2012_cars.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
