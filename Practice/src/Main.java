import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;
import java.util.Vector;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> array =  new ArrayList<String>();
        array.add("Hello123");
        array.add("Neel");
        System.out.println(array);

        Vector<String> array1 =  new Vector<String>();
        array1.add("Hello123");
        array1.add("Neel");
        System.out.println(array1);

        Stack<String> array2 =  new Stack<String>();
        array2.add("Hello123");
        array2.add("Neel");
        System.out.println(array2);

        HashSet<String> array3 =  new HashSet<String>();
        array3.add("Hello123");
        array3.add("Neel");
        System.out.println(array3);


    }
}