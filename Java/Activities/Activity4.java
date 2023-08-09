package Activities;

import java.util.Arrays;

public class Activity4 {
    public static void main(String[] args) {
        int[] arrlist = {6, 7, 3, 1, 9, 2, 8};
        System.out.println("Array list before sort: "+Arrays.toString(arrlist));
        Arraysort(arrlist);
        System.out.println("Array list after sort: "+Arrays.toString(arrlist));
    }
    static void Arraysort(int[] num){
        int size = num.length, i;
        System.out.println("Total number of numbers in arry list " +size);
        for(i=1; i<size; i++){
            int numorder = num[i];
            int j=i-1;
            while (j>=0 && numorder< num[j]){
                num[j+1] =num[j];
                --j;
            }
            num[j+1] = numorder;

        }

    }
}
