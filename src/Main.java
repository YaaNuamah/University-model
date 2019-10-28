import javax.naming.Name;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("John Doe", 1001, YearofStudent.FIRST),
                new Student("James Dunne", 1002, YearofStudent.SECOND),
                new Student("Emmanuella Asante", 1003, YearofStudent.THIRD),
                new Student("Frederica Goni", 1004, YearofStudent.FOURTH),
                new Student("Betty Stone", 1005, YearofStudent.SECOND),
                new Student("Frank Ofori", 1006, YearofStudent.THIRD),
                new Student("Emmanuel Obeng", 1007, YearofStudent.FIRST),
                new Student("Samuel Asare", 1008, YearofStudent.SECOND),
                new Student("Catherine Asare", 1009, YearofStudent.THIRD),
                new Student("Benjamin Asare", 1010, YearofStudent.THIRD),
                new Student("Prince Johnson", 1011, YearofStudent.FOURTH),
                new Student("Gloria Love", 1012, YearofStudent.SECOND)
        );


        List<Student> introToProgramming = new ArrayList<>();
        for (Student student : students) {
            if (student.getYearofStudent() == YearofStudent.FIRST) {
                introToProgramming.add(student);
            }
           // printStudents(introToProgramming);
        }

        Lecturer lecturer = new Lecturer("Kwame Appati", LecturerCourse.PROGRAMMING);


        Course course = new Course("INTRO TO PROGRAMMING", lecturer, introToProgramming, CourseYear.FIRST);

        System.out.println(course);


        List<Student> advancedGardening = new ArrayList<>();
        for (Student student3 : students) {
            if (student3.getYearofStudent() == YearofStudent.THIRD || student3.getYearofStudent() == YearofStudent.FOURTH) {
                advancedGardening.add(student3);
            }
           // printStudents(advancedGardening);
        }

        Lecturer lecturer2 = new Lecturer("Carl Appiah", LecturerCourse.GARDENING);

        Course course2 = new Course("ADVANCED GARDENING", lecturer2, advancedGardening, CourseYear.THIRD);

        List<Student> physics = new ArrayList<>();
//        for (Student stu :students) {
//            if (stu.getYearofStudent() == YearofStudent.FOURTH) {
//            if (stu.getName() StartWith.)
//            {
//                physics.add(stu);
//            }
//            //printStudents(physics);
//            }

        Lecturer lecturer3 = new Lecturer("Stephen Macauley", LecturerCourse.PHYSICS);

        Course course3 = new Course("PHYSICS", lecturer3, physics, CourseYear.FOURTH);
        System.out.println(course3);

    }


        private static void printStudents (List < Student > students) {
            System.out.println(students);
            System.out.println("Length: " + students.size());
        }
    }

