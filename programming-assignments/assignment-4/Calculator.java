/* 
 * Author: Ben Russell
 * Date: 10/22/2023
 * Purpose: Write a Java program for a simple 4-function calculator that: 
 * displays a menu of options to the user
 * gets the user's choice
 * gets the two operands as user inputs
 * calls the appropriate method with the operands, which:
 *      performs the calculation
 *      outputs the result

 */

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double op1, op2;
        int option;

        System.out.println("Make a selection:\n\t" +
                            "1: Add 2 numbers\n\t" +
                            "2: Subtract 2 numbers\n\t" +
                            "3: Multiply 2 numbers\n\t" +
                            "4: Divide 2 numbers\n");

        System.out.print("Enter your choice: ");
        option = getOption(in);

        System.out.print("\nEnter the 1st number: ");
        op1 = getOperand(in);
        System.out.print("Enter the 2nd number: ");
        op2 = getOperand(in);

        /* perform the correct operation based on the user's input */
        switch (option) {
            case (1):
                add(op1, op2);
                break;
            case (2):
                subtract(op1, op2);
                break;
            case (3):
                multiply(op1, op2);
                break;
            case (4):
                divide(op1, op2);
                break;
            default:
                break;
        }

    }

    /* the method get operand gets an operand from the user and returns it as a double */
    public static double getOperand(Scanner in) {
        if (in.hasNextDouble()) {
            return in.nextDouble();
        } else {
            System.out.println("\ninvalid input");
            System.exit(0);
        }
        return 0;
    }

    /* the method get option gets which mathematical operation to use, represented by ints 1-4, from the user and returns it as an int */
    public static int getOption(Scanner in){
        int option = 0;
        if(in.hasNextInt()){
            option = in.nextInt();
        } else {
            System.out.println("\ninvalid input");
            System.exit(0);
        }

        if(option < 1 || option > 4){
            System.out.println("\nunknown operation");
            System.exit(0);
        }

        return option;
    }

    /* prints the result of adding the two numbers */
    public static void add(double opnd1, double opnd2) {
        System.out.printf("\n%.1f + %.1f = %.1f\n", opnd1, opnd2, (opnd1 + opnd2));
    }

    /* prints the result of subtracting the two numbers */
    public static void subtract(double opnd1, double opnd2) {
        System.out.printf("\n%.1f - %.1f = %.1f\n", opnd1, opnd2, (opnd1 - opnd2));
    }

    /* prints the result of multiplying the two numbers */
    public static void multiply(double opnd1, double opnd2) {
        System.out.printf("\n%.1f x %.1f = %.1f\n", opnd1, opnd2, (opnd1 * opnd2));
    }

    /* prints the result of dividing the two numbers */
    public static void divide(double opnd1, double opnd2) {
        if(opnd2 == 0){
            System.out.println("\nYou cannot divide by zero");
            return;
        }
        System.out.printf("\n%.1f / %.1f = %.1f\n", opnd1, opnd2, (opnd1 / opnd2));
    }
}
