package Activities;
interface addable{
    int add(int a, int b);
 //   int sub(int c, int d);
}
public class Activity12 {
    public static void main(String[] args) {
        addable add1 = (a,b) -> (a+b);
        System.out.println("Addion :" +add1.add(10,20));

    }
}

