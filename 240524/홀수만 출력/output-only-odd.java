import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;

        a = sc.nextInt();
        b = sc.nextInt();

        for (int i = a; i < b + 1; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
    }
}