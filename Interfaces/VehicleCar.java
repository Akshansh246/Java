interface Vehicle{
    void start();
}

class Car{
    void start(){
        System.out.println("Vehicle is Starting..");
    }
}

public class VehicleCar {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
    }
}
