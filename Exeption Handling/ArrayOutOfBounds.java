public class ArrayOutOfBounds {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        try {
            System.out.println(arr[1]);
        } 
        catch (Exception e) {
            System.out.println("Array Out of Bounds");
        }
        finally{
            System.out.println("Sab theek h (●'◡'●)");
        }
        System.out.println("Hello");
        System.out.println("Byeee");
    }
}
