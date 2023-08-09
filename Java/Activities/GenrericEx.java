package Activities;

public class GenrericEx {

    public static <T> T Echo(T Text){
        return Text;
    }

    public static void main(String[] args) {
        System.out.println(Echo("Hello"));
        System.out.println(Echo(52));

    }
}

