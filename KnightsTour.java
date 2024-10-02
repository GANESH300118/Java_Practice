import java.util.*;

public class KnightsTour{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        int a = 0, i = 0, j = 0;
        int[][] operations = {
            {2, 1}, {1,2}, {-1,2}, {-2,1},
            {-2,-1}, {-1, -2}, {1,-2}, {2,-1}
        };

        board[0][0] = a;
        a++;
        if (solve(board, operations, i, j, a, n)) {
            printBoard(board, n);
        } else {
            System.out.println("No solution exists");
        }
    }
    static boolean solve(int[][] board, int[][] operations, int i, int j, int a, int n) {
        if (a == n * n) {
            return true;
        }
        for (int index = 0; index < operations.length; index++) {
            int newI = i + operations[index][0];
            int newJ = j  + operations[index][1];

            if (isValid(newI, newJ, n, board)) {
                board[newI][newJ] = a;
                if (solve(board, operations, newI, newJ, a + 1, n)) {
                    return true;
                } else {
                    board[newI][newJ] = 0;
                }
            }
        }
        return false;
    }

    static boolean isValid(int row, int col, int n, int[][] board) {
        return row >= 0 && row < n && col >= 0 && col < n && board[row][col] == 0;
    }

    static void printBoard(int[][] board, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}