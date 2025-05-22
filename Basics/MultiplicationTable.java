import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        for (int i = number; i <= number*10; i=i+number) {
            System.err.println(i);
        }


    }
}
