/*Boundary Traversal of matrix
Given an m*n matrix, print the boundary traversal of the matrix in clockwise order.

Input Format
First line contains the values m and n.

Next m lines contain n-spaced integers.

Output Format
Print the boundary traversal of the matrix in clockwise order.

Example 1
Input

2 3
1 2 3
1 5 3
Output

1 2 3 3 5 1
Explanation

We can see that while traversing in a clockwise fashion we go in the order of 1, 2, 3, 3, 5, 1.

Example 2
Input

3 4
5 4 6 3
1 4 3 5
5 1 9 6
Output

5 4 6 3 5 6 9 1 5 1
Explanation

We can see that while traversing in a clockwise fashion we go in the order of 5, 4, 6, 3, 5, 6, 9, 1, 5, 1.

Constraints
1 <= n <= 10^3

1 <= m <= 10^3

1 <= mat[i][j] <=10^5

Topics
2D Arrays - Basics
2D-Arrays
Companies
Amazon
 */

import java.util.*;
public class TDarr10 {

    public static void TraversalBoundry(int mat[][] , int n , int m){
        for(int i=0;i<m;i++){
            System.out.print(mat[0][i]+" ");
        }
        for(int i=1;i<n;i++){
            System.out.print(mat[i][m-1]+" ");
        }
        for(int i=m-2;i>=0;i--){
            System.out.print(mat[n-1][i]+" ");
        }
        for(int i=n-2;i>0;i--){
            System.out.print(mat[i][0]+" ");
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
            TraversalBoundry(mat, n, m);
        }
    }
}