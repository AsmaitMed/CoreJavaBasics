package GLAB_303_7;

import java.util.Arrays;
import java.util.Scanner;
//import java.util.Collections;

public class PA_303_7_1 {

    public int a;
    public String b;
    public double c;
    public String d;
    public String e;
    // constructor
    public PA_303_7_1(int a, String b, double c ) {
        this.a = a;
        this.b = b;
        this.c = c;

    }
    public void display()
    {
        System.out.println("Integer is: " + a + ", The string is: "+ b
                + ", The double is: "
                + c);
        System.out.println();
    }

    public static void main(String[] args) {
        /**Write a program that creates an array of integers with a length of 3.
         Assign the values 1, 2, and 3 to the indexes. Print out each array element.**/

        int[] firstArr = new int[]{1, 2, 3};
        for (int i = 0; i < 3; i++) {
            System.out.println(firstArr[i]);
        }
        /**Write a program that returns the middle element in an array. Give the following
         values to the integer array: {13, 5, 7, 68, 2} and produce the following output: 7**/

        int[] intArr = new int[]{13, 5, 7, 68, 2};

        //Check if the array has even number of elements
        if (intArr.length % 2 == 0) {
            System.out.println("The middle elements are: ");

            // even-length array (two middle elements)
            int x = intArr[(intArr.length / 2) - 1];
            System.out.println(x);
            int y = intArr[intArr.length / 2];
            System.out.println(y);
        }

        //if odd number of array elements are present
        else {

            // odd-length array (only one middle element)
            int z = intArr[intArr.length / 2];
            System.out.println("The middle element is: ");
            System.out.println(z);


        }

        /**Write a program that creates an array of String type and
         initializes it with the strings “red,” “green,” “blue,” and “yellow.”
         Print out the array length. Make a copy using the clone( ) method.
         Use the Arrays.toString( ) method on the new array to verify that the
         original array was copied.**/

        String[] colors = new String[]{"red", "green", "blue", "yellow"};
        System.out.println("The length of the colors array is : " + colors.length);
        //copying an array using clone() method
        String[] colorsCopy = colors.clone();
        System.out.println("The copied array is as follows: " + Arrays.toString(colorsCopy));


        /**Write a program that creates an integer array with 5 elements (i.e., numbers).
         The numbers can be any integers.  Print out the value at the first index and the
         last index using length - 1 as the index. Now try printing the value at index = length
         (e.g., myArray[myArray.length] ).  Notice the type of exception which is produced.
         Now try to assign a value to the array index 5. You should get the same type of exception.**/

        int[] arrInt = new int[]{75, 6, 25, 5, 4};
        //printing the first value
        System.out.println("The first value of the first index in arrInt array is : " + arrInt[0]);
        //printing the last value
        System.out.println("The first value of the first index in arrInt array is : " + arrInt[arrInt.length - 1]);
        /**
         //printing the value at index = length. Expected output : Index 5 out of bounds for length 5 exception
         int x =arrInt[arrInt.length];
         System.out.println("The value of the last index in arrInt array is : " + x);
         //assigning value to the array index 5. Expected output : Index 5 out of bounds for length 5 exception
         arrInt[5] = 55;
         System.out.println("The value of the last index in arrInt array is : " + Arrays.toString(arrInt)); **/


        /**Write a program where you create an integer array with a length of 5.
         Loop through the array and assign the value of the loop control variable
         (e.g., i) to the corresponding index in the array.**/

        int[] arr = new int[5];
        System.out.println("The values of the array when assigned the value of i are:");
        for (int i = 0; i < arr.length; i++) {


            System.out.println(arr[i] = i);

        }

        /**Write a program where you create an integer array of 5 numbers.
         Loop through the array and assign the value of the loop control
         variable multiplied by 2 to the corresponding index in the array.**/

        int[] arr1 = new int[5];
        System.out.println("The values of the array when assigned the value of i * 2 are:");
        for (int i = 0; i < arr1.length; i++) {

            System.out.println(arr1[i] = i * 2);

        }

        /**Write a program where you create an array of 5 elements.
         Loop through the array and print the value of each element,
         except for the middle (index 2) element.**/

        int[] arr2 = new int[5];
        System.out.println("The values of the array when index[2] is skipped is:");

        for (int i = 0; i < arr2.length; i++) {
            if (i == 2) {
                continue;
            }
                System.out.println(arr2[i] = i);

            }


        /**Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}.
         Print the array in ascending order, and print the smallest and the largest element of the array.
         The output will look like the following:
         Array in ascending order: 0, 1, 2, 4, 9, 13
         The smallest number is 0
         The biggest number is 13**/

        int [] array = new int[] {4, 2, 9, 13, 1, 0};

        Arrays.sort(array);
        System.out.println("Array in ascending order : " + Arrays.toString(array));
        System.out.println("The smallest number is : " + array[0]);
        System.out.println("The biggest number is : " + (array[array.length -1]));

        //Create an array that includes an integer, 3 strings, and 1 double. Print the array.
        //Here I created an array of objects that stores three of them and treats them as objects.

        PA_303_7_1[] objArray = new PA_303_7_1[5];
        objArray[0] = new PA_303_7_1(5, "houses" , 12.5);
        objArray[1] = new PA_303_7_1(0, "apartments" , 0.0);
        objArray[2] = new PA_303_7_1(0, "Condos" , 0.0);
        System.out.println("Items in Object 1:");
        objArray[0].display();
        System.out.println("Items in Object 2:");
        objArray[1].display();
        System.out.println("Items in Object 3:");
        objArray[2].display();



        /**Write some Java code that asks the user how many favorite things they have.
         Based on their answer, you should create a String array of the correct size.
         Then ask the user to enter the things and store them in the array you created.
         Finally, print out the contents of the array.**/

        System.out.println("How many favorite things do you have?");
        Scanner input = new Scanner(System.in);
        int x= input.nextInt();
        String [] arrayString = new String[x];
        //System.out.println(x);
        for(int j = 0; j < x ; j++){
            System.out.println("Enter your thing:");
            arrayString [j] = input.next() ;


        }

        System.out.println("Your favorite things are : ");

        for (String s : arrayString) {

            System.out.println(s);
            //input.nextLine();

        }


         }
    }

