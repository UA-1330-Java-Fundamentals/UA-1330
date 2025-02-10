package com.softserve.edu.HW3Lesson4ConditionStatements;//package name should be in lowercase

public class CheckRange {

    public static String checkRange(float n1, float n2, float n3) {
        if (((n1 >= -5) && (n1 <= 5))//це магічні числа, краще винести в константи
                && ((n2 >= -5) && (n2 <= 5))
                && ((n3 >= -5) && (n3 <= 5))) {
            return "All three numbers are included in [-5; 5].";
        } else {
            return "Not all three numbers are included in [-5; 5].";
        }
    }

    //ось як воно мало би виглядати з константами
    private static final float MIN_RANGE = -5;
    private static final float MAX_RANGE = 5;

    public static String checkRangeWithConstants(float n1, float n2, float n3) {
        if (isAllEqual(n1, n2, n3)) {
            if (isInRange(n1)) {
                return "All numbers are equal and included in [" + MIN_RANGE + "; " + MAX_RANGE + "].";
            } else {
                return "All numbers are equal but not included in [" + MIN_RANGE + "; " + MAX_RANGE + "].";
            }
        }

        if (isInRange(n1) && isInRange(n2) && isInRange(n3)) {
            return "All three numbers are included in [" + MIN_RANGE + "; " + MAX_RANGE + "].";
        } else {
            return "Not all three numbers are included in [" + MIN_RANGE + "; " + MAX_RANGE + "].";
        }
    }

    private static boolean isInRange(float number) {
        return number >= MIN_RANGE && number <= MAX_RANGE;
    }

    private static boolean isAllEqual(float n1, float n2, float n3) {
        return n1 == n2 && n2 == n3;
    }
}
