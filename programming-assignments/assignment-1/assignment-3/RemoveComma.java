import java.util.Scanner;
public class RemoveComma {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = ""; 

        System.out.println("Please enter a value between 1,000 and 999,999");
        input = in.nextLine();

        int commaIndex = input.indexOf(",", 0);

        System.out.println(input.substring(0, commaIndex) + input.substring(commaIndex + 1, input.length()));

    }    
}
