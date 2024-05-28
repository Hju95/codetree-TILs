import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, t;
        a = sc.nextInt();
        b = sc.nextInt();
        t = 1;

        for (int i = 1; i <= b; i++){
            if (i % a == 0) {
                t *= i;
            }
        }

        System.out.print(t);
    }
}