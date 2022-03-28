package Student;

import StudentTypeLearn.StudentsLearn;

public abstract class Student {
    private double talent;
    private static final int HOURS = 198;
    StudentsLearn type;

    public Student(double talent) {
        this.talent = talent;
    }

    public double getTalent() {
        return talent;
    }

    public double getTime() {
        return HOURS / talent;
    }

    public abstract void display();
}

