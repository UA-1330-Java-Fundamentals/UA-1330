package com.softserve.exceptions.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork1Appl {
    public static void main(String[] args) {
            try{
             System.out.println(TwoNumbersDivision.divideTwoNumbers());
            } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
            e.printStackTrace();

            }catch (IOException e) {
            System.out.println("IOException");
            e.printStackTrace();

            }
            catch (ArithmeticException e) {
            System.out.println("You got an ArithmeticException(Division by zero)");
            e.printStackTrace();

            } catch (Exception e) {
            System.out.println("Exception");
            System.out.println("Exception description " + e.getMessage());
        }
    }
}
