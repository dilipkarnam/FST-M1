package Activities;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Activity11 {
    public static void main(String[] args) {
        HashMap<Integer,String> HM = new HashMap<>();
        HM.put(1,"pink");
        HM.put(2,"white");
        HM.put(3,"black");
        HM.put(4,"yellow");
        HM.put(5,"orange");
        System.out.println("Values in hashmap "+ HM);
        HM.remove(2);
        System.out.println("Values in hashmap "+ HM);
        if (HM.containsValue("green")){
            System.out.println("green color exist in the list");
        }
        else {
            System.out.println("green color doesn't exist in the list");
        }
        System.out.println("Size of the hashmap :"+HM.size());
    }
}
