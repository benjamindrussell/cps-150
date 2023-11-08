/* 
 * Author: Ben Russell
 * Date: 09/17/2023
 * Purpose: Write a program that prompts the user for a measurement in meters and then converts it to 
 * miles, feet, and inches. 
 */
import java.util.Scanner;
public class UnitConversion {
	public static void main(String[] args){
		final double METERS_PER_MILE = 1609.34;
		final double FEET_PER_METER = 3.28084;
		final int INCHES_PER_FOOT = 12;

		Scanner in = new Scanner(System.in);

		int measurementInMeters;

		System.out.print("Enter a measurement in meters: ");
		measurementInMeters = in.nextInt();

		System.out.printf("\nThe measurement in miles is %.6f\n", measurementInMeters / METERS_PER_MILE);
		System.out.printf("The measurement in feet is %.6f\n", measurementInMeters * FEET_PER_METER);
		System.out.printf("The measurement in inches is %.6f\n", (measurementInMeters * FEET_PER_METER) * 12);
	}
}
