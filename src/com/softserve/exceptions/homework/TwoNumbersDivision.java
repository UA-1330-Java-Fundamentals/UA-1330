package com.softserve.exceptions.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoNumbersDivision {

  public static double divideTwoNumbers() throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          System.out.print("Enter the first number:");
          double firstNumber = Double.parseDouble(br.readLine());
          System.out.print("Enter the second number:");
          double secondNumber = Double.parseDouble(br.readLine());
          br.close();
          return firstNumber/secondNumber;

  }
}
