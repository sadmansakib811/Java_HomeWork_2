# Car Management System
### Name: Sadman Sakib
### Matriculation Number: 7213446
## Project Overview
The Car Management System is a Java application designed to handle a collection of car records, demonstrating the application of object-oriented programming principles along with file operations in Java. Developed in Eclipse, this system allows for the management and manipulation of car data based on specified filtering criteria.

## Features
- **Car Data Management:** Manages details of cars including ID, make, model, year, color, price, and registration number.
- **Data Filtering:** Filters cars by brand, model age, and specific price criteria.
- **File Output:** Saves the filtered data to text files for persistent storage.

## Technical Description
### Car Class
The `Car` class is the backbone of the application, encapsulating car properties and responsible for file operations based on various filters.

#### Attributes
- `id`: Unique identifier for each car.
- `make`: Manufacturer of the car.
- `model`: Model of the car.
- `yearOfManufacture`: Year the car was manufactured.
- `color`: Color of the car.
- `price`: Price of the car.
- `registrationNumber`: Official registration number.

#### Key Methods
- `saveCarsByBrand(List<Car> cars, String brand, String filePath)`: Filters and saves cars by brand.
- `saveCarsByModelAndAge(List<Car> cars, String model, int n, String filePath)`: Filters cars by model and age.
- `saveCarsByYearAndPrice(List<Car> cars, int year, double minPrice, String filePath)`: Filters and saves cars by year and minimum price.

### Main Class
Serves as the entry point for the application, initializing car objects and invoking filter methods.

### File Handling
Utilizes `BufferedWriter` and `FileWriter` to efficiently and correctly handle text file outputs, ensuring robust error management.


## Installation

### Setting Up the Project

1. **Clone/Download the Project**


2. **Open the Project in Eclipse**:
   - Start Eclipse.
   - Select `File` > `Open Projects from File System...` from the menu.
   - Navigate to the directory where you cloned the project.
   - Select the project and click `Finish` to import it into Eclipse.

## Running the Application

To run the Car Management System within Eclipse:
1. **Navigate to the `Main.java` File**:
   - In Eclipse, expand the project tree in the `Project Explorer`.
   - Find `src` > `(default package)` > `Main.java`.
2. **Run the Application**:
   - Right-click on `Main.java`.
   - Select `Run As` > `Java Application`.
   - The application will execute and create output files in the project root directory, based on the predefined filters.

3. **Viewing Output Files**:
   - Refresh the project in Eclipse by right-clicking the project name and selecting `Refresh`.
   - Navigate to the project root directory in the `Project Explorer` to view the generated text files.
