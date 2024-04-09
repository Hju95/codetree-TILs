import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] arr = new char[5][3];
        for (int i = 0; i < 5; i++) {
            String line = scanner.nextLine();
            String[] tokens = line.split(" ");
            for (int j = 0; j < 3; j++) {
                arr[i][j] = tokens[j].charAt(0);
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = Character.toUpperCase(arr[i][j]);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}