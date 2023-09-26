package GroupProject;

public class GroupExercise3 {
    public static void main(String[] args) {
        String input = "Murarum";
        boolean isPalindrome = isPalindrome(input);

        System.out.println("Input String: " + input);
        System.out.println("Is Palindrome? " + isPalindrome);
    }

    public static boolean isPalindrome(String str) {

        str = str.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

