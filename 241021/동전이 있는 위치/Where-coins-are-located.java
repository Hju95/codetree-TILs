import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 격자 크기와 동전 개수 입력 받기
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        // 격자 초기화
        int[][] grid = new int[n][n];
        
        // 동전 위치 입력 받고 격자에 표시
        for (int i = 0; i < m; i++) {
            int r = scanner.nextInt() - 1; // 0-based 인덱스로 변환
            int c = scanner.nextInt() - 1;
            grid[r][c] = 1;
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