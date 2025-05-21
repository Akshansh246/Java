//use of multiple inheritances in this
interface Client1{
    void show();
    void print();
} 
interface Client2{
    void show();
    void print();
}

class Developer implements Client1, Client2{
    public void show(){
        System.out.println("For both the clients");
    }
    public void print(){
        System.out.println("This is the print function");
    }
}

public class ResturantWithTwoClients{
    public static void main(String[] args) {
        Developer developer = new Developer();
        developer.show();
        developer.print(); 
    }
}


