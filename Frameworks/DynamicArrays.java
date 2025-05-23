// Dynamic Arrays in Java
// Dynamic arrays are resizable arrays that can grow and shrink in size as needed.
// They are implemented using the ArrayList class in Java.
// The ArrayList class is part of the java.util package and provides methods to manipulate the size of the array.
// The ArrayList class is a part of the Java Collections Framework and provides a way to store a dynamically sized collection of elements.
// The ArrayList class is implemented as a resizable array, which means that it can grow and shrink in size as needed.
// The ArrayList class provides methods to add, remove, and access elements in the array.
// The ArrayList class is not synchronized, which means that it is not thread-safe.
import java.util.ArrayList;

public class DynamicArrays {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add(0,"Midnight blue");
        colors.forEach(System.out::println);
        colors.remove("Red");
        colors.remove(0);
        colors.set(0, "Yellow");
        System.out.println("After removing and setting:");
        System.out.println(colors);
    }   
}
