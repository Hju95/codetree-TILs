import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int result = a == 100? 0 : 1;

        if (result == 0) {
            System.out.println("pass");
        } else {
            System.out.println("failure");
        }
    }
}