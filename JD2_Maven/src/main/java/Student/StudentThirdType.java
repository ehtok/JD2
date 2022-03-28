package Student;

import StudentTypeLearn.StudentLearnThirdType;

public class StudentThirdType extends Student {


    public static final int COUNT_SKILL = 1;
    public static final int MULTIPLIER_LEARNING_TIME = 3;

    public StudentThirdType(double talent) {
        super(talent);
        type = new StudentLearnThirdType();
    }

    @Override
    public void display() {
        System.out.println("Student 3nd type has skill: " + getTalent() +
                "\n" + "Student 3nd type has spent time for all studies : " + getTime() * MULTIPLIER_LEARNING_TIME);
        type.learning(getTime() * MULTIPLIER_LEARNING_TIME, COUNT_SKILL);


    }
}
