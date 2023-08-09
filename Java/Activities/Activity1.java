package Activities;

public class Activity1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.color = "Black";
        car1.make = 2014;
        car1.brand="Toyota";
        car1.transmission = "Auto-transmission";
        car1.DisplayCharacteristics();
        car1.acceleration();
        car1.brake();
    }
}
