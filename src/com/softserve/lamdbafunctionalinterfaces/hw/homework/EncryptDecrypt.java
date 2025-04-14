package com.softserve.lamdbafunctionalinterfaces.hw.homework;

import java.util.Scanner;

public class EncryptDecrypt{
    StringBuilder sb = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    Scanner sc = new Scanner(System.in);

    public String encrypt(String s, int n, StringBuilder sb){
        char c;
        int ascii=0;
        for (int i=0;i<s.length();i++){
            c = s.charAt(i);
            ascii = (int)c;
            sb.append((char)(ascii+n));
        }
           return sb.toString();
    }

    public String decrypt(String s, int n, StringBuilder sb){
        char c;
        int ascii=0;
        for (int i=0;i<s.length();i++){
            c = s.charAt(i);
            ascii = (int)c;
            sb.append((char)(ascii-n));
        }
           return sb.toString();
    }

    public void inputParametersReturnResults(){
        System.out.print("Enter a string :");
        String stringToCode = sc.nextLine();
        System.out.print("Enter a shift number from 1 to 50 :");
        int key = sc.nextInt();
        if(stringToCode != null && !stringToCode.isEmpty()){
            if(key > 0 && key < 50) {
                System.out.println("Original string is: " + stringToCode + " key for coding:" + key);
                String result = encrypt(stringToCode, key, sb);
                System.out.println("Coded string is:" + result);
                String toOriginal = decrypt(result, key, sb2);
                System.out.println("Decoded string is :" + toOriginal);
            }
        }else {
            System.out.println("You've entered incorrect string");
        }
        sc.close();
    }
}
