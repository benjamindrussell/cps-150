import java.util.Scanner;

public class RemoveComma {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = "";

        System.out.println("Please enter a number between 1,000 and 999,999");
        input = in.nextLine();

        // int commaIndex = input.indexOf(",", 0);

        int length = input.length();

        System.out.println(input.substring(0, length - 4) + input.substring(length - 3,length));

        in.close();
    }
}