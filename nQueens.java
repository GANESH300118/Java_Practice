import java.util.*;

class nQueens {
    static int[][] board;
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 2 || n == 3) {
            System.out.println("-1");
            return;
        }
        board = new int[n][n];
        nqueen(n, 0);
    }
    
    static boolean nqueen(int n, int col) {
        if (col == n) {
            printSolution(n);
            return false;
        }
        for (int i = 0; i < n; i++) { // rows
            if (isSafe(i, col, n)) {
                board[i][col] = 1;
                if (nqueen(n, col + 1)) {
                    return true;
                }
                board[i][col] = 0;
            }
        }
        return false;
    }
    
    static boolean isSafe(int row, int col, int n) {
        // Check this row on left side
        for (int i = col; i >= 0; i--) {
            if (board[row][i] == 1) {
                return false;
            }
        }
        
        // Check upper diagonal on left side
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        
        // Check lower diagonal on left side
        for (int i = row, j = col; i < n && j >= 0; i++, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        
        return true;
    }

    static void printSolution(int n) {
        System.out.println("Board configuration:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.print("Solution: [");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[j][i] == 1) {
                    System.out.print((j + 1) + " ");
                }
            }
        }
        System.out.print("]\n");
    }
}