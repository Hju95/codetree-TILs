import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 첫 번째 줄 입력: n과 m
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // n * n 크기의 격자 초기화
        int[][] grid = new int[n][n];

        // m개의 점 위치 입력 및 번호 부여
        for (int i = 1; i <= m; i++) {
            int r = scanner.nextInt();
            int c = scanner.nextInt();
            grid[r - 1][c - 1] = i; // 인덱스는 0부터 시작하므로 1을 뺌
        }

        // 결과 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(grid[i][j]);
                if (j < n - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}