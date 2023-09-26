package GroupProject;

public class GroupExercise4 {
    public static void main(String[] args) {
        String input = "Goodbye, My Love, Goodbye";
        int wordCount = countWords(input);

        System.out.println("Input String: " + input);
        System.out.println("Number of Words: " + wordCount);
    }

    public static int countWords(String input) {

        String[] words = input.split("[\\s\\p{Punct}]+");

        int count = 0;
        for (String word : words) {
            if (!word.isEmpty()) {
                count++;
            }
        }

        return count;
    }
}

