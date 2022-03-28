import Student.Student;
import Student.StudentFirstType;
import Student.StudentSecondType;
import Student.StudentThirdType;

public class Runner {

    public static void main(String[] args) {
        Student student1 = createStudentFistType();
        student1.display();

        System.out.println("-------------------------------------------");

        Student student2 = createStudentFistType();
        student2.display();

        System.out.println("-------------------------------------------");
        Student student3 = createStudentFistType();
        student3.display();

        System.out.println("-------------------------------------------");

        Student student4 = createStudentSecondType();
        student4.display();

        System.out.println("-------------------------------------------");

        Student student5 = createStudentSecondType();
        student5.display();

        System.out.println("-------------------------------------------");

        Student student6 = createStudentSecondType();
        student6.display();

        System.out.println("-------------------------------------------");

        Student student7 = createStudentThirdType();
        student7.display();

        System.out.println("-------------------------------------------");

        Student student8 = createStudentThirdType();
        student8.display();

        System.out.println("-------------------------------------------");

        Student student9 = createStudentThirdType();
        student9.display();

        System.out.println("-----------------end-----------------------");


    }

    private static Student createStudentThirdType() {
        Student student = new StudentThirdType((double) Math.round((Math.random() * 1 + 0.1) * 100) / 100);
        return student;
    }

    private static Student createStudentSecondType() {
        Student student = new StudentSecondType((double) Math.round((Math.random() * 1 + 0.1) * 100) / 100);
        return student;
    }

    private static Student createStudentFistType() {
        Student student = new StudentFirstType((double) Math.round((Math.random() * 1 + 0.1) * 100) / 100);
        return student;
    }
}
