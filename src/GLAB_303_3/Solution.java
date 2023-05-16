package GLAB_303_3;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {


        String A;
        String B;
        Scanner sc=new Scanner(System.in);

        System.out.println("Please enter the first word in lowercase : " );
        A=sc.next();
        System.out.println("Please enter the second word in lowercase : " );
        B=sc.next();
        System.out.println("The sum of the lengths of A and B is : " + (A.length() + B.length()));
        if (A.compareTo(B) > 0){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        String A1 = (A.substring(0,1).toUpperCase()) + A.substring(1) ;
        String B1 = B.substring(0,1).toUpperCase() + B.substring(1);
        System.out.println("The concatenated word for both words is : " + A1 + "\t" +  B1);


    }
}
