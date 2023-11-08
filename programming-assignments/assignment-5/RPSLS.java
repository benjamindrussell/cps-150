/*
 * CPS150_RPSLab.java
 */
import static java.lang.Math.*; // so you can call Math methods without the 'Math.' prefix

import java.io.*;
import java.util.*;

import javax.sound.midi.Soundbank;

/**
 * CPS 150
 * Algorithms & Programming I
 * 
 * Lab Project: Rock, Paper, Scissors
 *
 * @author *** Ben Russell ***
 */
public class RPSLS
{
    // global input/output variables
    public static Scanner scan = new Scanner(System.in);
    public static PrintStream output = System.out;
    public static PrintStream error = System.err;

    // global named constants for game choices
    public static final int ROCK = 1;
    public static final int PAPER = 2;
    public static final int SCISSORS = 3;
    public static final int LIZARD = 4;
    public static final int SPOCK = 5;
    
    // global names constants for game outcomes
    public static final int PLAYER1_WINS = 11;
    public static final int PLAYER2_WINS = 12;
    public static final int DRAW = 13;
    
    // global named constant for error condition
    public static final int ERROR = -1;

    /**
     * 1. Get human player's choice
     * 2. Get computer player's (random) choice
     * 3. Check human player's choice
     * 4. Check computer player's choice
     * 5. Announce winner
     */
    public static void main(String[] args)
    {
        // intro
        System.out.println("Welcome to the game of Rock Paper Scissors Lizard Spock\n");
        System.out.println("Here are the rules:\n\t" +
                           "Paper covers Rock\n\t" + 
                           "Scissors cuts Paper\n\t" +
                           "Rock crushes Lizard\n\t" + 
                           "Lizard poisons Spock\n\t" +
                           "Spock smashes Scissors\n\t" + 
                           "Scissors decapitates Lizard\n\t" + 
                           "Lizard eats Paper\n\t" +
                           "Paper disproves Spock\n\t" + 
                           "Spock vaporizes Rock\n\t"+ 
                           "(and as it always has) Rock crushes scissors\n"
                           );
        System.out.println("Ready?  Then let's begin!\n");

        // player choice variables
        int player1, player2;
        // string representations of player choices
        String choice;

        // sentinel controlling if game is still going
        boolean isPlaying = true;

        // value user inputs when asked to play again
        String playAgain = "";

        // main control loop
        while(isPlaying){
            // user-proof input
            do {
                System.out.print("Player 1, enter your choice ( rock, paper, scissors, lizard, Spock ): ");
                choice = scan.nextLine().toLowerCase();
                player1 = textToNumber(choice);
                if(player1 == -1){
                    System.out.println("Invalid choice \"" + choice + "\" try again.");
                }
            } while(player1 == -1);
            System.out.println("OK, you chose " + choice);

            // computer chooses
            player2 = (int) (Math.random() * 5) + 1;

            System.out.println("Player 2 (computer) chooses " + numberToText(player2));

            // get outcome of round
            int outcome = 0;
            switch (player1) {
                case ROCK:
                    outcome = rockChoice(player2);
                    break;
                case PAPER:
                    outcome = paperChoice(player2);
                    break;
                case SCISSORS:
                    outcome = scissorsChoice(player2);
                    break;
                case LIZARD:
                    outcome = lizardChoice(player2);
                    break;
                case SPOCK:
                    outcome = spockChoice(player2);
                    break;
                default:
                    output.print("Something went wrong...");
                    break;
            }

            // print outcome
            switch (outcome) {
                case PLAYER1_WINS:
                    System.out.println("Player 1 wins");
                    break;
                case PLAYER2_WINS:
                    System.out.println("Player 2 wins");
                    break;
                case DRAW:
                    System.out.println("\tIt's a draw");
                default:
                    break;
            }

            // handlw whether user wants to play again
            System.out.println("Play again (yes/no)? ");
            playAgain = scan.nextLine();
            if(playAgain.toLowerCase().equals("no")){
                isPlaying = false;
            }

        }
        
    } // end main
    
    /**
     * RPS Lab Part 6
     * 
     * rockChoice(int) -> int
     * 
     * method consumes the computer player's choice (ROCK, PAPER or SCISSORS),
     *   assuming the human player has chosen ROCK
     * method produces game outcome (PLAYER1_WINS, PLAYER2_WINS, or DRAW)
     * 
     * ex1: rockChoice(ROCK) -> DRAW
     * ex2: rockChoice(PAPER) -> PLAYER2_WINS
     * ex3: rockChoice(SCISSORS) -> PLAYER1_WINS
     * ex4: rockChoice(0) -> ERROR
     * ex5: rockChoice(-1) -> ERROR
     * ex6: rockChoice(4) -> ERROR
     */
    public static int rockChoice(int choice)
    {
        // *** ADD METHOD CODE ***
        switch(choice){
            case ROCK:
                return DRAW;
            case PAPER:
                System.out.print("\tPaper covers rock; ");
                return PLAYER2_WINS;
            case SCISSORS:
                System.out.print("\tRock crushes scissors; ");
                return PLAYER1_WINS;
            case LIZARD:
                System.out.print("\tRock crushes lizard; ");
                return PLAYER1_WINS;
            case SPOCK:
                System.out.print("\tSpock vaporizes rock; ");
                return PLAYER2_WINS;
            default:
                return ERROR;
        }
    } // end rockChoice
    
