import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        StringBuilder result = new StringBuilder(input);
        char firstChar = input.charAt(0);
        char lastChar = input.charAt(input.length() - 1);
        
        result.setCharAt(0, lastChar);
        result.setCharAt(input.length() - 1, firstChar);
        
        System.out.println(result.toString());
        
        sc.close();
    }
}