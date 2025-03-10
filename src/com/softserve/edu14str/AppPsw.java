package com.softserve.edu14str;

public class AppPsw {

    public boolean isValidPassword(String password) {
        /*
        boolean result = password.length() > 7;
        result =  result && password.matches(".*[a-z]+.*");
        result =  result && password.matches(".*[A-Z]+.*");
        result =  result && password.matches(".*[0-9]+.*");
        result =  result && password.matches(".*[^\\w]+.*");
        return result;
        */
        //
        return password.length() > 7
                && password.matches(".*[a-z]+.*")
                && password.matches(".*[A-Z]+.*")
                && password.matches(".*[0-9]+.*")
                && password.matches(".*[^\\w]+.*");
    }


    public static void main(String[] args) {
        AppPsw app = new AppPsw();
        System.out.println("is valid password: Qwerty_1 : " + app.isValidPassword("Qwerty#1"));
        System.out.println("is valid password: qwerty_1 : " + app.isValidPassword("qwerty#1"));
        System.out.println("is valid password: QWERTY_1 : " + app.isValidPassword("QWERTY#1"));
        System.out.println("is valid password: Qwerty11 : " + app.isValidPassword("Qwerty11"));
        System.out.println("is valid password: Qwerty-_ : " + app.isValidPassword("Qwerty-#"));
        System.out.println("is valid password: Qw_12 : " + app.isValidPassword("Qw_12"));
    }
}
