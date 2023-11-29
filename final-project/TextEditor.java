import java.util.*;
import java.io.*;
import javax.swing.JFileChooser;

public class TextEditor {
    static Scanner in = new Scanner(System.in);
    static Scanner fileReader = null;
    static File filePath = null;
    public static void main(String[] args) throws FileNotFoundException{
        // Program State
        boolean isRunning = true;

        // ArrayList of strings representing the lines of the file
        ArrayList<String> currentFile = new ArrayList<String>();

        // intro
        System.out.println("Welcome to the Java Text Editor\n");
        System.out.println("This is a simple yet useful text editor,\n\t" +
                "similar to the text editors used prior to\n\t" +
                "the advent of Graphical User Interfaces\n");
        System.out.println("Enjoy!\n\n");

        // variable for user input
        int input = 0;
        // main control loop
        while (isRunning) {
            // get input
            do {
                printMainMenu();
                // try catch to prevent user from giving anything that's not an int
                try {
                    input = in.nextInt();
                    in.nextLine(); // consume \n
                } catch (InputMismatchException e) {
                    System.out.println("*** fatal input mismatch error ***");
                    in.nextLine(); // prevents infinite loop
                    input = -1; // meets condition to keep looping
                    continue; // skip to looping condition
                }
                // if the integer input is out of range then tell the user
                if(input < 1 || input > 9){
                    System.out.println("*** unknown choice; try again ***");
                }
                // if the integer input is out of range continue getting input
            } while (input < 1 || input > 9);

            switch (input) {
                case 1:
                    openNewDocument(currentFile);
                    break;
                case 2:
                    saveCurrentDocument(currentFile);
                    break;
                case 3:
                    displayCurrentDocument(currentFile);
                    break;
                case 4:
                    displayDocumentLine(currentFile);
                    break;
                case 5:
                    addDocumentLine();
                    break;
                case 6:
                    insertDocumentLine();
                    break;
                case 7:
                    changeDocumentLine();
                    break;
                case 8:
                    deleteDocumentLine();
                    break;
                case 9: 
                    endProgram();
                    break;
                default:
                    break;
            }
        } 
    }

    /*
     * In: Nothing
     * Out: Nothing
     * Displays main menu
     */
    public static void printMainMenu() {
        System.out.println("Main Menu\n" +
                "Please make a selection:\n\t" +
                "1. Open a new document\n\t" +
                "2. Save the current document\n\t" +
                "3. Display the current document\n\t" +
                "4. Display a document line\n\t" +
                "5. Add a document line\n\t" +
                "6. Insert a document line\n\t" +
                "7. Change a document line\n\t" +
                "8. Delete a document line\n\t" +
                "9. End the program");
        System.out.print(">>> ");
    }

    /*
     * In: ArrayList<String>
     * Out: Nothing
     * Reads txt file into the array list that is passed as a parameter, uses JFileChooser to get user unput
     */
    public static void openNewDocument(ArrayList<String> currentFile) throws FileNotFoundException{
        JFileChooser fileChooser = new JFileChooser();        
        try {
            if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                filePath = fileChooser.getSelectedFile();
                fileReader = new Scanner(filePath);
            }
        } catch (IOException e) {
            System.out.println("\n*** fatal I/O error ***");
            return;
        }

        while(fileReader.hasNextLine()){
            currentFile.add(fileReader.nextLine());
        }

        System.out.println("\nDocument open completed.\n");
    }


    public static void saveCurrentDocument(ArrayList<String> currentFile){

    }

    /*
     * In: ArrayList<String>
     * Out: Nothing
     * Displays the current open document
     */
    public static void displayCurrentDocument(ArrayList<String> currentFile){
        System.out.println();
        for(int i = 0; i < currentFile.size(); i++){
            System.out.println((i + 1) + ". " + currentFile.get(i));
        }
        System.out.println();
    }

    public static void displayDocumentLine(ArrayList<String> currentFile){
        int lineNumber = 0;
        do{
            System.out.print("\nLine number >>> ");
                try {
                    lineNumber = in.nextInt();
                    in.nextLine(); // consume \n
                } catch (InputMismatchException e) {
                    System.out.println("*** fatal input mismatch error ***");
                    in.nextLine(); // prevents infinite loop
                    lineNumber = -1; // meets condition to keep looping
                    continue; // skip to looping condition
                }

                if(lineNumber < 1 || lineNumber > currentFile.size()){
                    System.out.println("*** Invalid line number ***");
                }
        } while (lineNumber < 1 || lineNumber > currentFile.size());

        System.out.println("\n" + currentFile.get(lineNumber - 1));
    }

    public static void addDocumentLine(){

    }

    public static void insertDocumentLine(){

    }

    public static void changeDocumentLine(){

    }

    public static void deleteDocumentLine(){

    }

    public static void endProgram(){

    }
}
