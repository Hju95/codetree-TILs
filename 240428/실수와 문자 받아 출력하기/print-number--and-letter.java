import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b;
        char c;

        c = sc.next().charAt(0);
        a = sc.nextDouble();
        b = sc.nextDouble();

        System.out.printf("%s\n%.2f\n%.2f", c, a, b);
    }
}