import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("mary.txt");
        Scanner in = new Scanner(file);
        int lineNum = 1;
        String currentLine = "";
        while(in.hasNextLine()){
            currentLine = in.nextLine(); 
            System.out.println(lineNum + " " + currentLine);
            lineNum++;
            currentLine = "";
        }
    }
}
