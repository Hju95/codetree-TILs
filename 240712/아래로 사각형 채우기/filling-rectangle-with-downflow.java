import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int num = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    arr[i][j] = num;
                } else {
                    arr[i][j] = arr[i][j-1] + n;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
            num++;
        }
    }
}