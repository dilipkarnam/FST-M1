package Activities;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterationEx {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Dilip");
        list1.add("Kumar");
        list1.add("Karnam");

 //       for(String name: list1){
 //           System.out.println(name);
 //      }
        Iterator<String> iter = list1.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
