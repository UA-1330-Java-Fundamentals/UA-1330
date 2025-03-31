package com.softserve.edu20file;

import java.io.File;
import java.util.Scanner;

public class AppScan {
    public static void main(String[] args) {
        File file = new File("./test.txt");
        //File file = new File("///C:/Tools/Work/ua1331TaqcFundamental/Presentation/02_JavaScript/Exam0.html");
        //
        try (Scanner sc = new Scanner(file)) {
            String s;
            while (sc.hasNextLine()) {
                s = sc.nextLine();
                System.out.println(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
