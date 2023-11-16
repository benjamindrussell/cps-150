// Array_Spinner.java

import java.io.*;
import java.util.*;

/*
 * CPS 150
 * Algorithms & Programming I
 * 
 * Lab Project: Rotating Java Arrays
 * 
 * Name: Ben Russell
 */

public class Array_Spinner
{
  // Complete the rotate method implementation here:
  public static double[] rotate(double[] values, int rotation)
  {

    // *** ADD METHOD CODE HERE ***
    double[] newValues = new double[values.length];
    for(int i = 0; i < values.length; i++){
      newValues[i] = values[i];
    }
    for(int i = 0; i < rotation; i ++){
      double temp = newValues[values.length - 1];
      for(int j = values.length - 2; j >= 0; j--){
        newValues[j + 1] = newValues[j];
      }
      newValues[0] = temp;
    }
    return newValues;
  } // end rotate method
  
  public static void main(String[] args)
  {
    double[] x = {8, 4, 5, 21, 7, 9, 18, 2, 100};
    
    System.out.println("Before rotation:  ==============================");
    
    for (int i = 0; i < x.length; i++)
    {
      System.out.println("x[" + i + "]:  " + x[i]);
    }
    
    x = rotate(x, 3);
    
    System.out.println("\nAfter rotation:  ==============================");   
       
    for (int i = 0; i < x.length; i++)
    {
      System.out.println("x[" + i + "]:  " + x[i]);
    }
  } // end main method
  
} // end class Array_Spinner
