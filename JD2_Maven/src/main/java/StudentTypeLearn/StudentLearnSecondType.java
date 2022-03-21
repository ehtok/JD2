package StudentTypeLearn;

public class StudentLearnSecondType implements StudentsLearn {
    @Override
    public void learning(double time, int skill) {
        System.out.println("Student 2nd type spends time on: " + "\n" +
                " analysis = " + time / skill + "\n" +
                " practice = " + time / skill + "\n" +
                "Student 2nd doesn't spend time on flow!");
    }
}
