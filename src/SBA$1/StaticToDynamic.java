package SBA$1;

import java.util.ArrayList;

public class StaticToDynamic {

    public static void main(String[] args) {
        String[] arr = {"abcd", "efghi", "jklm", "nopqrs", "tuvwx", "yz"};
        ArrayList<String> list = new ArrayList<>();
        ///list.convert(arr);
        //list.replace(2);
        //ArrayList<String> compactList = list.compact();

    }

    class InvalidStringException extends Exception {
        public InvalidStringException(String message) {
            super(message);
        }

    }

    interface MyList {
        void convert(String[] a);

        void replace(int idx);

        ArrayList<String> compact();
    }

    class ArrayToList implements MyList {
        ArrayList<String> arrayToList;

        //

        public void ArrayToList() {
            arrayToList = new ArrayList<String>();
        }

        @Override
        public void convert(String[] a) {
            for (int i = 0; i <= a.length; i++) {
                arrayToList.add(a[i]);
                System.out.println("I have added the string: " + a[i] + "at index " + i);
            }
        }

        @Override
        public void replace(int idx) {
            String removedString = arrayToList.set(idx, "");
            System.out.println("I have replaced the string: " + removedString + " with a null string");
        }

        @Override
        public ArrayList<String> compact() {
            ArrayList<String> result = new ArrayList<String>();
            for (String s : arrayToList) {
                if (!s.equals("")) {
                    result.add(s);
                }
            }
            return result;
        }
    }

}


