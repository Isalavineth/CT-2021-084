package Q_07;

import java.util.Scanner;

public class Q_07 {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a sentence: ");
        // Read the input sentence
        String sentence = scanner.nextLine();
        System.out.println("Please enter a word to be replaced: ");
        // Read the word to be replaced
        String word = scanner.nextLine();
        System.out.println("Please enter a word to replace with: ");
        // Read the word to replace with
        String replace = scanner.nextLine();

        // Find the first occurrence of the word in the sentence
        int location = sentence.indexOf(word);
        // Find the word length
        int wordLength = word.length();
        String temp = sentence;

        // Replace all occurrences of the word in the sentence
        while (location >= 0) {
            temp = sentence.substring(0,location)+replace+sentence.substring(location+wordLength);
            location = temp.indexOf(word);
            sentence = temp;
        }
        // Output the modified sentence
        System.out.println(temp);

    }
}
