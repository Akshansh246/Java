public class SumOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};
        int[] brr = new int[5];
        for (int i = 0; i < arr2.length; i++) {
            brr[i] = arr1[i] + arr2[i];
        }
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i]+" ");
        }
    }
}
