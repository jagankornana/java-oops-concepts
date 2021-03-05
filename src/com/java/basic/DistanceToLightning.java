package com.java.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DistanceToLightning {

  private static final double SOUND_TRAVEL_IN_FEET = 1100;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter the seconds for the sound to reach you: ");
    double seconds, lightningDist;
    seconds = Double.valueOf(br.readLine());
    lightningDist = seconds * SOUND_TRAVEL_IN_FEET;
    System.out.format("Lightning distance from you is %.2f feet", lightningDist);
  }
}
