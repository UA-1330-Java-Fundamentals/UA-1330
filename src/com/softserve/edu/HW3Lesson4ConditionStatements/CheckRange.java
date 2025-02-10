package com.softserve.edu.HW3Lesson4ConditionStatements;

public class CheckRange {

    public static String checkRange(float n1, float n2, float n3){
        if (((n1 >= -5) && (n1 <= 5))
                && ((n2 >= -5) && (n2 <= 5))
                && ((n3 >= -5) && (n3 <= 5))) {
            return "All three numbers are included in [-5; 5].";
        } else {
            return "Not all three numbers are included in [-5; 5].";
        }
    }


}
