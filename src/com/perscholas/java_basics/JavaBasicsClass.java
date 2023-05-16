package com.perscholas.java_basics;

public class JavaBasicsClass {

    public static void main(String[] args) {
        /**Write a program that declares two integer variables, assigns an integer to each, and adds them together.
        Assign the sum to a variable. Print out the result.**/

        int x1 = 7;
        int y1 = 15;

        int i_sum = x1+y1;
        System.out.println("The sum of the two numbers is " + i_sum);

        /** Write a program that declares two double variables, assigns a number to each, and adds them together.
        Assign the sum to a variable. Print out the result.**/

        double a = 15.2;
        double b = 85.2;

        double d_sum = a+b;
        System.out.println("The sum of the two double values is " + d_sum);

        /**Write a program that declares an integer variable and a double variable, assigns numbers to each,
        and adds them together. Assign the sum to a variable. Print out the result. What variable type must the sum be?**/

        int s = 5;
        double j = 14.3;

        double sum = s + j;
        System.out.println("The sum of the two values is " + sum);

        /**Write a program that declares two integer variables, assigns an integer to each, and divides
        the larger number by the smaller number. Assign the result to a variable. Print out the result.
         Now change the larger number to a decimal. What happens? What corrections are needed?**/

        int g = 25;
        int k = 60;

        int result = k/g;
        System.out.println("The result of the two int values is " + result);
        double k1 = 60.8;

        double result1 = k/g;
        System.out.println("The result of the two values is " + result1);

        /**Write a program that declares two double variables, assigns a number to each, and divides
        the larger by the smaller number. Assign the result to a variable. Print out the result. Now,
         cast the result to an integer. Print out the result again.**/

        double i = 33.25;
        double h = 54.7;
        double result2 = h/i;
        System.out.println("The result of the two double values is " + result2);
        int w = (int)result2;
        System.out.println("The casted result is " + w);

        /**Write a program that declares two integer variables, x and y, and assigns the number 5 to x
        and the number 6 to y. Declare a variable q and assign y/x to it and print q. Now, cast y to
         a double and assign it to q. Print q again**/

        int x = 5;
        int y = 6;
        int q = y/x;
        System.out.println("The result is " + q);
        double q1 = y;
        System.out.println("The result is " + q1);

        /**Write a program that declares a named constant and uses it in a calculation.
         Print the result.**/

        double radius = 4.5;
        final double pi = 3.14;
        double area = pi * radius * radius;
        System.out.println("The are of the circle is " + area);


        /**Write a program where you create three variables that represent products at a cafe.
        The products could be beverages like coffee, cappuccino, espresso, green tea, etc. Assign
         prices to each product. Create two more variables called subtotal and totalSale and complete an “order”
         for three items of the first product, four items of the second product, and two items of the third product.
         Add them all together to calculate the subtotal. Create a constant called SALES_TAX and add sales tax to the
         subtotal to obtain the totalSale amount. Be sure to format the results to two decimal places.**/

        double coffee_price = 4.5;
        double espresso_price = 3.2;
        double cake_price = 5.2;
        final double SALES_TAX = 0.075;
        double order1 = coffee_price * 3;
        double order2 = espresso_price * 4;
        double order3 = cake_price * 2;
        double subtotal = order1 + order2 + order3;
        double totalSale = subtotal + SALES_TAX * subtotal;
        System.out.println("The total sale amount including tax is : " + String.format("%.2f" ,totalSale));

         }
}
