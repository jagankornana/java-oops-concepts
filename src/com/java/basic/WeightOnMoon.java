package com.java.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WeightOnMoon {

  private static final double EARTH_GRAVITY = 9.80;
  private static final double MOON_GRAVITY = 1.62;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter your weight on Earth: ");
    double weightOnEarth, weightOnMoon, mass;
    weightOnEarth = Double.valueOf(br.readLine());
    mass = weightOnEarth / EARTH_GRAVITY;
    weightOnMoon = mass * MOON_GRAVITY;
    System.out.format("Your weight on Moon: %.2f", weightOnMoon);
  }
}
