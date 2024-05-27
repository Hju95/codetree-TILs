import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, n, k;
        a = sc.nextInt();
        n = sc.nextInt();
        k = 0;

        while (k < n) {
            a += n;
            System.out.println(a);
            k++;
        }
    }
}