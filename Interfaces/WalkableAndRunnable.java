interface Walkable{
    void walk();
    void run();
}

interface Runnable{
    void walk();
    void run();
}

class Human implements Walkable, Runnable{
    public void walk(){
        System.out.println("the human is walking");
    }
    public void run(){
        System.out.println("the human is running");
    }
}

public class WalkableAndRunnable {
    public static void main(String[] args) {
        Human h = new Human();
        h.walk();
        h.run();
    }
}
