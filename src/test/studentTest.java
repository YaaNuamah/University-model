package test;

import org.junit.jupiter.api.Test;
import student.Level;
import student.Student;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class studentTest {


    @Test
    void getAverageGrade() {
        List<Double> grades = Arrays.asList(7.0,6.0);

        Student student = new Student("Gina Mahama", Level.First, grades);
        Double average = student.getAverageGrade();
        Double expected = 6.5;
        assertEquals(expected,average);
                
    }

    }

