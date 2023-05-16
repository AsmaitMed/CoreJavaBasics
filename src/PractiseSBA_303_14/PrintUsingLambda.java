package PractiseSBA_303_14;
import java.util.*;




//Use three different forms of a  lambda expression in the ArrayList's forEach() method to print every item in the list:
//parameter -> expression
//(parameter) -> expression
//(parameter) ->{ expression}
public class PrintUsingLambda {


    public static void main(String[] args) {


    ArrayList<String> names = new ArrayList<>();

    String[] firstName = {"Harold", "Luciano", "Tyree", "Nyla", "Natalie", "Quincy", "Devyn", "Aliana"};

  Collections.addAll(names, firstName);

// Print every item in the list using lambda expressions.
    // Using parameter -> expression

        System.out.println("Printing using parameter -> expression \n");
            names.forEach(name -> System.out.println(name + "\n"));


    // Using (parameter) -> expression

        System.out.println("Printing using (parameter) -> expression \n");
             names.forEach((name) -> System.out.println(name + "\n"));

    // Using (parameter) -> { expression }

        System.out.println("Printing using (parameter) -> { expression } \n");
            names.forEach((name) -> { System.out.println(name + "\n"); });

            // print every item in the list with their index. Using indexOf
        names.forEach((name) -> {
            int index = names.indexOf(name);
            System.out.println(index + " " + name + "\n ");
        });

        //print every item in the list in capital letters.
        names.forEach((name) -> System.out.println(name.toUpperCase()));



    }

}


