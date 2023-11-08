/*
 * Decisions_Lab2.java
 */

import java.util.Scanner;

/**
 * CPS 150
 * Algorithms & Programming I
 * 
 * Lab Project: An introduction to the if/else statement
 *
 * @author *** Ben Russell ***
 */
public class Decisions_Lab2

{
  public static Scanner scan = new Scanner(System.in);
  
  public static void main(String[] args)
  {
    System.out.println("Enter a value for w:");
    int w = scan.nextInt();

    System.out.println("Enter a value for x:");
    int x = scan.nextInt();
    
    System.out.println("Enter a value for y:");
    int y = scan.nextInt();

    System.out.println("Enter a value for z:");
    int z = scan.nextInt();

    int minimum = w;
    if(x < minimum) minimum = x;
    if(y < minimum) minimum = y;   
    if(z < minimum) minimum = z;

    System.out.println("The smallest value is " + minimum);
    
  } // end main method
  
} // end class Decisions_Lab2

