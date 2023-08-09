package Activities;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Activity2 {
    public static void main(String[] args) {
        int[] arr = {10, 17, 10, 54, -11, 10, 10};
        int initial = 10;
        int final1 = 40;
        System.out.println(Arrays.toString(arr));
        System.out.println("4 times 10's in the array: " + result1(arr, initial, final1));
    }

    public static boolean result1(int[] num, int inital, int final1) {
        int tempnum = 0;
        for (int num1 : num) {
            if (num1 == inital) {
                tempnum += inital;
            }
            if (tempnum > final1) {
                System.out.println("Not having proper count");
                break;
            }
        }
        return tempnum==final1;
    }
}
