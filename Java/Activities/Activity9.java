package Activities;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {

        ArrayList<String> myList = new ArrayList<>();
        myList.add("Dilip");
        myList.add("Kumar");
        myList.add("Karnam");
        myList.add("Venkat");
        myList.add("Gopi");
        myList.add(3,"Ananth");
        for (String n : myList) {
            System.out.println(n);
        }
        System.out.println("3rd Name in the list "+ myList.get(2));
        System.out.println("Kumari exist in the array ?"+ myList.contains("Kumari"));
        System.out.println("Size of array before removal "+ myList.size());
        myList.remove(2);
        System.out.println("Size of array after removal "+ myList.size());

    }
}