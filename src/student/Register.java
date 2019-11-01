package student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Register {

    private List<Student> students;

    public Register(List<Student> students) {
        this.students = students;
    }

    public List<String> getRegister() {
       return students.stream().map(Student::getName)
            .collect(Collectors.toList());


//         List<String> Names = new ArrayList<> ();
//        for(Student student : students) {
//            Names.add(student.getName());
//        }
//        return Names;

    }

    public List<String> getRegisterByLevel(Level lvl) {
       return students.stream().filter(student-> student.getLevel() == lvl)
            .map(Student::getName)
               .collect(Collectors.toList());

//         List<String> Names = new ArrayList<>();
//        for (Student student : students) {
//            if (student.getLevel() == lvl) {
//                Names.add(student.getName());
//            }
//        }
//        return Names;
    }


}

