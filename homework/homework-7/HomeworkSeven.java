public class HomeworkSeven {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] newValues = new int[values.length];
        for(int i = 0; i < values.length; i++){
            newValues[i] = values[i];
        }
        for(int i = values.length - 1; i >= 0; i--){
            System.out.print(newValues[i]);
        }
        System.out.println();
    }
}