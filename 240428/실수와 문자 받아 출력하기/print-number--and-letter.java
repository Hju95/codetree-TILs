import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b;
        String c;

        c = sc.next();
        a = sc.nextDouble();
        b = sc.nextDouble();

        System.out.printf("%s\n%.2f\n%.2f", c, a, b);
    }
}