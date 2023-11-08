import java.util.Scanner;;
public class InsertComma {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = "";

        System.out.println("Please enter an integer between 1000 and 999999");
        input = in.nextLine();

        int length = input.length();
        System.out.println(input.substring(0, length - 3) + "," + input.substring(length - 3, length));
    }
}
