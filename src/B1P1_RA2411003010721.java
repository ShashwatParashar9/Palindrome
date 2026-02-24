import java.util.*;

// Step 1: Strategy Interface
interface PalindromeStrategy {
    boolean checkPalindrome(String input);
}

// Step 2: Stack Strategy Implementation
class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean checkPalindrome(String input) {

        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        Stack<Character> stack = new Stack<>();

        for (char ch : normalized.toCharArray()) {
            stack.push(ch);
        }

        for (char ch : normalized.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

// Step 3: Deque Strategy Implementation
class DequeStrategy implements PalindromeStrategy {

    @Override
    public boolean checkPalindrome(String input) {

        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        Deque<Character> deque = new ArrayDeque<>();

        for (char ch : normalized.toCharArray()) {
            deque.addLast(ch);
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }

        return true;
    }
}

// Step 4: Context Class
import java.util.*;

public class B1P1_RA2411003010721 {

    // ------------------ Algorithm 1: Two Pointer ------------------
    public static boolean twoPointer(String input) {
        String str = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // ------------------ Algorithm 2: Stack ------------------
    public static boolean stackMethod(String input) {
        String str = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }

        for (char ch : str.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    // ------------------ Algorithm 3: Deque ------------------
    public static boolean dequeMethod(String input) {
        String str = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        Deque<Character> deque = new ArrayDeque<>();

        for (char ch : str.toCharArray()) {
            deque.addLast(ch);
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }
        return true;
    }

    // ------------------ Algorithm 4: Recursion ------------------
    public static boolean recursiveMethod(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return recursiveCheck(str, 0, str.length() - 1);
    }

    private static boolean recursiveCheck(String str, int start, int end) {
        if (start >= end) return true;
        if (str.charAt(start) != str.charAt(end)) return false;
        return recursiveCheck(str, start + 1, end - 1);
    }

    // ------------------ Main ------------------
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Two Pointer
        long start = System.nanoTime();
        boolean result1 = twoPointer(input);
        long end = System.nanoTime();
        long time1 = end - start;

        // Stack
        start = System.nanoTime();
        boolean result2 = stackMethod(input);
        end = System.nanoTime();
        long time2 = end - start;

        // Deque
        start = System.nanoTime();
        boolean result3 = dequeMethod(input);
        end = System.nanoTime();
        long time3 = end - start;

        // Recursion
        start = System.nanoTime();
        boolean result4 = recursiveMethod(input);
        end = System.nanoTime();
        long time4 = end - start;

        System.out.println("\nResults:");
        System.out.println("-----------------------------------");
        System.out.println("Two Pointer  : " + result1 + " | Time: " + time1 + " ns");
        System.out.println("Stack Method : " + result2 + " | Time: " + time2 + " ns");
        System.out.println("Deque Method : " + result3 + " | Time: " + time3 + " ns");
        System.out.println("Recursion    : " + result4 + " | Time: " + time4 + " ns");
        System.out.println("-----------------------------------");

        scanner.close();
    }
}