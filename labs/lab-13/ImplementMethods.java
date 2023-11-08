import java.io.PrintStream;
import java.util.Scanner;

/*
 * CPS 150, Algorithms & Programming I
 *
 * Lab Project: Implement the Methods
 * 
 * Program calculates the roots of a polynomial ax^2+bx+c,
 *   using the quadratic formula, and the coefficients a, b and c
 * 
 * Name: Ben Russell
 */

public class ImplementMethods
{
        
   /**
    * discriminant(int, int, int) -> double
    * 
    * Computes the discriminant b^2 - 4ac
    * @param a the first (int) coefficient of the polynomial ax^2+bx+c
    * @param b the second (int) coefficient of the polynomial ax^2+bx+c
    * @param c the third (int) coefficient of the polynomial ax^2+bx+c
    * @return the (double) discriminant b^2 - 4ac
    * 
    * IMPLEMENT THE METHOD AFTER THE FOLLOWING LINE
    */
  
   
   /**
    * calcRoot1(int, int, int) -> double
    * 
    * Computes the first root of a polynomial ax^2+bx+c
    * @param a the first (int) coefficient of the polynomial ax^2+bx+c
    * @param b the second (int) coefficient of the polynomial ax^2+bx+c
    * @param c the third (int) coefficient of the polynomial ax^2+bx+c
    * @return the (double) root
    * 
    * IMPLEMENT THE METHOD AFTER THE FOLLOWING LINE
    */
  
   
   /**
    * calcRoot2(int, int, int) -> double
    * 
    * Computes the second root of a polynomial ax^2+bx+c
    * @param a the first (int) coefficient of the polynomial ax^2+bx+c
    * @param b the second (int) coefficient of the polynomial ax^2+bx+c
    * @param c the third (int) coefficient of the polynomial ax^2+bx+c
    * @return the (double) root
    * 
    * IMPLEMENT THE METHOD AFTER THE FOLLOWING LINE
    */
  
    

    /**
     * ImplementMethods : int, int, int ; double
     * 
     * program is given the coefficients of the polynomial ax^2+bx+c
     * program calculates and outputs the roots of the polynomial
     * 
     * NOTE: YOU ARE NOT ALLOWED TO MODIFY THIS main CODE IN ANY WAY
     */
   public static void main(String[] args)
   {
      int a, b, c;
      double root1, root2;
      
      Scanner input = new Scanner(System.in);
      PrintStream output = System.out;
      
      output.println("This program calculates the roots of a polynomial");
      output.println("ax^2+bx+c, once its gets the coefficients");
      output.println("of the polynomial a, b and c\n");
      
      // get the polynomial's coefficients
      output.print("Enter the polynomial coefficients (integers) separated by spaces: ");
      a = input.nextInt();
      b = input.nextInt();
      c = input.nextInt();
      
      // calculate the roots of the polynomial
      root1 = calcRoot1(a, b, c);
      root2 = calcRoot2(a, b, c);
      
      // output the roots of the polynomial
      output.printf("\nThe polynomial %dx^2 + %dx + %d has the roots %.1f and %.1f\n",
                    a, b, c, root1, root2);
   } // end main method

   public static double discriminant(double a, double b, double c){
      return b * b - 4 * a * c;
   }

   public static double calcRoot1(double a, double b, double c){
      return (-1 * b + Math.sqrt(discriminant(a, b, c))) / ( 2 * a) ;
   }

   public static double calcRoot2(double a, double b, double c){
      return (-1 * b - Math.sqrt(discriminant(a, b, c))) / ( 2 * a) ;
   }

} // end class ImplementMethods