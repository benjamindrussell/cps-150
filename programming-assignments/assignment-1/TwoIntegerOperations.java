/* 
 * Author: Ben Russell
 * Date: 09/17/2023
 * Purpose: Write a program that prompts the user for two integers and then prints 
 * the sum, difference, average, distance, maximum and minimum
 */
import java.util.Scanner;
public class TwoIntegerOperations {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int intOne, intTwo;

		System.out.println("Enter two integers: ");
		intOne = in.nextInt();
		intTwo = in.nextInt();	

		System.out.println("\nSum: " + (intOne + intTwo));
		System.out.println("Difference: " + (intOne - intTwo));
		System.out.println("Product: " + (intOne * intTwo));
		System.out.println("Average: " + (double)(intOne + intTwo) / 2);
		System.out.println("Distance: " + Math.abs(intOne - intTwo));
		System.out.println("Maximum: " + Math.max(intOne, intTwo));
		System.out.println("Minimum: " + Math.min(intOne, intTwo));
	}	
}
