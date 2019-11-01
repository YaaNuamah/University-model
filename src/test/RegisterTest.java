package test;

import org.junit.jupiter.api.Test;
import student.Level;
import student.Nameable;
import student.Register;
import student.Student;


import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RegisterTest {

    @Test
    void getRegister() {
        Register reg = new Register(Arrays.asList(
                new Student("Alex", Level.First, Arrays.asList(13.0, 45.0)),
                new Student("Gina", Level.Second, Arrays.asList(55.0, 78.0)),
                new Student("Gerald", Level.Fourth, Arrays.asList(7.0, 4.0)),
                new Student("Harry", Level.Third, Arrays.asList(8.5, 2.5)),
                new Student("Baaba", Level.Second, Arrays.asList(9.5, 3.5)),
                new Student("Emmanuel", Level.First, Arrays.asList(3.0, 2.5))
        ));
        assertEquals(Arrays.asList("Alex", "Gina", "Gerald", "Harry", "Baaba", "Emmanuel"), reg.getRegister());


    }
        @Test
        void getRegisterByLevel() {
            Register reg = new Register(Arrays.asList(
                    new Student("Alex", Level.First, Arrays.asList(13.0, 45.0)),
                    new Student("Gina", Level.Second, Arrays.asList(55.0, 78.0)),
                    new Student ("Gerald", Level.Fourth, Arrays.asList(7.0, 4.0)),
                    new Student("Harry", Level.Third, Arrays.asList(8.5, 2.5)),
                    new Student("Baaba", Level.Second, Arrays.asList(9.5, 3.5)),
                    new Student("Emmanuel", Level.First, Arrays.asList(3.0, 2.5))
            ));
            assertEquals(Arrays.asList("Alex",  "Emmanuel"), reg.getRegisterByLevel(Level.First));





    }
}