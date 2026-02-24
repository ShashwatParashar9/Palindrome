import java.util.Scanner;

import java.util.Scanner;

public class B1P1_RA2411003010721  {

    // Recursive method to check palindrome
    public static boolean isPalindrome(String input, int start, int end) {

        // Base Condition: If pointers cross or meet
        if (start >= end) {
            return true;
        }

        // If characters do not match
        if (input.charAt(start) != input.charAt(end)) {
            return false;
        }

        // Recursive call for inner substring
        return isPalindrome(input, start + 1, end - 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean result = isPalindrome(input, 0, input.length() - 1);

        if (result) {
            System.out.println("Palindrome ✅");
        } else {
            System.out.println("Not a Palindrome ❌");
        }

        scanner.close();
    }
}