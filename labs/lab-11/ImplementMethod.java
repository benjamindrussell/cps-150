/*
 * Program calculates/outputs volume of a cylinder given diameter, height
 */

import java.io.PrintStream;
import java.util.Scanner;

/*
 * ImplementMethod.java
 * 
 * CPS 150 Algorithms & Programming I
 * 
 * Name: 
 */
public class ImplementMethod
{
    
    /**
     * cylinderVolume(double, double) -> double
     * 
     * method consumes diameter and height of cylinder
     * method produces cylinder's volume
     * 
     * ex: cylinderVolume(5, 10) -> 196.3
     * ex: cylinderVolume(0, 10) -> 0.0
     * ex: cylinderVolume(5, 0) -> 0.0
     * ex: cylinderVolume(-5, 10) -> 196.3
     * ex: cylinderVolume(5, -10) -> -196.3
     * 
     * ADD METHOD IMPLEMENTATION IMMEDIATELY BELOW THE NEXT LINE
     */
    

    /**
     * ImplementMethod : double, double ; double
     * 
     * program is given the diameter and height of a cylinder
     * program calculates and outputs the cylinder's volume
     * 
     * NOTE: YOU ARE NOT ALLOWED TO MODIFY THIS main CODE IN ANY WAY
     */
    public static void main(String[] args)
    {
        // input variables
        Scanner in = new Scanner(System.in);
        double diameter=0;
        double height=0;
        
        // output variables
        PrintStream out = System.out;
        double volume=0;
        
        // get the cylinder's diameter and volume as user input
        out.print("What is the cylinder's diameter? ");
        diameter = in.nextDouble();
        out.print("What is the cylinder's height? ");
        height = in.nextDouble();
        
        // calculate the cylinder's volume
        volume = cylinderVolume(diameter, height);
        
        // output the input and output variable data
        out.printf("A cylinder with diameter %.1f and height %.1f",
                diameter, height);
        out.printf(" has volume %.1f\n", volume);
    } // end main method
   
    public static double cylinderVolume(double d, double h){
        return(Math.PI * (d/2) * (d/2) * h);
    }
} // end ImplementMethod
