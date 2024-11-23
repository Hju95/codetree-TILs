import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        if (input.length() > 1) {
            String result = input.substring(1) + input.charAt(0);
            System.out.println(result);
        } else {
            System.out.println(input);
        }
        
        sc.close();
    }
}