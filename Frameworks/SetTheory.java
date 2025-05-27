import java.util.HashSet;

public class SetTheory {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");  
        set.add("Cherry");
        System.out.println("Initial set: " + set);  
        set.add("Apple"); 
        System.out.println("After adding duplicate: " + set);
        set.remove("Banana");
        System.out.println("After removing 'Banana': " + set);
    }
}
