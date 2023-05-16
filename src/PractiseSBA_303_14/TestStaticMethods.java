package PractiseSBA_303_14;

interface StaticMethods {

        static void methodOne() {
        System.out.println("m");
    }
}

 class TestStaticMethod implements StaticMethods {

     public static void main(String[] args) {

         //It is not possible to call methodOne from here because static methods
         //can not be overriden or inherited by subclasses.
         //but we can use the interface name to directly call the methodOne
         StaticMethods.methodOne();

         // Call the overridden methodTwo() in TestStaticMethod
         TestStaticMethod.methodTwo();
     }

     static void methodTwo() {
         System.out.println("M");
     }
 }





