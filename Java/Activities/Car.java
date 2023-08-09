package Activities;

public class Car {
    String color;
    String transmission;
    String brand;
    int make;
    int tyres;
    int doors;
    Car(){
        tyres = 4;
        doors = 4;
    }

    void DisplayCharacteristics(){
        System.out.println("Car brand: " + brand);
        System.out.println("The color of the car: " + color);
        System.out.println("Transmission of car: " +transmission);
        System.out.println("Total tyres of the car: " +tyres);
        System.out.println("Total doors of the car: " +doors);
    }
    void acceleration(){
        System.out.println("The car is moving");
    }
    void brake(){
        System.out.println("Car has stopped");
    }
}
