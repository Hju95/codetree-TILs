import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] arr = new int[2][4];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        double[] rowAverage = new double[2];
        for (int i = 0; i < 2; i++) {
            double sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += arr[i][j];
            }
            rowAverage[i] = sum / 4;
        }

        double[] colAverage = new double[4];
        for (int j = 0; j < 4; j++) {
            double sum = 0;
            for (int i = 0; i < 2; i++) {
                sum += arr[i][j];
            }
            colAverage[j] = sum / 2;
        }

        double totalSum = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                totalSum += arr[i][j];
            }
        }
        double totalAverage = totalSum / (2 * 4);

        for (int i = 0; i < 2; i++) {
            System.out.print(String.format("%.1f", rowAverage[i]) + " ");
        }
        System.out.println();
        
        for (int j = 0; j < 4; j++) {
            System.out.print(String.format("%.1f", colAverage[j]) + " ");
        }
        System.out.println();
        
        System.out.println(String.format("%.1f", totalAverage));
    }
}