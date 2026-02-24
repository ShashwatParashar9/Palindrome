import java.util.Scanner;

public class B1P1_RA2411003010721 {

    // Method to check palindrome after normalization
    public static boolean isPalindrome(String input) {

        // Step 1: Normalize string
        // Remove all non-alphanumeric characters (including spaces)
        // Convert to lowercase
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Step 2: Apply two-pointer logic
        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("Palindrome ✅ (Ignoring spaces & case)");
        } else {
            System.out.println("Not a Palindrome ❌");
        }

        scanner.close();
    }
}