package StudentTypeLearn;

public class StudentLearnThirdType implements StudentsLearn {
    @Override
    public void learning(double time, int skill) {
        System.out.println("Student 3nd type spends time on: " + "\n" +
                " analysis = " + time / skill + "\n" +
                "Student 3nd doesn't spend time on practice" + "\n" +
                "Student 3nd doesn't spend time on flow!");
    }
}
