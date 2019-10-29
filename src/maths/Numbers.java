package maths;

public class Numbers {

    public static int getSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static boolean Positive(int a) {
        if (a > 0) {
            return true;
        } else {
            return false;
        }

    }
    public static boolean Negative(int b) {
        if (b < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean Even(int c) {
        if ((c % 2) == 0 && c > 0) {
            return true;
        } else {
            return false;

        }
    }
        public static boolean Leap ( int year){
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                return true;
            } else {
                return false;
            }
        }

}


