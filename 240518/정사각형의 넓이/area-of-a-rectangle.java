import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int q = a * a;

        if (a < 5) {
            System.out.println(q);
            System.out.println("tiny");
        } else {
            System.out.println(q);
        }
    }
}