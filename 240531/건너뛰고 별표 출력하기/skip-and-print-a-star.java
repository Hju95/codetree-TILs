import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
            System.out.println();
        }

        for(int k = 0; k < n; k++){
            for(int l = 0; l < n - k; l++){
                System.out.print("*");
            }
            System.out.println();
            System.out.println();
        }
    }
}