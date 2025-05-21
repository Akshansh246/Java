interface Client {   //similar to abstract class
    void print();       //abstract method by default
    void show();
}

class Developer implements Client{
    public void print(){
        System.out.println("billl");
    }
    public void show(){
        System.out.println("hyderabadi biryaniiiiii");
    }
}

public class RestaurantApplication {
    public static void main(String[] args) {
        Developer d = new Developer();
        d.show();
    }
}
