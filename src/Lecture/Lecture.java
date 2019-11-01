package Lecture;

import student.Student;

import java.util.ArrayList;
import java.util.List;

public class Lecture {
    private List<Student> students =new ArrayList<>();

     public void enter(Student student) {
       //  System.out.println("Printing each student at a time" + student);
         this.students.add(student);
         // System.out.println("Printing All new student at a time:" + this.students);
     }
       public Double getHighestAverageGrade() {
            Double tempGrade = 0.0;
            System.out.println("Print all students Average" + this.students);
            return null;
        }

}