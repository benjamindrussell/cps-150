import java.util.Scanner;

public class TriangularCalculations {
    static final double DEGREES_PER_RADIAN = 57.2958;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1, x2, x3, y1, y2, y3;
        x1 = getCoordinate("Enter the x-coordinate of the first corner point", in);
        y1 = getCoordinate("Enter the y-coordinate of the first corner point", in);
        x2 = getCoordinate("Enter the x-coordinate of the second corner point", in);
        y2 = getCoordinate("Enter the y-coordinate of the second corner point", in);
        x3 = getCoordinate("Enter the x-coordinate of the third corner point", in);
        y3 = getCoordinate("Enter the y-coordinate of the third corner point", in);

        double side1, side2, side3;
        side1 = calcSideLength(x1, y1, x2, y2);
        side2 = calcSideLength(x2, y2, x3, y3);
        side3 = calcSideLength(x3, y3, x1, y1);

        System.out.printf("The lengths of the three sides of the triangle are %.1f, %.1f, and %.1f\n", side1, side2, side3);

        double alpha, beta, gamma;
        alpha = calcAlphaAngle(side1, side2, side3);
        beta = calcBetaAngle(side1, side2, side3);
        gamma = calcGammaAngle(side1, side2, side3);

        System.out.printf("The three angles of the triangle are %.1f degrees, %.1f degrees, and %.1f degrees\n", alpha, beta, gamma);

        double perimeter, area;
        perimeter = calcPerimeter(side1, side2, side3);
        area = calcArea(side1, side2, side3);
        System.out.printf("The perimeter of the triangle is %.1f, and the area of the triangle is %.1f\n", perimeter, area);


    }
    public static int getCoordinate(String prompt, Scanner in){
        System.out.println(prompt);
        int ret = in.nextInt();
        in.nextLine();
        return ret;
    }
    public static double calcSideLength(int x1, int y1, int x2, int y2){
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    public static double calcAlphaAngle(double a, double b, double c){
        double radians = Math.acos((b * b + c * c - a * a) / (2 * b * c));
        return radians * DEGREES_PER_RADIAN;
    }

    public static double calcBetaAngle(double a, double b, double c){
        double radians = Math.acos((a * a + c * c - b * b) / (2 * a * c));
        return radians * DEGREES_PER_RADIAN;
    }
    public static double calcGammaAngle(double a, double b, double c){
        double radians = Math.acos((a * a + b * b - c * c) / (2 * a * b));
        return radians * DEGREES_PER_RADIAN;
    }
    public static double calcPerimeter(double side1, double side2, double side3){
        return side1 + side2 + side3;
    }
    public static double calcArea(double a, double b, double c){
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}