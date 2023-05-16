package GLAB_303_5;

import java.util.Scanner;

public class LoopDemoOne {
    public static void main(String[] args) {
        int n = 5;
        //for loop
        for (int i = 1; i <= n; ++i) {
            System.out.println("Java is fun");
        }
        //program to find the sum of natural numbers from 1 to 1000.
        int sum = 0;
        int n1 = 1000;
        //for loop
        for (int j = 0; j <= 1000; j++) {
            sum += j;
        }
        System.out.println("Sum = " + sum);

        //program to find if a number is palindrome

        String original, reversed = ""; // Objects of the string class
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the string / number to check if it is a palindrome");
        original = input.nextLine();
        int length = original.length();
        for (int a = length - 1; a >= 0; a--) {
            reversed = reversed + original.charAt(a);
        }
        if (original.equals(reversed)) {
            System.out.println("Entered number / string is a palindrome. ");
        } else {
            System.out.println("Entered string / number is not a palindrome.");
        }

        //program to apply nested for loops
        for (int b = 1; b <= 5; b++) {
            for (int c = 1; c <= b; c++) {
                System.out.print("* ");

            }
            System.out.println();// new line
        }


    }
}





