import java.util.Scanner;

public class DivisionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            int result = a / b;
            System.out.println(result);
            
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero error");
        } finally {
            scanner.close();
        }
    }
}