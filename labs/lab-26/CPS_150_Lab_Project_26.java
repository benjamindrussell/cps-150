/* 
 * Author: Ben Russell
 * Date: 11/27/2023
 * Purpose: Main java file to test the Door class
 */
public class CPS_150_Lab_Project_26 {
    public static void main(String[] args) {
        Door[] doors = new Door[3];
        // first element is an open side door
        doors[0] = new Door();
        doors[0].setName("Side");
        doors[0].open();

        //second element is a closed front door
        doors[1] = new Door();
        doors[1].setName("Front");
        doors[1].close();

        // third element is a closed back door
        doors[2] = new Door();
        doors[2].setName("Back");
        doors[2].close();

        // display doors and their states
        for(int i = 0; i < 3; i ++){
            doors[i].output();
        }

        // switch door state
        for(int i = 0; i < 3; i ++){
            if(doors[i].isOpen()){
                doors[i].close();
            } else {
                doors[i].open();
            }
        }

        // display doors and their states
        for(int i = 0; i < 3; i ++){
            doors[i].output();
        }

    }
}