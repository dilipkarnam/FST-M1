package Activities;

class CustomException extends Exception{
    private String message=null;
    public CustomException(String message){
        this.message=message;
    }
    public String getMessage(){
        return message;
    }
}

public class Activity8 {
    public static void main(String[] args) {
        try {
            Activity8.Exceptiontest("Will print");
            Activity8.Exceptiontest(null);
            Activity8.Exceptiontest("Error handled");
        }
        catch (CustomException CE){
            System.out.println("Inside catch"+CE.getMessage());
        }
    }
    static void Exceptiontest(String str) throws CustomException{
        if (str==null){
            System.out.println("String is null");
        }
        else {
            System.out.println(str);
        }
    }
}
