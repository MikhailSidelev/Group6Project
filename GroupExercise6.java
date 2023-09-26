package GroupProject;

import java.util.Arrays;

public class GroupExercise6 {
    public static void main(String[] args) {
        String input = "desafortuandamente";
        char firstNonRepeatingChar = findFirstNonRepeatingChar(input);

        System.out.println("Input String: " + input);
        System.out.println("First Non-Repeating Character: " + firstNonRepeatingChar);
    }

    public static char findFirstNonRepeatingChar(String input) {

        int[] charFrequencies = new int[256];


        for (char c : input.toCharArray()) {
            charFrequencies[c]++;
        }


        for (char c : input.toCharArray()) {
            if (charFrequencies[c] == 1) {
                return c;
            }
        }


        return '\0';
    }
}

