public class smallestEleInArray {
    static int small(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,5,1,7};
        int m = small(arr);
        System.out.println(m);
    }
}
