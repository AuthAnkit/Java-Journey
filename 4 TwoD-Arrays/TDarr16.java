    /*Diagonal Traversal of a Matrix
    Give a N * N square matrix, return all the elements of its diagonals from top to bottom.

    Input Format
    First line contains N, representing the order of the 2D matrix.

    Next N lines contains N spaced elements each representing matrix elements.

    Output Format
    Output in a sigle line, the Diagonal traversal of the matrix.

    The traversal should start from the top right of the matrix in bottom right direction and should continue upto bottom left.

    Example 1
    Input

    2
    1 2
    3 4
    Output

    2 1 4 3
    Explanation:

    Topmost diagonal is [[2]]

    Next diagonal is [[1, 4]]

    and the last diagonal is [[3]]

    Example 2
    Input

    3
    1 2 3
    4 5 6
    7 8 9
    Output

    3 2 6 1 5 9 4 8 7
    EXPLANATION

    Topmost diagonal is [[3]]

    Next diagonal is [[2, 6]]

    Next diagonal is [[1, 5, 9]]

    Next diagonal is [[4, 8]]

    and the last-diagonal is [[7]]

    CONSTRAINTS:
    1 <= N <= 500

    -10000 <= Mat[i][j] <= 10000

    Topics
    2D Arrays - Basics
    2D-Arrays
    Companies
    Amazon
    */


import java.util.*;

public class TDarr16 {
    public static void RightToLeftDia(int[][] mat, int n) {
        // Step 1: Start from top-right corner and go left across the first row
        for (int col = n - 1; col >= 0; col--) {
            int i = 0;
            int j = col;
            while (i < n && j < n) {
                System.out.print(mat[i][j] + " ");
                i++;
                j++;
            }
        }

        // Step 2: Start from second row's first column and go down
        for (int row = 1; row < n; row++) {
            int i = row;
            int j = 0;
            while (i < n && j < n) {
                System.out.print(mat[i][j] + " ");
                i++;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[][] mat = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    mat[i][j] = sc.nextInt();
                }
            }

            RightToLeftDia(mat, n);
        }
    }
}

