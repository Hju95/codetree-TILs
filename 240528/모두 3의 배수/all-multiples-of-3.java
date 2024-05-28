import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k;
        boolean satisfied = true;

        for (int i = 0; i < 5; i ++) {
            k = sc.nextInt();
            if (k % 3 != 0) {
                satisfied = false;
            }
        }

        if (satisfied == true) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }
}