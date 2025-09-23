/*Spiral Matrix 2
You are given a matrix with N rows and M columns. You have to start iterating downwards on the first column and then continue spirally.
 Print an array containing the spiral of the matrix in the said manner.

NOTE: You need to complete the given function. The input and printing of output will be handled by the driver code.

Input Format:
The first line contains t: the number of test cases.

For each test case: The first line contains N and M.

The next N lines contain M integers each representing the elements of the matrix.

Output Format:
Print an array containing the spiral of the matrix in the said manner.

Example 1:
Input:

1
3 3
1 4 7
2 5 8
3 6 9
Output:

1 2 3 6 9 8 7 4 5
Explanation:

We iterate spirally and print each element.

Example 2:
Input:

1
3 3
1 2 3
4 5 6
7 8 9
Output:

1 4 7 8 9 6 3 2 5
Explanation:

We iterate spirally and print each element.

Constraints:
1 <= T <= 10

1 <= N,M <= 200

0 <= A[i] <=1000000

Topics
2D Arrays - Basics
2D-Arrays */

import java.util.*;
public class TDarr12 {
    public static void SpiralMatTrav(int mat[][] , int n , int m){
        int sr =0;
        int sc =0;
        int er=n-1;
        int ec = m-1;
        while(sr<=er && sc<=ec){
            for(int i=sr;i<=ec;i++){
                System.out.print(mat[i][sc]+" ");
            }
            sc++;
            for(int i=sc;i<=er;i++){
                System.out.print(mat[er][i]+" ");
            }
            er--;
            if(sr<er){
                for(int i=er;i>=sr;i--){
                    System.out.print(mat[i][ec]+" ");
                }
                ec--;
            }
            if(sc<ec){
                for(int i=ec;i<=sc;i--){
                    System.out.print(mat[sr][i]+" ");
                }
                sr++;
            }
        }
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int mat[][] = new int[n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    mat[i][j]=sc.nextInt();
                }
            }
            SpiralMatTrav(mat, n, m);
        }
    }
}
