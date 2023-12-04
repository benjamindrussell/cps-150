/*
 * TextEditor.java
 * Ben Russell
 */

import java.util.*;
import java.io.*;
import javax.swing.JFileChooser;

public class TextEditor {
    static Scanner in = new Scanner(System.in);
    static Scanner fileReader = null;
    static File filePath = null;

    public static void main(String[] args) throws FileNotFoundException {
        /*
         * Name: Ben Russell
         * Assignment: Final Project Text Editor
         * 
         * Description: Build a simple yet fully functional and usable text editor
         * 
         * Bug Report:
         * 1. Index out of bounds exception in deleteDocumentLine because I forgot to
         * convert the line number to the real index
         * 2. I had a problem where the program was skipping inputs and it was because
         * the nextInt method doesn't consume the entire line, meaning the \n from the
         * user hitting enter was still there. I fixed this by just adding a call to the
         * nextLine method directly after the nextInt call
         * 3. After my try catch caught an Input mismatch error, the program would enter
         * an infinite loop. A quick google search told me to add a call to the nextLine
         * method to prevent this
         * 4. It would originally take two tries to close out of the showOpenDialog and
         * showSaveDialog. This was because in my else if statements, I was calling the
         * method twice, once in the header of the if, and once in the header of the if
         * else. I fixed this by creating a variable that stores the result of the
         * called method so it only needs to be called once
         */
        
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
                    System.out.println("\n*** fatal input mismatch error ***");
                    in.nextLine(); // prevents infinite loop
                    input = -1; // meets condition to keep looping
                    continue; // skip to looping condition
                }
                // if the integer input is out of range then tell the user
                if (input < 1 || input > 9) {
                    System.out.println("\n*** unknown choice; try again ***");
                }
                // if the integer input is out of range continue getting input
            } while (input < 1 || input > 9);

            // call function to handle one of the 9 options
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
                    addDocumentLine(currentFile);
                    break;
                case 6:
                    insertDocumentLine(currentFile);
                    break;
                case 7:
                    changeDocumentLine(currentFile);
                    break;
                case 8:
                    deleteDocumentLine(currentFile);
                    break;
                case 9:
                    endProgram();
                    isRunning = false; // end looping and thus end the program
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
                "Please make a selection:\n" +
                "    1. Open a new document\n" +
                "    2. Save the current document\n" +
                "    3. Display the current document\n" +
                "    4. Display a document line\n" +
                "    5. Add a document line\n" +
                "    6. Insert a document line\n" +
                "    7. Change a document line\n" +
                "    8. Delete a document line\n" +
                "    9. End the program");
        System.out.print(">>> ");
    }

    /*
     * In: ArrayList<String>
     * Out: Nothing
     * Reads txt file into the array list that is passed as a parameter, uses
     * JFileChooser to get user unput
     */
    public static void openNewDocument(ArrayList<String> currentFile) throws FileNotFoundException {


        JFileChooser fileChooser = new JFileChooser();
        // get input with jfilechooser, try catch to prevent the user from opening a
        // document that doesn't exist
        try {
            int returnedByFileChooser = fileChooser.showOpenDialog(null);
            if (returnedByFileChooser == JFileChooser.APPROVE_OPTION) {
                // clear previous file
                int fileSize = currentFile.size();
                for (int i = 0; i < fileSize; i++) {
                    currentFile.remove(0);
                }

                filePath = fileChooser.getSelectedFile();
                fileReader = new Scanner(filePath);
            } else if (returnedByFileChooser == JFileChooser.CANCEL_OPTION) {
                System.out.println("\nOpen operation cancelled.\n");
                return;
            }
        } catch (IOException e) {
            System.out.println("\n*** fatal I/O error ***");
            return;
        }

        // read the file into the ArrayList one line at a time
        while (fileReader.hasNextLine()) {
            currentFile.add(fileReader.nextLine());
        }

        System.out.println("\nDocument open completed.\n");
    }

    /*
     * In: ArrayList<String>
     * Out: nothing
     * saves current open document to disk
     */
    public static void saveCurrentDocument(ArrayList<String> currentFile) throws FileNotFoundException {
        JFileChooser fileChooser = new JFileChooser();

        // If the current document is a new document, get user input with jfilechooser
        // for the location and name of the file to be saved
        if (filePath == null) {
                int returnedByFileChooser = fileChooser.showSaveDialog(null);
                if (returnedByFileChooser == JFileChooser.APPROVE_OPTION) {
                    filePath = fileChooser.getSelectedFile();
                } else if (returnedByFileChooser == JFileChooser.CANCEL_OPTION) {
                    System.out.println("\nSave operation cancelled.\n");
                    return;
                }
        }

        // write data from currentFile ArrayList to disk
        PrintWriter out = new PrintWriter(filePath);
        for (int i = 0; i < currentFile.size(); i++) {
            out.println(currentFile.get(i));
        }
        out.close();

        System.out.println("\nDocument save completed.\n");
    }

    /*
     * In: ArrayList<String>
     * Out: Nothing
     * Displays the current open document
     */
    public static void displayCurrentDocument(ArrayList<String> currentFile) {
        System.out.println();
        // iterate through ArrayList and output the contents of each index one line at a
        // time
        for (int i = 0; i < currentFile.size(); i++) {
            System.out.println((i + 1) + ": " + currentFile.get(i));
        }
        System.out.println();
    }

    /*
     * In: ArrayList<String>
     * Out: Nothing
     * Display document line specified by user
     */
    public static void displayDocumentLine(ArrayList<String> currentFile) {
        int lineNumber = getLineNumber(currentFile.size());
        if (lineNumber == -1)
            return; // if getLineNumber decides it's not a valid line, return immediately
        System.out.println("\n" + lineNumber + ": " + currentFile.get(lineNumber - 1));
    }

    /*
     * In: ArrayList<String>
     * Out: nothing
     * adds a new line to the end of the current open file
     */
    public static void addDocumentLine(ArrayList<String> currentFile) {
        System.out.print("\nNew text >>> ");
        // get text for the new line from System.in and append the line to the end of
        // the currentFile ArrayList
        currentFile.add(in.nextLine());
    }

    /*
     * In: ArrayList<String>
     * Out: nothing
     * inserts a new line in the middle or beginning of the current open file
     */
    public static void insertDocumentLine(ArrayList<String> currentFile) {
        int lineNumber = getLineNumber(currentFile.size());
        // the user may not insert a line at the end, because that is the job of the
        // addDocumentLine function
        if (lineNumber - 1 == currentFile.size()) {
            System.out.println("\n*** Invalid line number ***");
            return;
        } else if (lineNumber == -1) {
            return;
        }

        // get user input from System.in and insert it at the specified line number
        System.out.print("\nNew text >>> ");
        currentFile.add(lineNumber - 1, in.nextLine());
    }

    /*
     * In: ArrayList<String>
     * Out: nothing
     * changes the line specified by the user to new text specified by the user
     */
    public static void changeDocumentLine(ArrayList<String> currentFile) {
        int lineNumber = getLineNumber(currentFile.size());
        if (lineNumber == -1)
            return; // if getLineNumber decides it's not a valid line, return immediately

        // get user input from System.in
        System.out.print("\nNew text >>> ");
        String lineToAdd = in.nextLine();

        // user verifies their decision
        System.out.print("Change line " + lineNumber + "; are you sure? ");
        // if the first letter of their word is a y, then update the line, otherwise do
        // nothing
        if (in.next().substring(0, 1).toLowerCase().equals("y")) {
            currentFile.set(lineNumber - 1, lineToAdd);
        }
    }

    /*
     * In: ArrayList<String>
     * Out: nothing
     * deletes document line specified by user
     */
    public static void deleteDocumentLine(ArrayList<String> currentFile) {
        int lineNumber = getLineNumber(currentFile.size());
        if (lineNumber == -1) return; // if getLineNumber decides it's not a valid line, return immediately

        // user verifies their decision
        System.out.print("Delete line " + lineNumber + "; are you sure? ");
        // if the first letter of their word is a y, then update the line, otherwise do
        // nothing
        if (in.next().substring(0, 1).toLowerCase().equals("y")) {
            currentFile.remove(lineNumber - 1);
        }
    }

    /*
     * In: nothing
     * Out: nothing
     * close scanners and print closing message 
     */
    public static void endProgram() {
        System.out.println("\nThanks for using my software; have a good day :)");
        // if statements prevent calling close method on a null object
        if (in != null) in.close();
        if (fileReader != null) fileReader.close();
    }

    /*
     * In: int
     * Out: int
     * get user input for a line number, return the specified line number if the
     * number is valid, return -1 otherwise
     */
    public static int getLineNumber(int fileSize) {
        int lineNumber = -1;
        System.out.print("\nLine number >>> ");
        // try catch to prevent user from entering a non-integer
        try {
            lineNumber = in.nextInt();
            in.nextLine(); // consume \n
        } catch (InputMismatchException e) {
            System.out.println("\n*** fatal input mismatch error ***");
            in.nextLine(); // prevents infinite loop
            return -1; // -1 indicates error
        }
        // if the integer input is out of range then tell the user and immediately
        // return -1 to indicate error
        if (lineNumber < 0 || lineNumber > fileSize) {
            System.out.println("\n*** Invalid line number ***");
            return -1;
        }

        return lineNumber;
    }
}
