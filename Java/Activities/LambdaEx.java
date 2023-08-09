package Activities;

import java.util.ArrayList;
import java.util.List;

public class LambdaEx {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(45);
        nums.forEach(num -> {
            if (num % 2 == 0) {
                System.out.println(num + " Even number");
            } else {
                System.out.println(num + " Odd number");
            }
        });

    }

}

