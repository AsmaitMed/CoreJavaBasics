package CodingRoomSBA;
import java.util.*;
import java.lang.Throwable;

//Create a class called MyException that extends Exception.
// The constructor you create will match the super class.
// Choose a superclass constructor that will let you print out a message.
//Create a class called TypingPractice with one method called typeAbc that is static and void.
// The method typeAbc will allow the user to type a String. Use the scanner class to receive
// an input from the user. if the String does not match “abc” throw new MyException() with a String
// as a parameter that says “incorrect input”. Use a try catch, in the try block  throw the custom exception.
// In the catch block printout the exception using the exception.getMessage method.

public class CustomException {


    public static void main(String[] args) {
        /// Method

        TypingPractice.typeABC();

    }

}

/// Create a class called MyException that extends Exception.

class MyException extends Exception{

    public MyException(String s) {
        super(s);

    }

}


// Create class typingPractice with a static void method call typeABC
class TypingPractice {
    public static void typeABC(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the string value");
        String input = sc.nextLine();
        try{

            if(!input.equals("abc")){
                throw new MyException("incorrect input");

            }
        }   catch(MyException e) {
            System.out.println(e.getMessage());
        }
    }
}

