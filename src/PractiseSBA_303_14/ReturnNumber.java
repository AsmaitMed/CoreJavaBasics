package PractiseSBA_303_14;

public class ReturnNumber {
    //Use lambdas expressions to return the number.
    @FunctionalInterface
    interface MyNumber {
        Integer showNumber(int num);
    }

    public static void main(String[] args) {


    // Example 1: Using parameter -> expression lambda expression
    MyNumber number1 = (num) -> num;

    // Example 2: Using (parameter) -> { expression } lambda expression
    MyNumber number2 = (num) -> {
        return num;
    };

System.out.println(number1.showNumber(3));
System.out.println(number2.showNumber(7));
}
}
