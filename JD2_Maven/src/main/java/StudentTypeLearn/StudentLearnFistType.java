package StudentTypeLearn;

public class StudentLearnFistType implements StudentsLearn {


    @Override
    public void learning(double time, int skill) {
        System.out.println("Student 1st type spends time on: " + "\n" +
                " analysis = " + time / skill + "\n" +
                " practice = " + time / skill + "\n" +
                " flow = " + time / skill);
    }


}
