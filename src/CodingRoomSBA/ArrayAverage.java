package CodingRoomSBA;

public class ArrayAverage {
    public static void main(String[] args) {
        int sum = 0;
        int[] nums = {1,2,3,4,5,6,7,8,9};
        for (int i=0; i<= nums.length-1; i++){
            sum+= nums[i];
        }
        double average = sum/nums.length;
        System.out.println("The average of the array is :"  + String.format("%.2f ", average));
    }
}
