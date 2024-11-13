import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int sum = a + b;
        
        int count = countOnes(sum);
        
        System.out.println(count);
    }

    public static int countOnes(int number) {
        int count = 0;
        while (number > 0) {
            if (number % 10 == 1) {
                count++;
            }
            number /= 10;
        }
        return count;
    }
}