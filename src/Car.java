
import java.util.UUID;

public class Car {
	private String id;
	private String Make;
	private String Model;
	private int manufactureYear;
	private String Color;
	private double Price;
	private String registrationNumber;
	
	public Car(String make, String model, int manufactureYr, String color, double price, String regNumber) {
		this.id = UUID.randomUUID().toString();
		this.setMake(make);
		this.Model = model;
		this.manufactureYear = manufactureYr;
		this.Color = color;
		this.Price = price;
		this.setRegistrationNumber(regNumber);
	}
	
	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public int getManufactureYear() {
		return manufactureYear;
	}

	public void setManufactureYear(int manufactureYear) {
		this.manufactureYear = manufactureYear;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getMake() {
		return Make;
	}

	public void setMake(String make) {
		Make = make;
	}
}