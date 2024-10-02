import java.util.Scanner;

public class SumOfLetters {
    // Method to generate Fibonacci-like sequence for alphabets
    public static int getFibonacciValue(char ch) {
        // Base cases for first two alphabets
        if (ch == 'A') return 0;
        if (ch == 'B') return 1;

        // Generate Fibonacci values for other alphabets
        int a = 0, b = 1, fibValue = 0;
        for (char i = 'C'; i <= ch; i++) {
            fibValue = a + b; // Next Fibonacci number
            a = b;
            b = fibValue;
        }
        return fibValue;
    }

    // Main method to calculate the sum of the Fibonacci values of letters in the word
    public static int sumOfLetters(String word) {
        int sum = 0;
        
        // Convert the word to uppercase to handle both cases
        word = word.toUpperCase();
        
        // Loop through each character in the word
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            
            // Get the Fibonacci-like value of the character and add it to the sum
            sum += getFibonacciValue(currentChar);
        }
        
        return sum;
    }

    public static void main(String[] args) {
        // Read input from the user
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        
        // Calculate and print the sum of the Fibonacci values of the letters in the word
        int result = sumOfLetters(word);
        System.out.println(result);
    }
}