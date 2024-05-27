import java.util.Scanner;

public class q17 {

    // Method to count the number of vowels in a char array
    public static int countVowels(char[] message) {
        int vowelCount = 0; // Initialize vowel count to 0
        for (char c : message) { // Loop through each character in the array
            c = Character.toLowerCase(c); // Convert character to lowercase
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelCount++; // Increment count if character is a vowel
            }
        }
        return vowelCount; // Return the total vowel count
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for input
        System.out.print("Enter your message: "); // Prompt user for input
        String input = sc.nextLine(); // Read the user's input as a string
        char[] message = input.toCharArray(); // Convert the string to a char array
        int vowels = countVowels(message); // Call countVowels method
        System.out.println("Number of vowels: " + vowels); // Print the vowel count
        sc.close(); // Close the Scanner object
    }
}
