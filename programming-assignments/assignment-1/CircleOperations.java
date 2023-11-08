/* 
 * Author: Ben Russell
 * Date: 09/17/2023
 * Purpose: Write a program that prompts the user for a radius and then prints
 * the area and circumference of a circle with that radius, and
 * the volume and surface area of a sphere with that radius
 */
import java.util.Scanner;
public class CircleOperations {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		double radius;

		System.out.print("Enter the radius: ");
		radius = in.nextDouble();

		System.out.printf("\nArea of circle: %.6f\n", Math.PI * radius * radius);
		System.out.printf("Circumference of circle: %.6f\n\n", Math.PI * 2 * radius);
		
		System.out.printf("Volume of sphere: %.6f\n", ((double) 4/3) * Math.PI * Math.pow(radius, 3));
		System.out.printf("Surface area of sphere: %.6f\n", 4 * Math.PI * radius * radius);
	}
}
