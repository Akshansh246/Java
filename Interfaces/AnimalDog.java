interface Animal{
    void makeSound();
}

class Dog{
    public void makeSound(){
        System.out.println("Bhow Bhow The dog is barking :)");
    }
}

public class AnimalDog {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();
    }
}
