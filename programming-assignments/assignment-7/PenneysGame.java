import java.util.Arrays;
import java.util.Scanner;
/*
 * Author: Ben Russell
 * Date: 11-19-23
 * Purpose: Write a Java program that plays Penney's Game
 */

public class PenneysGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // intro
        System.out.println("Welcome to Penney's Game\n");
        System.out.println("First, enter the number of coins (n) you and I each choose.");
        System.out.println("Then, enter your n coin choices, and I'll do the same.");
        System.out.println("Then, we keep flipping until one of our sequences comes up, and that player wins.");
        System.out.println("Ready? Then let's go!\n");

        // get input for numer of coins, rejecting anything that isn't a positive integer
        int numCoins = 0;
        do {
            System.out.print("Enter the # of coins (> 0): ");
            if(!in.hasNextInt()) {
                System.out.println("Invalid input; try again");
            } else {
                numCoins = in.nextInt();
                if(numCoins <= 0) {
                    System.out.println("Invalid input; try again");
                }
            }
            in.nextLine();
        } while (numCoins <= 0);

        // arrays for coins and tosses
        boolean userCoins[] = new boolean[numCoins];
        boolean computerCoins[] = new boolean[numCoins];
        boolean fairTosses[] = new boolean[1000];

        // get the user's choices
        char userChoice;
        for (int i = 0; i < numCoins; i++) {
            do {
                System.out.print("Enter coin " + (i + 1) + " ('h' for heads, 't' for tails): ");
                userChoice = in.next().charAt(0);
                if (userChoice == 'h') {
                    userCoins[i] = true;
                } else if (userChoice == 't') {
                    userCoins[i] = false;
                } else {
                    System.out.println("Invalid input; try again");
                }
            } while (userChoice != 'h' && userChoice != 't');
        }

        // get the computer's choices
        for (int i = 0; i < numCoins; i++) {
            computerCoins[i] = randomBoolean();
        }

        // get coin tosses
        for (int i = 0; i < numCoins; i++) {
            fairTosses[i] = randomBoolean(); 
        }

        // print user choices
        System.out.print("You chose: { ");
        for (int i = 0; i < numCoins; i++) {
            if (userCoins[i])
                System.out.print("H ");
            else
                System.out.print("T ");
        }

        // print computer choices
        System.out.print("}\nI chose: { ");
        for (int i = 0; i < numCoins; i++) {
            if (computerCoins[i])
                System.out.print("H ");
            else
                System.out.print("T ");
        }

        System.out.print("}\nThe Flipping starts: ");

        // main control loop of coin flipping an comparison
        int lower = 0;
        int upper = numCoins;
        boolean isPlaying = true;
        while (isPlaying) {
            boolean temp[] = Arrays.copyOfRange(fairTosses, lower, upper);
            if (Arrays.equals(temp, userCoins)) {
                for (int i = 0; i < upper; i++) {
                    if (fairTosses[i]) {
                        System.out.print("H ");
                    } else {
                        System.out.print("T ");
                    }
                }
                System.out.println("\nYou win! But I'll win the next time...");
                isPlaying = false;
                break;
            } else if (Arrays.equals(temp, computerCoins)) {
                for (int i = 0; i < upper; i++) {
                    if (fairTosses[i]) {
                        System.out.print("H ");
                    }
                    else {
                        System.out.print("T ");
                    }
                }
                System.out.println("DONE!");
                System.out.println("I won! Beat me next time (if you can)!");
                isPlaying = false;
                break;
            } else {
                fairTosses[upper] = randomBoolean();
                upper++;
            }
            lower++;
        }
    }

    // this method takes no inputs and outputs a random boolean value
    public static boolean randomBoolean(){
        int random = (int) (Math.random() * 2);
        return (random == 1);
    }
}