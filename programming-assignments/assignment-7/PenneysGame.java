import java.util.Scanner;
public class PenneysGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Penney's Game\n");
        System.out.println("First, enter the number of coins (n) you and I each choose.\n" + 
                           "Then, enter your n coin choices, and I'll do the same." +
                           "Then, we keep flipping until one of our sequences comes up, and that player wins." + 
                           "Ready?  Then let's go!");
        System.out.println("Enter the number of coins (> 0) \n");

        int numCoins = in.nextInt();

        
        for(int i = 1; i <= numCoins; i++){
            System.out.println("Enter coin " + i + ": ('h for heads, 't' for tails): ");
        }


    }    
}
