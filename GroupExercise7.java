package GroupProject;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class GroupExercise7 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Apple", "Banana", "Avocado", "Grapes", "apricot");

        List<String> filteredStrings = filterAndConvertToLowerCase(stringList);

        System.out.println("Filtered and Lowercase Strings: " + filteredStrings);
    }

    public static List<String> filterAndConvertToLowerCase(List<String> stringList) {
        return stringList.stream()
                .filter(s -> s.startsWith("A"))
                .map(String::toLowerCase)
                .collect(Collectors.toList());
    }
}

