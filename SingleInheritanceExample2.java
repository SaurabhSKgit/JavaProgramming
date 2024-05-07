class Vehicle {
  String type;
  String model;
  int year;

  Vehicle(String type, String model, int year) {
    this.type = type;
    this.model = model;
    this.year = year;
  }

  public void displayVehicleInfo() {
    System.out.println("**** Vehicle Information ****");
    System.out.println("Type: " + type);
    System.out.println("Model: " + model);
    System.out.println("Year: " + year);
    System.out.println();
  }
}

class Car extends Vehicle {
  int numDoors;
  boolean automaticTransmission;
  double price;

  Car(String type, String model, int year, int numDoors, boolean automaticTransmission,double price) {
    super(type, model, year); // Call parent constructor
    this.numDoors = numDoors;
    this.automaticTransmission = automaticTransmission;
    this.price=price;
  }

  public void displayCarDetails() {
    System.out.println();
    System.out.println("**** Car Details ****");
   // displayVehicleInfo(); // Inherited method to display general info
    System.out.println("Number of Doors: " + numDoors);
    System.out.println("Automatic Transmission: " + automaticTransmission);
    System.out.println("Price : "+price);
  }
}
 
public class SingleInheritanceExample2{
  public static void main(String[] args) {
    Car myCar = new Car("Sedan", "Honda Accord", 2023, 4, true,4300000);
    myCar.displayVehicleInfo();
    myCar.displayCarDetails();

   
  }
}
