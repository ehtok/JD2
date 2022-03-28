package Student;

import StudentTypeLearn.StudentLearnFistType;

public class StudentFirstType extends Student {


    public static final int COUNT_SKILL = 3;

    public StudentFirstType(double talent) {
        super(talent);
        type = new StudentLearnFistType();
    }


    @Override
    public void display() {
        System.out.println("Student 1st type has skill: " + getTalent() +
                "\n" + "Student 1st type has spent time for all studies : " + getTime());
        type.learning(getTime(), COUNT_SKILL);
    }
}
