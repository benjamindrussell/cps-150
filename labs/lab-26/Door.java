/* 
 * Author: Ben Russell
 * Date: 11/27/2023
 * Purpose: Practice modeling real-world objects in java code by implementing a Door class
 */
public class Door {
    // instance variables
    private String name;
    private boolean state;

    // set name of door
    public void setName(String n) {
        name = n;
    }

    // check if door is open
    public boolean isOpen() {
        return state;
    }

    // open door
    public void open() {
        state = true;
    }

    // close door
    public void close() {
        state = false;
    }

    // output name and state of door
    public void output() {
        System.out.print(name);
        System.out.print(": ");
        if (state) {
            System.out.println("open");
        } else {
            System.out.println("closed");
        }
    }
}
