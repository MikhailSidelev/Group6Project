package GroupProject;

import class21.A;
import class21.B;

public class Main {
    public static void main(String[] args) {

        A studentA = new A(85, 90, 78);
        B studentB = new B(75, 80, 92, 88);


        System.out.println("Average Percentage for Student A: " + studentA.getPercentage() + "%");
        System.out.println("Average Percentage for Student B: " + studentB.getPercentage() + "%");
    }
}
