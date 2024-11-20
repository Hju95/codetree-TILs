import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String A = sc.next();
        String B = sc.next();
        
        long AB = Long.parseLong(A + B);
        long BA = Long.parseLong(B + A);
        
        long result = AB + BA;
        System.out.println(result);
    }
}