package CodingRoomSBA;
import java.util.*;

public class CopyToArray {

    public static void main(String[] args) {

        String[] str = {"Harold", "James", "John", "Andrew", "Philip", "Matthew", "Thomas", "Simon"};
        String s = "a";
        CopyToArray ct = new CopyToArray();

        String[] resultArray = ct.copyToArray(str,s);
        System.out.println(Arrays.toString(resultArray));


    }

    public static String[] copyToArray(String[] str, String s) {
        for (int i = 0; i < str.length; i++) {
            str[i] = s;

        }
        return str;
    }

}
