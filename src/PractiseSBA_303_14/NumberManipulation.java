package PractiseSBA_303_14;

public class NumberManipulation {
    @FunctionalInterface
    interface AddTwoNumbers {
        Integer add(int a, int b);

    }

    public static void main(String[] args) {


    // Lambda expression to add two numbers
    AddTwoNumbers result = (a, b) -> a + b;
        // Lambda expression to subtract two numbers
       // AddTwoNumbers result = (a, b) -> a - b;



    // Example usage
    int x = 8, y = 19;
System.out.println(result.add(x, y));


}
}
