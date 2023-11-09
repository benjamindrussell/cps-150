import java.util.Scanner;

public class Pig {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);

        int playerOne = 0, playerTwo = 0;
        int roll = 0;
        int sum = 0;
        String rollAgain;

        System.out.println("Welcome to the game of Pig!");

        while(playerOne < 100 && playerTwo < 100){
            sum = 0;
            while(true){
                roll = (int) (Math.random() * 6) + 1;
                System.out.println("You rolled: " + roll);
                if(roll == 1){
                    System.out.println("You lose your turn! Your total is " + playerOne);
                    break;
                }
                sum += roll;
                System.out.println("Your turn score is " + sum + " and your total score is " + playerOne);
                System.out.println("If you hold, you will have " + (sum + playerOne) + " points.");
                System.out.println("Enter 'r' to roll again, 's' to stop.");
                rollAgain = in.nextLine();
                if(rollAgain.toLowerCase().equals("s")){
                    playerOne += sum;
                    System.out.println("Your score is " + playerOne);
                    break;
                }
            }
            System.out.println();
            if(playerOne >= 100){
                break;
            } 
            sum = 0;
            while (sum < 20) {
                roll = (int) (Math.random() * 6) + 1;
                System.out.println("The computer rolled: " + roll);
                if(roll == 1){
                    System.out.println("The computer lost its turn! Computer total is " + playerTwo);
                    sum = 0;
                    break;
                }
                sum += roll;
                if (sum >= 20) {
                    System.out.println("The computer holds.");
                }
            }
            playerTwo += sum;
            System.out.println("The computer's score is " + playerTwo);
            System.out.println();
        }

        if(playerOne > playerTwo){
            System.out.println("YOU WIN!");
        } else {
            System.out.println("THE COMPUTER WINS!");
        }


    }    
}
