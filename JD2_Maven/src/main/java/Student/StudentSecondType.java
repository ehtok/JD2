package Student;

import StudentTypeLearn.StudentLearnSecondType;

public class StudentSecondType extends Student {


    public static final int COUNT_SKILL = 2;
    public static final int MULTIPLIER_LEARNING_TIME = 2;

    public StudentSecondType(double talent) {
        super(talent);
        type = new StudentLearnSecondType();
    }

    @Override
    public void display() {
        System.out.println("Student 2nd type has skill: " + getTalent() +
                "\n" + "Student 2nd type has spent time for all studies : " + getTime() * MULTIPLIER_LEARNING_TIME);
        type.learning(getTime() * MULTIPLIER_LEARNING_TIME, COUNT_SKILL);
    }
}
