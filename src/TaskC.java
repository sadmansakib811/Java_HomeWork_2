import java.util.ArrayList;
import java.util.List;

public class TaskC {
	
	
	public static void main(String args[]) {
		int GIVEN_YEAR = 1994;
		double GIVEN_PRICE = 20000;
		
		List<Car> listOfCars = new ArrayList<>();
//		(String make, String model,manufactureYr, String color, double price, String regNumber)
		listOfCars.add(new Car("Ferrari", "Sports Car", 1994, "Black", 20000, "XY123VC" ));
		listOfCars.add(new Car("BMW", "", 1997, "Red", 50000, "YH2248CS" ));
		listOfCars.add(new Car("Marcedes", "Benz", 1998, "Blue", 10000, "HSG234H" ));
		listOfCars.add(new Car("Ford", "Truck", 1984, "Black", 30000, "XSJ234H" ));
		listOfCars.add(new Car("Honda", "Bummer", 1999, "Gray", 60000, "UEJ235CS" ));
		listOfCars.add(new Car("Toyota", "Corolla", 1994, "Silver",70000, "HJA244HJ" ));
		listOfCars.add(new Car("Honda", "Bullet", 1993, "Black", 80000, "JB345HV" ));
		listOfCars.add(new Car("Ford", "Truck", 1974, "Red", 20000, "BR8348H" ));
		listOfCars.add(new Car("Chevrolet", "Chevvy", 1982, "Black", 10000, "IS345J" ));
		listOfCars.add(new Car("Honda", "Jeep", 1993, "Black", 30000, "NJ345J" ));
	
		
        List<Car> listOfFilteredCars = filterCarsByGivenYearAndPrice(listOfCars, GIVEN_YEAR, GIVEN_PRICE);

        for (Car car : listOfFilteredCars) {
            System.out.println("Make: " + car.getMake() +
                    ", Model: " + car.getModel() +
                    ", Year: " + car.getManufactureYear() +
                    ", Price: $" + car.getPrice());
        }
	}
	
	public static List<Car> filterCarsByGivenYearAndPrice(List<Car> cars, int year, double price) {
        List<Car> resultCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getManufactureYear() == year && car.getPrice() > price) {
            	resultCars.add(car);
            }
        }
        return resultCars;
    }
}