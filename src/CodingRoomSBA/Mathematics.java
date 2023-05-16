package CodingRoomSBA;

import java.util.ArrayList;
import java.util.Scanner;

// Create interface Calculations
        interface Calculation {
            int usingModulus(int num);
            int usingModulusMultiply(int number);

}
        public class Mathematics implements Calculation {
            public static void main(String[] args) {
                //int answer = 0;
                Calculation cs = new Mathematics();
                cs.usingModulus(913);
                cs.usingModulusMultiply(913);
               // System.out.println("The results are: " + answer);





            }

            public int usingModulus(int num) {


                // Create an array to hold the numbers
                ArrayList<Integer> list = new ArrayList<>();
                // Check to see it the number is zero
                while (num != 0) {
                    // if it's not zero add to the array list
                    list.add(num % 10);
                    // next you divide to remove the last index
                    num /= 10;
                }
                // Create a variable to hold the answer. I will loop through the array backwards. Since I am subtracting I need the last index value of the arrayList.
                int answer = list.get(list.size() - 1);
                // Loop through the arraylist backwards, but I Start from the second to last index
                for (int i = list.size() - 2; i >= 0; i--) {
                    answer -= list.get(i);

                }
                System.out.println("The result is : " + answer);
                return answer;
            }

            @Override
            public int usingModulusMultiply(int number) {
                // Variable to store answer with one because it's multiplication
                int answer = 1;
                // Check to see it the number is zero
                while (number != 0) {
                    // Variable to hold the number value
                    int temp = number;
                    // Modulus to get the last index
                    temp %= 10;
                    //System.out.println("temp = " + temp);
                    // Multiplying the last index
                    answer *= temp;
                    // next I divide to remove the last index
                    number /= 10;


                }
                System.out.println("The result is : " + answer);
                return (answer);


            }
        }

