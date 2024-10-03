import java.util.Scanner;

public class input_newar_code {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        System.out.print("Enter your phone number: ");
        String phone = scanner.nextLine();

        System.out.print("Enter your CG (Cumulative Grade): ");
        double cg = scanner.nextDouble();
        System.out.println("\n------------------------------------------------");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phone);
        System.out.println("CG: " + cg);
    }
}
