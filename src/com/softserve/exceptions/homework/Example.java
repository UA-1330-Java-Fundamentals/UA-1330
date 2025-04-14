package com.softserve.exceptions.homework;
class MyException extends Exception{}
public class Example {
    static String str ="";
    public static void method (String s){
        try{
            if(!s.equals("SoftServe")){
                throw new MyException();
            }
            str +=" m1 ";
            return;
        }catch (MyException e){
            str +=" m2 ";
        } finally{
            str +=" m3 ";
        }
        str +=" m4 ";
    }

    public static void main(String[] args) {
        method("SoftServe");
        method("IT Academy");
        System.out.println(str);
    }
}