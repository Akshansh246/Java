public class ArrayOutOfBounds {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        try {
            System.out.println(arr[9]); 
        } 
        catch (Exception e) {
            System.out.println(e);
        }
        finally{
            System.out.println("Sab theek h (●'◡'●)");
        }
        System.out.println("Hello");
        System.out.println("Byeee");
    }
}
