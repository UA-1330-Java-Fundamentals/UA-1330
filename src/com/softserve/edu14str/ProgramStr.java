package com.softserve.edu14str;

public class ProgramStr {
    public static void main(String[] args) {
        char s[] = {'J', 'a', 'v', 'a'};
        String str = new String(s);    // str = "Java"
        System.out.println("str = " + str);
        //
        if (!str.isEmpty()) {
            int i = str.length();    // i = 4
            System.out.println("i = " + i);
            //
            str = str.toUpperCase();             // str = "JAVA"
            System.out.println("str = " + str);
            //
            String num = String.valueOf(8);    // num = "8"
            num = str.concat("-" + num);     // num = "JAVA-8"
            System.out.println("num = " + num);
            //
            char ch = str.charAt(2); // V
            System.out.println("ch = " + ch);
            //
            i = str.lastIndexOf('A');        // i = 3 or -1
            System.out.println("i = " + i);
            //
            num = num.replace("8", "SE");    // num = "JAVA-SE"
            System.out.println("num = " + num);
            //
            str.substring(0, 4).toLowerCase();    // java
            //
            str = num + "-8";                     // str = "JAVA-SE-8"
            System.out.println("str = " + str);
            //
            String[] arr = str.split("-");
            for (String w : arr) {
                System.out.println(w);
            }
        }
    }
}
