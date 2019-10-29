package turntabl;

import java.util.Arrays;
import java.util.List;

public class Course {
    private String name;
    private Lecturer lecturer;
    private List<Student> students;
    private CourseYear courseYear;

    public Course(String name, Lecturer lecturer, List<Student> students, CourseYear courseYear) {
        this.name = name;
        this.lecturer = lecturer;
        this.students = students;
        this.courseYear = courseYear;
    }

    public String getName() {
        return name;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public List<Student> getStudents() {
        return students;
    }

    public CourseYear getCourseYear() {
        return courseYear;
    }

    @Override
    public String toString() {
        return "turntabl.Course{" +
                "name='" + name + '\'' +
                ", lecturer=" + lecturer +
                ", students=" + students +
                ", courseYear=" + courseYear +
                '}';
    }
};

