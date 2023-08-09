package Activities;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Dilip");
        hs.add("Kumar");
        hs.add("Venkat");
        hs.add("Gopi");
        hs.add("Sridhar");
        hs.add("Jai");
        System.out.println("Original values in Hashset : "+hs);
        for(String s:hs){
            System.out.println("Original values in Hashset : "+s);
        }
        System.out.println("Size of hashset :" +hs.size());
        hs.remove("Dilip");
        System.out.println("Values in Hashset after removing Dilip "+hs);
        if (hs.remove("Phani")){
            System.out.println("Phani is removed from the Hashset");
        }
        else {
            System.out.println("Phani not available in the Hashset");
        }
    }
}
