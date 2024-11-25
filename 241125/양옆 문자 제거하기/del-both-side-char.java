import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        if (input.length() < 10 || input.length() > 100) {
            System.out.println("Invalid input length");
        } else {
            String modifiedString = input.substring(0, 1) + input.substring(2, input.length() - 2) + input.substring(input.length() - 1);
            System.out.println(modifiedString);
        }
    }
}