import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String A = sc.next();

        int count = 0;
        
        for (int i = 0; i < n; i++) {
            String input = sc.next();
            if (input.equals(A)) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}