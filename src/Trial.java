//import CodingRoomSBA.ArrayCalculations;
/**
import java.util.Scanner;


public class Trial {
        int x;
    public static void main(String[] args) {
        Trial sub = new Trial();
        sub.subtractInt(sub.x);
    }
    //int x;

    public void subtractInt(int x) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number");
        x = sc.nextInt();

        //converting the int input to array of String
        String[] digits = String.valueOf(x).split("");
        //Casting back the array to array of int


        for (int i = 0; i < digits.length; i++) {


            int result = digits[i] - digits[i];
            System.out.println(result);

        }
        //return 0;

    }
}**/
