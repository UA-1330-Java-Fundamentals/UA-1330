package com.softserve.exceptions.homework;

public class ApplChildParent {
    public static void main(String[] args) {
        Parent object = new Child();
        try{
            object.print();
        }catch(Exception e){
            System.out.println("Block catch");
        } finally{
            System.out.println("Finally");
        }

    }
}
