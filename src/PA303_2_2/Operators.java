package PA303_2_2;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        /**Write a program that declares an integer a variable x, assigns
         the value 2 to it, and prints out the binary string version of the number
         ( Integer.toBinaryString(x) ). Now, use the left shift operator (<<) to shift
         by 1 and assign the result to x. Before printing the results, write a comment
         with the predicted decimal value and binary string. Now, print out x in
         decimal form and in binary notation.**/
        int x = 2;
        System.out.println("This is the binary version of the number 2 :" + Integer.toBinaryString(x) );
        int x1 = x<<1;
        //prints the decimal value of the new shifted integer : Expected output = 4
        System.out.println("This is the decimal value of the left shifted integer : " + x1);
        //prints the binary string of the new integer : Expected output = 100
        System.out.println("This is the binary string of the new integer : " + Integer.toBinaryString(x1));
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the user input value");
        int userInput = input.nextInt();
        System.out.println("This is the binary version of the user input value :" + Integer.toBinaryString(userInput) );

        int userInput1 = userInput << 1;
        //prints the decimal value of the new shifted integer : Expected output = 4
        System.out.println("This is the decimal value of the left shifted integer : " + userInput1);
        //prints the binary string of the new integer : Expected output = 100
        System.out.println("This is the binary string of the new integer : " + Integer.toBinaryString(userInput1));



        /**Write a program that declares a variable x, and assigns 150 to it, and prints out the binary
        string version of the number. Now use the right shift operator (>>) to shift by 2 and assign the
         result to x. Write a comment indicating what you anticipate the decimal and binary values to be.
         Now print the value of x and the binary string.**/

        int y = 150;
        System.out.println("This is the binary string version of the number 150 : " + Integer.toBinaryString(y));
        int y1 = y >> 2;
        //prints the decimal value of the new shifted integer : Expected output = 37
        System.out.println("This is the decimal value of the right shifted integer : " + y1);
        //prints the binary string of the new integer : Expected output = 100101
        System.out.println("This is the binary string of the new integer : " + Integer.toBinaryString(y1));
        //Now to perform the preceding exercise using different values
        Scanner input2 = new Scanner(System.in);
        System.out.println("Please enter the user input value");
        int userInput2 = input.nextInt();
        //Expected output : 11100001
        System.out.println("This is the binary version of the user input value :" + Integer.toBinaryString(userInput2) );

        int userInput3 = userInput2 << 1;
        //prints the decimal value of the new shifted integer : Expected output = 450
        System.out.println("This is the decimal value of the left shifted integer : " + userInput3);
        //prints the binary string of the new integer : Expected output = 111000010
        System.out.println("This is the binary string of the new integer : " + Integer.toBinaryString(userInput3));

        /**Write a program that declares three int variables: x, y, and z. Assign 7 to x and 17 to y.
         Write a comment that indicates what you predict will be the result of the bitwise and operation
         on x and y. Now use the bitwise and operator to derive the decimal and binary values, and assign the result to z.**/
        int a = 7; // 111
        int b = 17; // 10001
        int c = (a & b);
       //The result of the bitwise operation is : 1
        System.out.println("The decimal value of c is : "  + c);
        //The binary string value of c : 1
        System.out.println("The binary string value of c is : " + Integer.toBinaryString(c));

        /**Now, with the preceding values, use the bitwise and operator to calculate the “or”
         value between x and y. As before, write a comment that indicates what you predict the
         values to be before printing them out.**/

        int c1 = (a|b);
        //The result of the bitwise or operation is : Expected output : 23
        System.out.println("The decimal value of c1 is : "  + c1);
        //The binary string value of c : Expected output : 10111
        System.out.println("The binary string value of c1 is : " + Integer.toBinaryString(c1));

        /**Write a program that declares an integer variable, assigns a number, and uses a postfix
        increment operator to increase the value. Print the value before and after the increment operator.**/

        int z = 15;
        System.out.println("This is the value of z before the increment : " + z);
        System.out.println("This is the postfix increment value of z : " + z++);

        /**Write a program that demonstrates at least three ways to increment a variable by 1 and does this
        multiple times. Assign a value to an integer variable, print it, increment by 1, print it again,
         increment by 1, and then print it again.**/

        int v = 10;
        System.out.println("This is the original value of v : " + v);

        System.out.println("This is one way of incrementing the value of v : " + v++);
        System.out.println("The result of the postfix operator is : " + v);
        System.out.println("This is second way of incrementing the value of v : " + (++v));
        System.out.println("This is third way of incrementing the value of v : " + (v + 1));

        /**Write a program that declares two integer variables: x, and y, and then assigns 5
       to x and 8 to y. Create another variable sum and assign the value of ++x added to y,
         and print the result. Notice the value of the sum (should be 14). Now change the
         increment operator to postfix (x++) and re-run the program. Notice what the value of
         the sum is. The first configuration incremented x, and then calculated the sum,
         while the second configuration calculated the sum, and then incremented x.**/

        int s = 5;
        int d = 8;
       // int sum = ((++s) + d);
       // System.out.println("The value of the sum is : " + sum);
        int sum1 = ((s++) + d);
        System.out.println("The value of the sum is : " + sum1);





















         }
}
