import java.util.Scanner;

public class invertedRightTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - i - 1; j++){
                    System.out.print("  ");
                }
                for (int k = 0; k <= i; k++){
                    System.out.print("* ");
                }
                System.out.println();   
            }    
            
    }
}

