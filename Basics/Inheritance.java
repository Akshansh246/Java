class A{
    public void show(){
        System.out.println("A");
    }
}
class B extends A{
    public void showB(){
        System.out.println("B");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        B b = new B();
        b.show();
    }
    
}
