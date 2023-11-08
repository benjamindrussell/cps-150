/* 
 * Author: Ben Russell
 * Date: 09/18/2023
 * Purpose: Write a program that asks the user to input 
 * the number of gallons of gas in a tank,
 * the fuel efficiency in miles per gallon, and
 * the price of gas per gallon.
 * Then print the cost per 100 miles and how far the car can go with the gas in the tank.
 */
import java.util.Scanner;
public class GasInfo {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		double numberOfGallons, milesPerGallon, pricePerGallon;

		System.out.print("Please enter the number of gallons of gas in the tank: ");
		numberOfGallons = in.nextDouble();
		System.out.print("Please enter the fuel efficency (miles per gallon): ");
		milesPerGallon = in.nextDouble();
		System.out.print("Please enter the price of gas per gallon: ");
		pricePerGallon = in.nextDouble();

		double costPerHundredMiles = (double)(100 / milesPerGallon) * pricePerGallon;
		double maxMiles = numberOfGallons * milesPerGallon;

		System.out.printf("\nTo drive 100 miles, it will cost $%.2f.\n", costPerHundredMiles);
		System.out.printf("The car can currently drive a maximum of %.6f miles.\n", maxMiles);
	}
}
