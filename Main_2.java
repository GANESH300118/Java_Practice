import java.util.Scanner;
public class Main_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        int[][] fruits = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                fruits[i][j] = scanner.nextInt();
            }
        }        
        int[] rowSum = new int[rows];
        int maxRowSum = Integer.MIN_VALUE;
        int maxRow = -1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                rowSum[i] += fruits[i][j];
            }
            if (rowSum[i] > maxRowSum) {
                maxRowSum = rowSum[i];
                maxRow = i;
            }
        }        
        int[] columnSum = new int[columns];
        int maxColumnSum = Integer.MIN_VALUE;
        int maxColumn = -1;
        for (int j = 0; j < columns; j++) {
            for (int i = 0; i < rows; i++) {
                columnSum[j] += fruits[i][j];
            }
            if (columnSum[j] > maxColumnSum) {
                maxColumnSum = columnSum[j];
                maxColumn = j;
            }
        }
        System.out.print("The Sum of rows is ");
        for (int i = 0; i < rows; i++) {
            System.out.print(rowSum[i] + " ");
        }
        System.out.println("\nRow " + (maxRow + 1) + " has a maximum sum");
        System.out.print("The Sum of columns is ");
        for (int j = 0; j < columns; j++) {
            System.out.print(columnSum[j] + " ");
        }
        System.out.println("\nColumn " + (maxColumn + 1) + " has the maximum sum");
        scanner.close();
	}
}