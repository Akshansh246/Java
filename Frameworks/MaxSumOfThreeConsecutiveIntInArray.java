import java.util.ArrayList;

public class MaxSumOfThreeConsecutiveIntInArray {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(-1);
        arr.add(2);
        arr.add(-3);
        arr.add(4);
        arr.add(-5);
        arr.add(6); 
        arr.add(-7);
        int maxSum = Integer.MIN_VALUE;
        int n = arr.size();
        for (int i = 0; i < n - 2; i++) {
            int sum = arr.get(i) + arr.get(i + 1) + arr.get(i + 2);
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        System.out.println("ArrayList: " + arr);
        System.out.println("Maximum sum of three consecutive integers in the array: " + maxSum);
        
    }
}
