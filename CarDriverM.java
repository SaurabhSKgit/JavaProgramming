class Engine {

    double horsePower;
    double capacity;
    String engineType;
    double milage;
    int noOfPistons;

    Engine(double horsePower,double capacity ,String engineType, double milage,int noOfPistons)
    {
        this.horsePower=horsePower;
        this.capacity=capacity;
        this.engineType=engineType;
        this.milage=milage;
        this.noOfPistons=noOfPistons;
    }

    public void displayEngine(){
        System.out.println();
        System.out.println("****Engine Details****");
        System.out.println();
        System.out.println("Horse Power : "+horsePower);
        System.out.println("Capacity : "+capacity);
        System.out.println("Engine Type :"+engineType);
        System.out.println("Milage : "+milage);
        System.out.println("No Of Pistons : "+noOfPistons);
    }
    
}
class Car{
    String brand;
    String model;
    String type;
    double price;
    int seatingCapacity;
    Engine engine;


    Car(String brand,String model,String type,double price,int seatingCapacity)
    {
        this.brand=brand;
        this.model=model;
        this.type=type;
        this.price=price;
        this.seatingCapacity=seatingCapacity;
        this.engine=new Engine(120,1.2,"Petrol",16,4);
    }
    public void displayCar()
    {
        System.out.println("**** Car Details ****");
        System.out.println("Brand : "+brand);
        System.out.println("Model : "+model);
        System.out.println("Type : "+type);
        System.out.println("Price : "+price);
        System.out.println("Seating capacity : "+seatingCapacity);
    }
}

class CarDriverM {
    public static void main(String[] args) {
        Car obj=new Car("TATA","NEXON","SUV",900000,5);
        obj.displayCar();
        obj.engine.displayEngine();
    }    
}
