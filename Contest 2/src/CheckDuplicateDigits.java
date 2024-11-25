import java.util.Scanner;

public class CheckDuplicateDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the 4-digit number
        System.out.print("Enter a 4-digit number: ");
        int number = scanner.nextInt();

        // Array to store the digits
        int[] digits = new int[4];

        // Fill the array with the digits of the number
        for (int i = 3; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }

        // Check for duplicate digits
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                if (digits[i] == digits[j]) {
                    System.out.println("NO");
                    scanner.close();
                    return;
                }
            }
        }

        // If no duplicates found
        System.out.println("YES");

        scanner.close();
    }
}
