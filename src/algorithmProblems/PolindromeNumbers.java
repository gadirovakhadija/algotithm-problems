package algorithmProblems;

import java.util.Scanner;

public class PolindromeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome number.");
        } else {
            System.out.println(number + " is not a palindrome number.");
        }
    }

    public static boolean isPalindrome(int number) {
        String numberString = Integer.toString(number);
        String reversedNumberString = reverseString(numberString);

        return numberString.equals(reversedNumberString);
    }

    public static String reverseString(String input) {
        if (input.isEmpty()) {
            return input;
        }

        return reverseString(input.substring(1)) + input.charAt(0) ;
    }
}
