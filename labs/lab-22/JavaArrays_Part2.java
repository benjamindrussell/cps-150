// JavaArrays_Part2.java

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
/*
 * CPS 150
 * Algorithms & Programming I
 * 
 * Lab Project: Intro to Java Arrays (Part 2)
 * 
 * Name:
 */

public class JavaArrays_Part2
{
  public static void main(String[] args)
  {
  	// ADD LAB CODE HERE
    Random gen = new Random();

    double arr[] = new double[20];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = gen.nextDouble(99) + 1;
      System.out.println(arr[i]);
    }

    double sum = 0;
    for(double val : arr){
      sum += val;
    }

    System.out.println("Sum: " + sum);

    double min = arr[0];
    for(double val : arr){
      if(val < min){
        min = val;
      }
    }

    System.out.println("Minimum: " + min);

    min = arr[0];
    int minIndex = 0; 
    for(int i = 0; i < arr.length; i++){
      if(arr[i] < min){
        min = arr[i];
        minIndex = i;
      }
    }

    System.out.println("Minimum: " + min + ", Index: " + minIndex);


  } // end main method
} // end class JavaArrays_Part2
