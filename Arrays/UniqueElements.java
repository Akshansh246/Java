public class UniqueElements {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 3, 8};
        System.out.println("Unique elements in arr1 : ");
        for (int i = 0; i < arr1.length; i++) {
            boolean found = false;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i]==arr2[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println(arr1[i]+" ");
            }
        }
        System.out.println("Unique elements in arr2 : ");
        for (int i = 0; i < arr1.length; i++) {
            boolean found = false;
            for (int j = 0; j < arr2.length; j++) {
                if (arr2[i]==arr1[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println(arr1[i]+" ");
            }
        }

    }
}
