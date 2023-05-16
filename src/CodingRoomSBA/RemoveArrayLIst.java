package CodingRoomSBA;

import java.util.ArrayList;
// Remove an Arraylist value using the parameters given.And return the ArrayList.
public class RemoveArrayLIst {


    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Core");
        list.add("Java");
        list.add("Principles");
        ArrayList<String> result = removeArrayListValue(list, "Java");
        System.out.println(result);

    }


    public static ArrayList<String> removeArrayListValue(ArrayList<String> list, String str) {
        list.removeIf((y)-> y.equals(str));
        return list;
    }



}