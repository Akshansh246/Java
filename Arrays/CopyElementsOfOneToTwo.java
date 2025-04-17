public class CopyElementsOfOneToTwo {
    public static void main(String[] args) {
        int[] arrayOne = {1, 2, 3, 4, 5};
        int[] arrayTwo = new int[arrayOne.length]; 
        for (int i=0; i<arrayOne.length; i++) {
            arrayTwo[i] = arrayOne[i];
        }
        for (int i = 0; i < arrayTwo.length; i++) {
            System.out.print(arrayTwo[i]+" ");
        }
    } 
}
