public class CannotDivideByZero {
    public static void main(String[] args) {
        int a = 10, b = 0;
        try {
            int d = a/b;
            System.out.println(d);
        } 
        catch (Exception e) {
            System.err.println("Cannot Divide by zero");
        }
        System.out.println("Helloo");
        System.out.println("Hiiii");
        System.out.println("Byeeee");
    }    
}
