import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        char b = sc.next().charAt(0);
        int c = sc.nextInt();
        char d = sc.next().charAt(0);

        if ((a >= 19 || c >= 19) && (b == 'M' || d == 'M')) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        
    }
}