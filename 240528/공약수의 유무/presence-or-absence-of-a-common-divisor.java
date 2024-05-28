import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, num, t = 0;
        a = sc.nextInt();
        b = sc.nextInt();
        num = a;

        while (true) {
            if (t == 1 || num == b) {
                System.out.print(t);
                break;
            }

            if (1920 % num == 0 && 2880 % num == 0) {
                t = 1;
            }

            num ++;

        }
    }
}