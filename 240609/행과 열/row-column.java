import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                System.out.print((j * i) + " ");
            }
            System.out.println();
        }
    }
}