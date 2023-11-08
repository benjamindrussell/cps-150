import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JFileChooser;

public class InputOutputPractice {
    public static void main(String[] args) throws FileNotFoundException{
        File inputFile = new File("input.txt");     
        Scanner in = new Scanner(inputFile);
        PrintWriter out = new PrintWriter("output.txt");

        while(in.hasNextLine()){
            out.println((in.nextLine()));
        }

        in.close();
        out.close();
        // System.out.println("hello");

        // JFileChooser chooser = new JFileChooser();

        // chooser.showOpenDialog(null);
        
    }    
}
