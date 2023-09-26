package GroupProject;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GroupExercise8 {
    public static void main(String[] args) {
        String input1 = "123";
        String input2 = "53456";
        String input3 = "29";

        System.out.println("Incremented String 1: " + increment(input1));
        System.out.println("Incremented String 2: " + increment(input2));
        System.out.println("Incremented String 3: " + increment(input3));
    }

    public static String increment(String str) {
        char[] charArray = str.toCharArray();
        int carry = 1;

        for (int i = charArray.length - 1; i >= 0; i--) {
            int digit = charArray[i] - '0'; // Convert char to integer

            int sum = digit + carry;
            carry = sum / 10;
            charArray[i] = (char) ((sum % 10) + '0'); // Convert back to char
        }

        if (carry > 0) {
            // If there's a carry left, prepend it to the string
            return "1" + new String(charArray);
        } else {
            return new String(charArray);
        }
    }
}

