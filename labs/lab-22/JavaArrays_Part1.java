// JavaArrays_Part1.java

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
/*
 * CPS 150
 * Algorithms & Programming I
 * 
 * Lab Project: Intro to Java Arrays (Part 1)
 * 
 * Name: Benjamin Russell 
 */

public class JavaArrays_Part1
{
  public static void main(String[] args)
  {
    // ADD LAB CODE HERE
    Random gen = new Random();
    double arr[] = new double[20];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = gen.nextDouble(99) + 1;
    }

    System.out.println("Length: " + arr.length);
    System.out.println("First item: " + arr[0]);
    System.out.println("Last item: " + arr[19]);
    System.out.println("arr[arr.length - 1]: " + arr[arr.length - 1]); // 20 - 1 is 19

    System.out.println("No labels");
    for (double arrVal : arr) {
      System.out.println(arrVal);
    }
    System.out.println("Labels");
    for (int i = 0; i < arr.length; i++) {
      System.out.println("Index " + i + ": " + arr[i]);
    }
    System.out.println("Reverse with labels"); 
    for (int i = arr.length - 1; i >= 0; i--) {
      System.out.println("Index " + i + ": " + arr[i]);
    }

  } // end main method
} // end class JavaArrays_Part1
