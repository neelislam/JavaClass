//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static{
        System.out.println("This is static block");
    }
    public static void main(String[] args) {
        int result = Calculate.cube(7);
        System.out.println("The cube of 7 is " + result);
    }
}