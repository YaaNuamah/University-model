package Test;

import maths.Numbers;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    @org.junit.jupiter.api.Test
    void getSum() {
        int sum = Numbers.getSum(5, 8);
       assertEquals(13, sum);
    }

    @org.junit.jupiter.api.Test
    void positive() {
        boolean Positive = Numbers.Positive(45);
        assertTrue(Positive);
    }

    @org.junit.jupiter.api.Test
    void positive2() {
        boolean Positive = Numbers.Positive(-45);
        assertFalse(Positive);
    }

    @org.junit.jupiter.api.Test
    void negative() {
        boolean Negative = Numbers.Negative(-86);
        assertTrue(Negative);
    }

    @org.junit.jupiter.api.Test
    void negative2() {
        boolean Negative = Numbers.Negative(86);
        assertFalse(Negative);
    }

    @org.junit.jupiter.api.Test
    void even() {
        boolean Even = Numbers.Even(50);
        assertTrue(Even);
    }

    @org.junit.jupiter.api.Test
    void even2() {
        boolean Even = Numbers.Even(53);
        assertFalse(Even);
    }

    @org.junit.jupiter.api.Test
    void leap() {
        boolean Leap = Numbers.Leap(2020);
        assertTrue(Leap);
    }

    @org.junit.jupiter.api.Test
    void leap2() {
        boolean Leap = Numbers.Leap(2019);
        assertFalse(Leap);

    }

}