import java.util.TreeSet;

public class TreeeeSeet {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Banana");  
        treeSet.add("Apple");
        treeSet.add("Cherry");
        System.out.println("Initial TreeSet: " + treeSet);
        treeSet.add("Apple");
        System.out.println("After adding duplicate 'Apple': " + treeSet);
        treeSet.remove("Banana");
        System.out.println("After removing 'Banana': " + treeSet);

    }
}
