import java.util.LinkedList;

public class LinkedlistsWithFrameworks {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Hello");
        linkedList.add("World");
        System.out.println(linkedList);

        linkedList.addFirst("First");
        linkedList.addLast("Last");
        System.out.println(linkedList);

        linkedList.remove("World");
        linkedList.add(1, "Inserted at index 1");
        linkedList.set(0, "Updated First");
        System.out.println(linkedList);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;    
        System.out.println("Time taken: " + duration + " nanoseconds");
    }
}
