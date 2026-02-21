import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read input text
        System.out.print("Input text: ");
        String input = scanner.nextLine();

        boolean isPalindrome = true;

        // Loop only till half of the string length
        for (int i = 0; i < input.length() / 2; i++) {

            if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        System.out.println("Is it a Palindrome?: " + isPalindrome);

        scanner.close();
    }
}