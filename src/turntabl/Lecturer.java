package turntabl;

public class Lecturer {
    public String name;
    private LecturerCourse lecturerCourse;


    public Lecturer(String name, LecturerCourse lecturerCourse) {
        this.name = name;
        this.lecturerCourse = lecturerCourse;

    }

    public String getName() {
        return name;
    }

    public LecturerCourse getLecturerCourse() {
        return lecturerCourse;
    }

    @Override
    public String toString() {
        return "turntabl.Lecturer{" +
                "name='" + name + '\'' +
                ", lecturerCourse=" + lecturerCourse +
                '}';
    }
}
