/*
 * Decisions_Lab1.java
 */

import java.util.Scanner;

/**
 * CPS 150
 * Algorithms & Programming I
 * 
 * Lab Project: An introduction to the if statement
 *
 * @author *** Replace with your name ***
 */
public class Decisions_Lab1

{
  public static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Enter a value for n:");
    int n = scan.nextInt();

    /* Paste code from lab project page after this line */
    if (n > 10) {
      System.out.print("*****");
    }
    if (n > 7) {
      System.out.print("****");
    }
    if (n > 4) {
      System.out.print("***");
    }
    if (n > 1) {
      System.out.print("**");
    }
    System.out.println("*");

  } // end main method

} // end class Decisions_Lab1

