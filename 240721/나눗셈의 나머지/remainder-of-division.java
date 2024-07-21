import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        int[] countArr = new int[b];

        while (a > 1) {
            int remainder = a % b;
            countArr[remainder]++;
            a /= b;
        }

        int sum = 0;
        for (int count : countArr) {
            sum += count * count;
        }

        System.out.println(sum);

    }
}