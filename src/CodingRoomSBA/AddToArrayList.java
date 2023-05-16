package CodingRoomSBA;

import java.util.ArrayList;
import java.util.Arrays;

public class AddToArrayList {


    public static void main(String[] args) {
        String[] s = {"a", "b", "c"};
        ArrayList<String> resultArr = addToArrayList(s);
        System.out.println(resultArr);

    }


    //1
    public static ArrayList<String> addToArrayList(String[] s) {

        ArrayList<String> copiedValues = new ArrayList<String>(Arrays.asList(s));
        return copiedValues;
    }
}

/**import java.util.*;
 public class Main {

 public static void main(String[] args) {
 String[] s = {"a", "b", "c"};
 Main ms = new Main();
 ArrayList<String> resultArr= ms.addToArrayList(s);
 System.out.println(Arrays.toString(resultArr));

 }


 //1
 public ArrayList<String> addToArrayList(String[] s) {

 ArrayList<String> copiedValues = new ArrayList<String>();
 for (int i=0; i<s.length;i++) {
 copiedValues.add(String.valueOf(i));
 }

 return copiedValues ;
 }**/