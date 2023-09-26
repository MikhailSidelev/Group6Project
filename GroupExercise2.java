package GroupProject;

public class GroupExercise2 {
    public static void main(String[] args) {
        String input = "Hello";
        String reversed = reverseString(input);
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
    }

    public static String reverseString(String input) {
        int length = input.length();
        StringBuilder reversed = new StringBuilder(length);


        for (int i = length - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }

        return reversed.toString();
    }
}

