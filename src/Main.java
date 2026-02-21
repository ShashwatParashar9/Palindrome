import java.util.Scanner;

/*
 * =====================================================
 * MAIN CLASS - UseCase3PalindromeCheckerApp
 * =====================================================
 *
 * Use Case 3: Reverse String Based Palindrome Check
 *
 * Description:
 * This class checks whether a string is a palindrome
 * by reversing the string and comparing it with
 * the original value.
 *
 * Version: 3.0
 */

public class Main{

    /**
     * Application entry point for UC3.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read input
        System.out.print("Input text: ");
        String input = scanner.nextLine();

        String reversed = "";

        // Iterate from the last character to the first (HINT USED)
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // Compare original and reversed string
        boolean isPalindrome = input.equals(reversed);

        // Display result
        System.out.println("Is it a Palindrome?: " + isPalindrome);

        scanner.close();
    }
}