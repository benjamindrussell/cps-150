public class HomeworkSeven {
    public static void main(String[] args) {
        int height = 3;
        int width = 4;
        for(int i = 1; i <= height * width; i++){
            System.out.print("*");
            if(i % width == 0){
                System.out.println();
            }
        }
    }
}