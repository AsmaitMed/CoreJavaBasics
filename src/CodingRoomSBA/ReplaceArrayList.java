package CodingRoomSBA;


import java.util.ArrayList;

//Replace an Arraylist value using the parameters given. And return the Arraylist.
public class ReplaceArrayList {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Advanced");
        list.add("Java");
        list.add("Principles");
        ArrayList<String> result1 = replaceArrayListValue(list, 1, "Python");
        System.out.println(result1);

    }

    public static ArrayList<String> replaceArrayListValue(ArrayList<String> list, int index, String s) {

        list.set(index, s);
        return list ;
    }



}

