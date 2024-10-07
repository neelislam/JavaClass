import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char section = input.next().charAt(0);

        if (section == 'D') {
            System.out.println("JIM Sir");
        } else if (section == 'E') {
            System.out.println("NIR Sir");
        } else if (section == 'A' || section == 'B' || section == 'C' || section == 'F') {
            System.out.println("JAC Sir");
        } else {
            System.out.println("Invalid Section");
        }
    }
}