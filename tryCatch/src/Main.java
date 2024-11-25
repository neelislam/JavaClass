import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String c = "Sirbaray diyen";
try{
            System.out.println(c.charAt(100));
        } catch(StringIndexOutOfBoundsException exception){
        System.out.println("String is out of bound bro! Try Again");
        }
        System.out.println("An Exception is handled above...!");
    }


}