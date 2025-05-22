import java.util.Scanner;

public class ByUserInputCannotDivideByZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); 
        int b = scanner.nextInt(); 
        try {
            int d = a/b;
            System.out.println("The division of "+a+" and "+b+" is "+d);
        } 
        catch (Exception e) {
            System.err.println("Cannot Divide by zero");
        }
        System.out.println("Helloo");
        System.out.println("Hiiii");
        System.out.println("Byeeee");
    }
}
