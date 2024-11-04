import java.util.Scanner;

public class WordMatcher {
    public static void main(String[] args) {
        // Create an array of words
        String[] words = {"apple", "banana", "cherry", "date", "elderberry"};

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a word to find
        System.out.println("Please enter a word to find:");
        String userInput = scanner.nextLine();

        // Flag to check if the word is found
        boolean found = false;

        // Check each word in the array
        for (int i = 0; i < words.length; i++) {
            if (words[i].equalsIgnoreCase(userInput)) {
                System.out.println("Word found: \"" + words[i] + "\" at index " + i);
                found = true;
                break; // Exit the loop after finding the first match
            }
        }

        // If the word was not found, print a message
        if (!found) {
            System.out.println("Word not found.");
        }

        // Close the scanner
        scanner.close();
    }
}

