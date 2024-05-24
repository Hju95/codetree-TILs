import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double count = 0;
        double avg = 0;

        while (true) {
            int n;
            n = sc.nextInt();

            if (n >= 30 || n < 20) {
                break;
            }

            avg += n;
            count ++;
        }
        
        avg = Math.round((avg / count) * 100) / 100.0;

        System.out.printf("%.2f",avg);
    }
}