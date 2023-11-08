import java.util.Scanner;
public class TimeDiff {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String timeOne;
        String timeTwo;

        System.out.println("Please enter the first time: ");
        timeOne = in.nextLine();

        System.out.println("Please enter the second time: ");
        timeTwo = in.nextLine();

        int hoursOne = Integer.parseInt(timeOne.substring(0, 2));
        int minutesOne = Integer.parseInt(timeOne.substring(2, timeOne.length()));

        int hoursTwo = Integer.parseInt(timeTwo.substring(0, 2));
        int minutesTwo = Integer.parseInt(timeTwo.substring(2, timeTwo.length()));

        int hourDiff = hoursTwo - hoursOne;
        int minDiff = minutesTwo - minutesOne;

        System.out.println((hourDiff) + " hours " + minDiff + " minutes");
        
    } 
}