    /**
     * RPS Lab Part 7
     * 
     * paperChoice(int) -> int
     * 
     * method consumes the computer player's choice (ROCK, PAPER or SCISSORS),
     *   assuming the human player has chosen PAPER
     * method produces game outcome (PLAYER1_WINS, PLAYER2_WINS, or DRAW)
     * 
     * ex1: paperChoice(ROCK) -> PLAYER1_WINS
     * ex2: paperChoice(PAPER) -> DRAW
     * ex3: paperChoice(SCISSORS) -> PLAYER2_WINS
     * ex4: paperChoice(0) -> ERROR
     * ex5: paperChoice(-1) -> ERROR
     * ex6: paperChoice(4) -> ERROR
     */
    public static int paperChoice(int choice)
    {
        // *** ADD METHOD CODE ***
        switch(choice){
            case ROCK:
                System.out.print("\tPaper covers rock; ");
                return PLAYER1_WINS;
            case PAPER:
                return DRAW;
            case SCISSORS:
                System.out.print("\tScissors cuts paper; ");
                return PLAYER2_WINS;
            case LIZARD:
                System.out.print("\tLizard eats paper; ");
                return PLAYER2_WINS;
            case SPOCK:
                System.out.print("\tPaper disproves Spock; ");
                return PLAYER1_WINS;
            default:
                return ERROR;
        }
    } // end paperChoice
    
    /**
     * RPS Lab Part 8
     * 
     * scissorsChoice(int) -> int
     * 
     * method consumes the computer player's choice (ROCK, PAPER or SCISSORS),
     *   assuming the human player has chosen SCISSORS
     * method produces game outcome (PLAYER1_WINS, PLAYER2_WINS, or DRAW)
     * 
     * ex1: scissorsChoice(ROCK) -> PLAYER2_WINS
     * ex2: scissorsChoice(PAPER) -> PLAYER1_WINS
     * ex3: scissorsChoice(SCISSORS) -> DRAW
     * ex4: scissorsChoice(0) -> ERROR
     * ex5: scissorsChoice(-1) -> ERROR
     * ex6: scissorsChoice(4) -> ERROR
     */
    public static int scissorsChoice(int choice)
    {
        // *** ADD METHOD CODE ***
        switch(choice){
            case ROCK:
                System.out.print("\tRock crushes scissors; ");
                return PLAYER2_WINS;
            case PAPER:
                 System.out.print("\tScissors cuts paper; ");
                return PLAYER1_WINS;
            case SCISSORS:
                return DRAW;
            case LIZARD:
                System.out.print("\tScissors decapitates lizard; ");
                return PLAYER1_WINS;
            case SPOCK:
                System.out.print("\tSpock smashes Scissors; ");
                return PLAYER2_WINS;
            default:
                return ERROR;
        }
    } // end scissorsChoice

    /* this method consumes the computer's choice and, assuming the human chose lizard, determines the outcome */
    public static int lizardChoice(int choice){
        switch (choice) {
            case ROCK:
                System.out.print("\tRock crushes lizard; ");
                return PLAYER2_WINS;
            case PAPER:
                System.out.print("\tLizard eats paper; ");
                return PLAYER1_WINS;
            case SCISSORS:
                System.out.print("\tScissors decapitates lizard; ");
                return PLAYER2_WINS;
            case LIZARD:
                return DRAW;
            case SPOCK:
                System.out.print("\tLizard poisons Spock; ");
                return PLAYER1_WINS;
            default:
                return ERROR;
        }
    }

    /*
     * this method consumes the computer's choice and, assuming the human chose
     * spock, determines the outcome
     */
    public static int spockChoice(int choice) {
        switch (choice) {
            case ROCK:
                System.out.print("\tSpock vaporizes Rock; ");
                return PLAYER1_WINS;
            case PAPER:
                System.out.print("\tPaper disproves Spock; ");
                return PLAYER2_WINS;
            case SCISSORS:
                System.out.print("\tSpock smashes scissors; ");
                return PLAYER1_WINS;
            case LIZARD:
                System.out.print("\tLizard poisons Spock; ");
                return PLAYER2_WINS;
            case SPOCK:
                return DRAW;
            default:
                return ERROR;
        }
    }


    /* This method takes the string the user input and translates it to the numerical value representing the 5 game options */
    public static int textToNumber(String choice) {
        switch (choice) {
            case "rock":
                return ROCK; 
            case "paper":
                return PAPER;
            case "scissors":
                return SCISSORS;
            case "lizard":
                return LIZARD;
            case "spock":
                return SPOCK;
            default:
                return -1;
        }
    }
    /* this takes the number and converts it to the cooresponding string */
    public static String numberToText(int choice){
        switch (choice) {
            case ROCK:
                return "rock";
            case PAPER:
                return "paper";
            case SCISSORS:
                return "scissors";
            case LIZARD:
                return "lizard";
            case SPOCK:
                return "spock";
            default:
                return "error";
        }

    }
    
} // end class CPS150_RPSLab
