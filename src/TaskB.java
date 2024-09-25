import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskB {
	public static void main(String args[]) {
		
		List<Car> listOfCars = new ArrayList<>();
//		(String make, String model, int manufactureYr, String color, double price, String regNumber)
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
		
		filterByModelAndYears(listOfCars, 10, "Toyota");
		
	}
	
	public static List<Car> filterByModelAndYears(List<Car> cars, int years, String model){
		LocalDate currentDate = LocalDate.now();
		int currYear = currentDate.getYear();
		List<Car> filteredCars = new ArrayList<>();
		 
        for (Car car : cars) {
            if (car.getModel().toLowerCase().equals(model.toLowerCase()) && (currYear - car.getManufactureYear()) > years) {
                filteredCars.add(car);
                System.out.println(car.getModel() + " " + car.getManufactureYear());
            }
        }
        return filteredCars;
	}
}