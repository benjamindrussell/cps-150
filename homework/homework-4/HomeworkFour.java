public class HomeworkFour {
    public static void main(String[] args) {
        System.out.println(f(2));
        System.out.println(g(h(2)));
        System.out.println(k(g(2) + h(2)));
        System.out.println((f(0) + f(1) + f(2)));
        System.out.println((f(-1) + g(-1) + h(-1) + k(-1)));
    }

    public static double f(double x) {
        return g(x) + Math.sqrt(h(x));
    }

    public static double g(double x) {
        return 4 * h(x);
    }

    public static double h(double x) {
        return x * x + k(x) - 1;
    }

    public static double k(double x) {
        return 2 * (x + 1);
    }
}