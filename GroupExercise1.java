package GroupProject;

public class GroupExercise1 {
    public static void main(String[] args) {
        StringBuilder first = new StringBuilder("Mikhail");
        StringBuilder second = new StringBuilder("Elvira");

        System.out.println("Before swapping:");
        System.out.println("First: " + first);
        System.out.println("Second: " + second);


        first.append(second);
        second = new StringBuilder(first.substring(0, first.length() - second.length()));
        first = new StringBuilder(first.substring(second.length()));

        System.out.println("After swapping:");
        System.out.println("First: " + first);
        System.out.println("Second: " + second);
    }
}

