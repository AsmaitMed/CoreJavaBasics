package CodingRoomSBA;

import java.io.PrintStream;
/**Implement the code for the following methods

 Return a double using printf.  output: a double

 Return a String and a double.  output:  Hello world (double)

 Return a double formatted by 4 decimal places. output: 1.0000

 Return a double formatted by 3 decimal places. output: 1.000

 Return a double formatted by 2 decimal places. output: 1.00

 Add %n to add a new line

**/

 public class FormattingPractise {

    public static void main(String[] args) {
        double num = 100;
        Formatting f = new Formatting();

        f.printDouble(num);
        f.printDoubleAndString("Hello world ",num);
        f.format2Decimal(num);
        f.format3Decimal(num);
        f.format4Decimal(num);

    }
    //1
    public PrintStream printDouble(double d) {
        return null;
    }
    //2
    public PrintStream printDoubleAndString(String s, double d) {
        return null;

    }
    //3
    public PrintStream format4Decimal( double d) {
        return null;
    }
    //4
    public PrintStream format3Decimal(double d) {
        return null;
    }
    //5
    public PrintStream format2Decimal(double d) {
        return null;
    }


}


    class Formatting {

        public PrintStream printDouble(double d) {

            PrintStream ps = new PrintStream(System.out);
            ps.printf(String.valueOf(d));
            System.out.println(" \n" );
            return ps;


        }
        //Return a String and a double.  output:  Hello world (double)
        public PrintStream printDoubleAndString(String s, double d) {
            PrintStream ps = new PrintStream(System.out);
            ps.printf("%s", s);
            ps.printf("("+String.valueOf(d)+")");
            System.out.println(" \n" );
            return ps;
        }

        //Return a double formatted by 4 decimal places. output: 1.0000

        public PrintStream format4Decimal( double d) {
            PrintStream ps = new PrintStream(System.out);
            ps.printf(String.format("%.4f", d/100.0));
            System.out.println(" \n" );
            return ps;
        }

        public PrintStream format3Decimal( double d) {
            PrintStream ps = new PrintStream(System.out);
            ps.printf(String.format("%.3f", d/100.0));
            System.out.println(" \n" );
            return ps;
        }

        public PrintStream format2Decimal( double d) {
            PrintStream ps = new PrintStream(System.out);
            ps.printf(String.format("%.2f", d/100.0));
            System.out.println(" \n" );
            return ps;
        }



    }