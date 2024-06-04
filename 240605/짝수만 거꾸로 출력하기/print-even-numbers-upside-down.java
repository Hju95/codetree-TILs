import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int k = n; k > 0; k--) {
            if (arr[k-1] % 2 == 0) {
                System.out.print(arr[k-1] + " ");
            }
        }


    }
}