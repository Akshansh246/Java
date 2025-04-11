import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a float number: ");
        float f = scanner.nextFloat();
        int n = (int)f;
        System.out.println("floating value : "+f);
        System.out.println("int value : "+n);

    }
}
