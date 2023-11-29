public class VendingMachine {
    private int tokens;
    private int cans;

    // constructor, no parameters, initializes instance variables to 0
    public VendingMachine(){
        tokens = 0;
        cans = 0;
    }

    /*
     * In: int
     * Out: nothing
     * Adds parameter canCount to instance variable cans
     */
    public void fillUp(int canCount){
       cans += canCount; 
    }

    /*
     * In: nothing
     * Out: nothing
     * Increments tokens instance variable and decrements cans instance variable
     */
    public void insertToken() {
        tokens++;
        cans--;
    }

    /*
     * In: nothing
     * Out: int
     * returns number of tokens in the vending machine
     */
    public int getTokenCount() {
        return tokens;
    }

    /*
     * In: nothing
     * Out: int
     * returns number of cans in the vending machine
     */
    public int getCanCount(){
        return cans;
    }
}
