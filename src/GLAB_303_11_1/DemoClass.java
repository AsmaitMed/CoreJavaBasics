package GLAB_303_11_1;


//Program to create a generic method: a method that can be
//used with any type of data

public class DemoClass {
    //create a generics method
    public <T> void genericsMethod(T data) {
        System.out.println("Generics Method");
        System.out.println("Data Passed: " + data);
    }


}
 class myRunner3 {
    public static void main(String[] args) {
        /* initialize the class with Integer data */
        DemoClass dObj = new DemoClass();
        dObj.genericsMethod(25);// passing int
        dObj.genericsMethod("Per Scholas");// passing String
        dObj.genericsMethod(2536.5);// passing float
        dObj.genericsMethod('H'); // passing Char
    }
}
