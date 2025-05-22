interface A {
    void display();
}

interface B {
    void display();
}

class Demo implements A, B{
    public void display(){
        System.out.println("Displaying the message");
    }
}

public class AnB {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.display();
    }
}
