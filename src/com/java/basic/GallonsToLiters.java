package com.java.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GallonsToLiters {

  private static final double GAL_TO_LIT_CONVERTER = 3.78541;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter number of gallons: ");
    String input = br.readLine();
    Double gallons = Double.valueOf(input);
    Double liters = gallons * GAL_TO_LIT_CONVERTER;
    System.out.format("%.2f gallons equals to %.2f liters", gallons, liters);
  }

}
