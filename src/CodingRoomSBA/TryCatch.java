package CodingRoomSBA;
import java.util.*;

//Create a static void method named divide that will receive two integers from the scanner.
// Use a try-catch block to catch an ArithmeticException and InputMismatchException.
// If you have an ArithmeticException print “Please do not use zero”.
// If you have an InputMismatch print “Please only use integers.
public class TryCatch {

    public static void main(String[] args) {

        divide();
    }

    public static void divide() {
        Scanner scanner = new Scanner(System.in);
        int x, y;
        try {
            System.out.print("Enter the first integer: ");
            x = scanner.nextInt();
            System.out.print("Enter the second integer: ");
            y = scanner.nextInt();
            int result = x / y;
            System.out.println("The result of the first integer divided by the second integer is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Please do not use zero");
        } catch (InputMismatchException e) {
            System.out.println("Please only use integers");
            scanner.nextLine();
        }
    }
}








