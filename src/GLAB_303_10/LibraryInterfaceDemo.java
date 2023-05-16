package GLAB_303_10;


import com.sun.source.tree.BreakTree;

interface LibraryUser {
    public int registerAccount(int age);
    public String requestBook(String bookType);


}
/**public class LibraryInterfaceDemo {
    public static void main(String[] args) {



    }
}**/

    class KidUser implements LibraryUser {
        int age;
        String bookType;

    public static void main(String[] args) {
        LibraryUser lk = new KidUser();
        lk.registerAccount(10);
        lk.requestBook("Kids");
        lk.registerAccount(18);
        lk.requestBook("Fiction");
        LibraryUser la = new AdultUser();
        la.registerAccount(5);
        la.requestBook("Kids");
        la.registerAccount(23);
        la.requestBook("Fiction");
    }
    @Override
        public int registerAccount(int age) {

            if (age <=11){
                System.out.println("You have successfully registered under a Kids Account");

            }
            else {
                System.out.println("Sorry, age must be less than 12 to register as a kid.");
            }
            return age;

        }

        @Override
        public String requestBook(String bookType) {
            if (bookType == "Kids" ){
                System.out.println("Book issued successfully, please return the book within 10 days");

            }
            else {
                System.out.println("Oops, you are allowed to take only kids books.");
            }
            return bookType;

        }

    }

     class AdultUser implements LibraryUser {
        int age;
        String bookType;
        public int registerAccount(int age) {
            if (age >=12){
                System.out.println("You have successfully registered under an Adult Account");

            }
            else if (age <=11){
                System.out.println("Sorry, age must be greater than 12 to register as an adult.");
            }
            return age;

        }



        @Override
        public String requestBook(String bookType) {
            if (bookType == "Fiction" ){
                System.out.println("Book issued successfully, please return the book within 7 days");

            }
            else {
                System.out.println("Oops, you are allowed to take only Adult Fiction books.");
            }
            return bookType;

        }
    }














