public class LinearSearch {
    static int LinearSearch(int[] arr,int key){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,4,5,7,6,99,6,4,33,88};
        int k = LinearSearch(arr,99);
        System.out.println("Element found at "+k+" index position.");
    }
}
