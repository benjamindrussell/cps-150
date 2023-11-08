import java.util.Scanner;

/*
 * CirclesLab.java
 */

/**
 * CPS 150
 * Algorithms & Programming I
 * 
 * Lab Project: Overlapping circles
 *
 * name: 
 */

public class CirclesLab
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      System.out.print("Input the radius of the first circle: ");
      double radius1 = in.nextDouble(); 
      double xcenter1 = 0;
      double ycenter1 = 0;
      System.out.print("Input the radius of the second circle: ");
      double radius2 = in.nextDouble(); 
      double xcenter2 = 40;
      double ycenter2 = 0;

      // Your work goes here:
      if(radius2 >= radius1 + 40){
         System.out.println("Circle 1 is mutually contained in circle 2");
      } else if(radius1 >= radius2 + 40){
         System.out.println("Circle 1 mutually contains circle 2");
      } else if(radius1 + radius2 > 40){
         System.out.println("Overlapping");
      } else {
         System.out.println("Disjoint");
      }
   } // end main method
} // end class CirclesLab
