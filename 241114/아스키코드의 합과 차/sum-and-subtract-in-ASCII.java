import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char char1 = input.charAt(0);
        char char2 = input.charAt(2);

        int a = (int) char1;
        int b = (int) char2;
        
        int sum = a + b;
        int difference = Math.abs(a - b);
        
        // 결과 출력
        System.out.println(sum + " " + difference);
    }
}