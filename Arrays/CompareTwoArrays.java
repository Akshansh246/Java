public class CompareTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,6,5};
        boolean flag = true;
        for (int i = 0; i < arr2.length; i++) {
            if (arr1[i]!=arr2[i]) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Arrays are equal");
        }
        else System.out.println("Arrays are not equal");
    }
}
