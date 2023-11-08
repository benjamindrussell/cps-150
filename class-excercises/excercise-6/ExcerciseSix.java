import java.util.Scanner;

public class ExcerciseSix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = 0;
        int sum = 0;
        int totalCount = 0;
        int posCount = 0;
        int negCount = 0;
        while(in.hasNextInt()){
            input = in.nextInt();
            if(input == 0){
                break;
            } else if(input > 0){
                posCount++;
            } else if(input < 0){
               negCount++; 
            }

            totalCount++;
            sum += input;
        }

        double average = (double) sum / totalCount;

        if(totalCount == 0) {
            System.out.println("No numbers were entered except 0");
        } else {
            System.out.println("The number of positives is " + posCount);
            System.out.println("The number of negatives is " + negCount);
            System.out.println("The total is " + sum);
            System.out.println("The average is " + average);
        }
    }
}