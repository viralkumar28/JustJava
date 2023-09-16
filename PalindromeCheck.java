import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int result = checkPalindrome(inputString);
        System.out.println("Result: " + result);
    }

    public static int checkPalindrome(String inputString) {
        // Reverse the input string
        String reversedString = reverseString(inputString);

        // Check if the original string and reversed string are palindromes
        if (inputString.equals(reversedString)) {
            return 1; // Palindrome
        } else {
            return 0; // Not a palindrome
        }
    }

    public static String reverseString(String str) {
        // Create a StringBuilder to reverse the string
        StringBuilder reversed = new StringBuilder(str);
        reversed.reverse();
        return reversed.toString();
    }
}