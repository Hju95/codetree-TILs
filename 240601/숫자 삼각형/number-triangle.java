import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < i + 1; k++) {
                System.out.print((k + 1) + " ");
            }
            System.out.println();
        }
    }
}