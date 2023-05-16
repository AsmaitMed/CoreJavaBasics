package GLAB_303_3;

import java.util.Arrays;

public class LengthDemo {
    public static void main(String[] args) {

      // Program to apply the length() method

        String str1 = "Java";
        String str2 = "";

        System.out.println(str1.length());  // 4
        System.out.println(str2.length());  // 0
        System.out.println("Java".length());  // 4
        System.out.println("Java\n".length()); // 5
        System.out.println("Learn Java".length()); // 10

        // Program to check whether the String contains anything or not.
        String s1="";
        String s2="hello";
        System.out.println(s1.isEmpty());      // true
        System.out.println(s2.isEmpty());      // false

        //Program to apply string trim() method to remove the leading and trailing spaces.
        String s3="  hello   ";
        System.out.println(s3+" how are you");        // without trim()
        System.out.println(s3.trim()+" how are you"); // with trim()

        //Program that converts all the characters of the String to lowercase
        String s4="HELLO HOW Are You?";
        String s4lower=s4.toLowerCase();
        System.out.println(s4lower);

        // Program that converts all the characters of the String to uppercase
        String s5="hello how are you";
        String s5upper=s5.toUpperCase();
        System.out.println(s5upper);

        //------By using concat method----
        String strA = "Learn ";
        String strB = "Java";
        // concatenate str1 and str2
        System.out.println(strA.concat(strB)); // "Learn Java"

        // concatenate str2 and str11
        System.out.println(strB.concat(strA)); // "JavaLearn "
        //--- By using + operator---
        String s6 =  "hello";
        String s7 = "Learners";
        //  String s5 = s3.concat(s4); or
        String s8 = s6 + s7;
        //both of the above statement will give you the same result

        // Three strings are concatenated
        String message = "Welcome " + "to " + "Java";

        // String Chapter is concatenated with number 2
        String s = "Chapter" + 2; // s becomes Chapter2

        // String Supplement is concatenated with character B
        String s9 = "Supplement" + 'B'; // s1 becomes SupplementB


        // Program to divide the string at a specified regex
        String vowels = "a::b::c::d:e";

        // splitting the string at "::"
        // storing the result in an array of strings
        String[] result = vowels.split("::");

        // converting array to string and printing it
        System.out.println("result = " + Arrays.toString(result));

        // Program to get characters from a string

        String message1 = "Welcome to Java";
        System.out.println("The first character in the message is " + message1.charAt(0));

        //Program that compares the given string with the current string.

        String s10="hello";
        String s11="hello";
        String s12="hemlo";
        String s13="flag";
        System.out.println(s10.compareTo(s11)); // 0 because both are equal
        System.out.println(s10.compareTo(s12)); //-1 because "l" is only one time lower than "m"
        System.out.println(s10.compareTo(s13)); // 2 because "h" is 2 times greater than "f"

        //A program that  extracts a substring from the string and returns it.

        String str14 = "java is fun";

        // extract substring from index 0 to 3
        System.out.println(str14.substring(0, 4));

        // Program that returns the index of the first occurrence of the specified character/substring within the string.

        String str16 = "Java is fun";
        int result1;

        // getting index of character 's'
        result1 = str16.indexOf('s');

        System.out.println(result1); // 6

        // getting index of character 'J'
        result1 = str16.lastIndexOf('J');
        System.out.println(result1); // 0

        // the last occurrence of 'a' is returned
        result1 = str16.lastIndexOf('a');
        System.out.println(result1); // 3

        // character not in the string
        result1 = str16.lastIndexOf('j');
        System.out.println(result1); // -1

        // getting the last occurrence of "ava"
        result1 = str16.lastIndexOf("ava");
        System.out.println(result1); // 1

        // substring not in the string
        result1 = str16.lastIndexOf("java");
        System.out.println(result1); // -1

        //Program that checks whether the specified string (sequence of characters) is present in the string or not.

        String str17 = "Learn Java";
        Boolean result2;

        // check if str1 contains "Java"
        result2 = str17.contains("Java");
        System.out.println(result2);  // true

        // check if str1 contains "Python"
        result2 = str17.contains("Python");
        System.out.println(result2);  // false

        // check if str1 contains ""
        result2 = str1.contains("");

        System.out.println(result2);  // true

        /**Program that replaces each matching occurrence of the old character/text
        in the string with the new character/text.**/

        String str18 = "abc cba";

        // all occurrences of 'a' is replaced with 'z'
        System.out.println(str18.replace('a', 'z'));

        // all occurences of 'L' is replaced with 'J'
        System.out.println("Lava".replace('L', 'J'));
        // character not in the string
        System.out.println("Hello".replace('4', 'J'));
// all occurrences of "C++" is replaced with "Java"
        System.out.println(str18.replace("C++", "Java"));

        // all occurences of "aa" is replaced with "zz"
        System.out.println("aa bb aa zz".replace("aa", "zz"));

        // substring not in the string
        System.out.println("Java".replace("C++", "C"));


        //Program that compares the original content of the string

        String s19="PerScholas";
        String s20="PerScholas";
        String s21=new String("PerScholas");
        String s22="Teksystem";
        System.out.println(s19.equals(s20));//true
        System.out.println(s19.equals(s21));//true
        System.out.println(s19.equals(s22));//false

        //In this program, the == operator compares references, not values.

        String s23="Perscholas";
        String s24="Perscholas";
        String s25=new String("Perscholas");
        System.out.println(s23==s24);//true (because both refer to same instance)
        System.out.println(s23==s25);//false(because s3 refers to instance created in nonpool)


        String s26="Perscholas";
        String s27="Perscholas";
        String s28="Perscholas";
        System.out.println(s26.compareTo(s27));//0
        System.out.println(s26.compareTo(s28));//1(because s1>s3)
        System.out.println(s28.compareTo(s26));//-1(because s3 < s1 )





    }




}


