/*
 * Transpose of Matrix
Write a program to find the transpose of a square matrix of size N*N.
 Transpose of a matrix is obtained by changing rows to columns and columns to rows.

Expected Time Complexity: O(N * N)

Expected Space Complexity: Inplace

Input Format
The first line contains an integer N.

The next N lines contains N spaced integers each, elements of matrix.

Output Format
Print the transposed matrix.

Example 1
Input

4
1 1 1 1
2 2 2 2
3 3 3 3
4 4 4 4
Output

1 2 3 4
1 2 3 4
1 2 3 4
1 2 3 4
Explanation

The rows and columns are switched.
Example 2
Input

5
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15 
16 17 18 19 20
21 22 23 24 25
Output

1 6 11 16 21
2 7 12 17 22
3 8 13 18 23
4 9 14 19 24
5 10 15 20 25
Explanation

The rows and columns are switched. For example: 6 was at position 0, 1 in original matrix.
 In the transposed matrix, it is at position 1, 0.
Constraints
1 <= N <= 100

-10^3 <= mat[i][j] <= 10^3

Topics
2D Arrays - Basics
2D-Arrays
Companies
Amazon
MakeMyTrip
Walmart Global Tech
InfoEdge
 */
import java.util.*;
public class TDarr4 {

    public static void Travel(int mat[][] , int n){
        for(int row=0;row<n;row++){
            for(int col=row+1;col<n;col++){
                int temp = mat[row][col];
                mat[row][col]=mat[col][row];
                mat[col][row]=temp;
            }
        }
        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                System.out.print(mat[row][col]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int ans[][] = new int[n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    ans[i][j]=sc.nextInt();
                }
            }
            Travel(ans, n);
        }
    }
}