public class SimpleLoop {
    public static void main(String[] args) {
        /**
         * A simple program that prints a loop control variable.
         */
        int i = 6;
        int limit = 98;
        while (i < limit) {
            System.out.println("i = " + i);
            i += 2;
        }
    }
}