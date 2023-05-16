package GLAB_303_7;

import java.util.Arrays;

public class ArrayManupilation {
    public static void main(String[] args) {
// Using the Arrays.toString() method to convert the arrays into Strings
        boolean [] boolArr = new boolean[] {true, true, false, true } ;
        int[] byteArr = new int[] {50,20,30};
        char[] charArr = new char[] { 'g' , 'e' , 'e' , 'k' , 's'};

        System.out.println(Arrays.toString(boolArr));
        System.out.println(Arrays.toString(byteArr));
        System.out.println(Arrays.toString(charArr));
        int [] x = new int[15];
        Arrays.fill(x, 3);
        // Insert elements using Arrays.fill()
        System.out.println(Arrays.toString(x));
        //Sorting elements of an array
        Arrays.sort(charArr);
        System.out.println(Arrays.toString(charArr));




    }

}
