import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        a = sc.nextInt();
        b = sc.nextInt();

        System.out.print(a + " ");
        for (int i = a; i < b;) {
            if (i % 2 == 1 && i < b) {
                i *= 2;
                if (i <= b) {
                    System.out.print(i + " ");
                }
            }
            else if (i % 2 == 0 && i < b) {
                i += 3;
                if (i <= b) {
                    System.out.print(i + " ");
                }
            }
        }    
    }
}