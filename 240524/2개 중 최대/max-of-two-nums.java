import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, m;

        a = sc.nextInt();
        b = sc.nextInt();

        m = a > b ? a : b;

        System.out.println(m);
    }
}