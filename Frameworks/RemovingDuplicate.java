import java.util.ArrayList;
import java.util.HashSet;

public class RemovingDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 1, 2, 3};
        HashSet<Integer> uniqueElements = new HashSet<>();
        for (int num : arr) {
            uniqueElements.add(num);
        }
        System.out.println("Array with duplicates removed: " + uniqueElements);  
        
        
        ArrayList<Integer> arrList = new ArrayList<>();
        for (int num : arr) {
            if (!uniqueElements.contains(num)) {
                arrList.add(num);
            }
            else {
                uniqueElements.remove(num);
            } 
        } 
        System.out.println(arrList);
    }
}
