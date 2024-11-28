import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        boolean containsEE = input.contains("ee");
        boolean containsAB = input.contains("ab");
        
        System.out.println((containsEE ? "Yes" : "No") + " " + (containsAB ? "Yes" : "No"));
    }
}