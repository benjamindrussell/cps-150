import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class NameMessage {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner in = new Scanner(System.in);
        String fileName, inMessage;

        System.out.println("Enter the name of the file");
        fileName = in.nextLine();
        PrintWriter out = new PrintWriter(fileName);
        
        System.out.println("Enter the message to write to the file: ");
        inMessage = in.nextLine();

        out.println(inMessage);
        System.out.println("Wrote the message into the file");

        out.close();
        in.close();

        File file = new File(fileName);
        in = new Scanner(file);

        String readMessage = "";

        if(in.hasNextLine()){
            readMessage = in.nextLine();
        }

        System.out.println("Message read from the file: " + readMessage);

        in.close();
    }
}
