// JavaArrayLists.java

import java.util.*;

/*
 * CPS 150
 * Algorithms & Programming I
 * 
 * Lab Project: Java Array Lists
 * 
 * Name: Ben Russell
 */

public class JavaArrayLists
{
  public static void main(String[] args)
  {
    // declare and create an ArrayList with the identifier names that can hold strings
    ArrayList<String> names = new ArrayList<String>();
    
    // print out the ArrayList
    System.out.println(names);
    
    // Call the ArrayList's add() method to enter the following names in sequence: Alice, Bob, Connie, David, Edward, Fran, Gomez, Harry.
    names.add("Alice");
    names.add("Bob");
    names.add("Connie");
    names.add("David");
    names.add("Edward");
    names.add("Fran");
    names.add("Gomez");
    names.add("Harry");
    // Print the ArrayList again.
    System.out.println("names: " + names); 
    // Call the ArrayList's get() method to retrieve and print the first and last names.
    System.out.println("First: " + names.get(0)); 
    System.out.println("Last: " + names.get(7));
    // Print the size() of the ArrayList.
    System.out.println("Size: " + names.size()); 
    // Use size() to help you print the last name in the list.
    System.out.println("Last (using size): " + names.get(names.size()-1));   
    // Use set() to change "Alice" to "Alice B. Toklas".
    names.set(0, "Alice B. Toklas");
    // Print the ArrayList to verify the change.
    System.out.println("names: " + names);
    // Use the alternate form of add() (i.e., the form with the index parameter) to insert "Doug" after "David".
    names.add(4, "Doug");
    // Print the ArrayList again.
    System.out.println("names: " + names); 
    // Use a loop (instead of a single call to System.out.println) to print each name in the ArrayList.
    for(int i = 0; i < names.size(); i++){
      System.out.println("Name " + i + ": " + names.get(i));
    } 

    // Create a second Array List called names2 that is built by calling the ArrayList
    //    constructor that accepts another ArrayList as an argument.
    // Pass names to the ArrayList constructor to build names2.
    ArrayList<String> names2 = new ArrayList<String>(names);
    // Then print the ArrayList again.
    System.out.println("names2: " + names2); 
    // Call names.remove(0) to remove the first element from the original ArrayList.
    names.remove(0);
    // Print names and names2.
    System.out.println("names: " + names);
    System.out.println("names2: " + names2);
    // Verify that "Alice B. Toklas" was removed from names, but not from names2.
    if(!names.get(0).equals("Alice B. Toklas") && names2.get(0).equals("Alice B. Toklas")) {
      System.out.println("Successfully Removed");
    }
  } // end main method
} // end class JavaArrayLists
