package GroupProject;

public class Marks {
    double getPercentage() {
        return 0;
    }
}

// Class A representing Student A
class A extends Marks {
    private double subject1, subject2, subject3;

    public A(double subject1, double subject2, double subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    @Override
    double getPercentage() {
        // Calculate the average percentage for Student A (3 subjects)
        return (subject1 + subject2 + subject3) / 3;
    }
}

// Class B representing Student B
class B extends Marks {
    private double subject1, subject2, subject3, subject4;

    public B(double subject1, double subject2, double subject3, double subject4) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
    }

    @Override
    double getPercentage() {
        // Calculate the average percentage for Student B (4 subjects)
        return (subject1 + subject2 + subject3 + subject4) / 4;
    }
}

