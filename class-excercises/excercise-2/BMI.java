import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double weight, height, desiredBMI, BMI, neededWeight;

        System.out.println("Enter your weight");
        weight = in.nextDouble();
        System.out.println("Enter your height");
        height = in.nextDouble();       

        BMI = (weight / (height * height)) *703;

        System.out.println("Your BMI is " + BMI);
        System.out.println("A BMI between 20 and 24 is considered ideal.");

        System.out.println("Enter your desired BMI");
        desiredBMI = in.nextDouble();       

        neededWeight = (desiredBMI / 703) * height * height;

        System.out.println("Your weight needs to be " + neededWeight + " pounds for your BMI to be " + desiredBMI);

    }
}