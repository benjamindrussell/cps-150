/* 
 * Author: Ben Russell
 * Date: 09/17/2023
 * Purpose: Write a program that reads a number and displays the square, cube, and fourth power. 
 */
import java.util.Scanner;
public class SquareCubeFourth {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		double userNumber;

		System.out.print("Enter the number: ");
		userNumber = in.nextDouble();

		System.out.printf("\nThe number %.6f squared is %.6f\n", userNumber, userNumber * userNumber);
		System.out.printf("The number %.6f cubed is %.6f\n", userNumber, userNumber * userNumber * userNumber);
		System.out.printf("The number %.6f raised to the 4th power is %.6f\n", userNumber, Math.pow(userNumber, 4));
	}
}
