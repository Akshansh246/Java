import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();
        System.out.print("Enter the operator (+, -, *, /, %): ");
        char o = scanner.next().charAt(0);
        switch (o) {
            case '+':
                System.out.println("Addition : "+(a+b));
                break;
            case '-':
                System.out.println("Subtraction : "+(a-b));
                break;
            case '*':
                System.out.println("Multiplication : "+(a*b));
                break;
            case '/':
                System.out.println("Division : "+((float)a/b));
                break;
            case '%':
                System.out.println("Modulus : "+(a%b));
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }   
}
