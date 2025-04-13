class Car {
    String color;
    Car(String color){
        this.color = color; 
    }
    void display(){
        System.out.println(this.color);
    }
}

public class RedCar {
    public static void main(String[] args) {
        Car car = new Car("Red");
        car.display();
    }
}
