/*
 * CPS 150
 * Algorithms & Programming I
 * 
 * Lab Project: Arithmetic Expressions in Java
 * 
 * Name: Ben Russell
 */

public class ArithmeticExpressions
{
  public static void main(String[] args)
  {
    // start adding code after this line
    int a = 3;
    int b = 4;
    int c = 5;
    int d = 17;
    System.out.print("(a + b)/ c : ");
    System.out.println((a + b)/ c);
    // 3 and 4 are added with sum 7
    // 7 is divided by 5 with quotient 1
    System.out.print("a + b / c : ");
    System.out.println(a + b / c);
    // 4 is divided by 5 with quotient 0
    // 3 is added to 0 with sum 3
    System.out.print("a++ : ");
    System.out.println(a++);
    // 3 is incremented by one resulting in sum 4, but it is incremented after the line is executed so it prints 3.
    System.out.print("a-- : ");
    System.out.println(a--);
    // 4 is decremented by one resulting in sum 3, but is is decremented after the line is executed so it prints 4.
    System.out.print("a + 1 : ");
    System.out.println(a + 1);
    // 3 and 1 are added with sum 4
    System.out.print("d % c : ");
    System.out.println(d % c);
    // 17 is divided by 5 and the remainder is 2
    System.out.print("d / c : ");
    System.out.println(d / c);
    // 17 is divided by 5 with quotient 3
    System.out.print("d % b : ");
    System.out.println(d % b);
    // 17 is divided by 4 with a remainder 1
    System.out.print("d / b : ");
    System.out.println(d / b);
    // 17 is divided by 4 with quotient 4
    System.out.print("d + a / d + b : ");
    System.out.println(d + a / d + b);
    // 3 is divided by 17 with quotient 0. then 17, 0, and 4 are added with sum 21
    System.out.print("(d + a) / (d + b) : ");
    System.out.println((d + a) / (d + b));
    // 17 and 3 are added with sum 20. 17 and 4 are added with sum 21. 20 is divided by 21 with quotient 0
    System.out.print("Math.sqrt(b) : ");
    System.out.println(Math.sqrt(b));
    // The square root of 4 is taken resulting in 2.0
    System.out.print("Math.pow(a, b) : ");
    System.out.println(Math.pow(a, b));
    // 3 is raised to the 4th power resulting in 81.0
    System.out.print("Math.abs(-a) : ");
    System.out.println(Math.abs(-a));
    // The absolute value of -3 is taken resulting in 3
    System.out.print("Math.max(a, b) : ");
    System.out.println(Math.max(a, b));
    // The maximum of 3 and 4 is 4
    // stop adding code before this line
  } // end main method
} // end ArithmeticExpressions class