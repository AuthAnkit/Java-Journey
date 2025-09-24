/*Sum of upper and lower triangles
Given a square matrix of size n*n, print the sum of upper and lower triangular elements.

Upper Triangle consists of elements on the diagonal and above it.

Lower triangle consists of elements on the diagonal and below it.

Note

Diagonal here refers to the primary diagonal (starting at upper left corner and ending at bottom right corner).

Your task is to complete the function triangleSums which receives n and input matrix
 as parameters and prints the sum of upper and lower triangles separated by space.

Input Format
First line contains the value 'n'.

Next 'n' of each lines contain 'n' spaced integers.

Output Format
Print space separated sum of upper triangle followed by lower triangle.

Example 1
Input

3
1 2 3
1 5 3
4 5 6
Output

20 22
Explanation

Sum of lower triangle is 1+5+6+1+5+4 = 22 and upper triangle is 1+5+6+2+3+3 = 20

Example 2
Input

2
1 2
5 6
Output

9 12
Explanation

Sum of lower triangle is 1+6+5= 12 and upper triangle is 1+6+2 = 9

Constraints
1 <= n <= 10^3

1 <= mat[i][j] <=10^3

Topics
2D Arrays - Basics
2D-Arrays
Mat */

import java.util.*;
public class TDarr13 {

    public static void SumTri(int mat[][], int n){
        int sumA=0;
        int sumB=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    sumA+=mat[i][j];
                    sumB+=mat[i][j];
                }
                else if(i<j){
                    sumA+=mat[i][j];
                }
                else{
                    sumB+=mat[i][j];
                }
            }
        }
        System.out.print(sumA+" "+sumB);
    }   
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int mat[][] = new int[n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    mat[i][j]=sc.nextInt();
                }
            }
            SumTri(mat, n);
        }
    }
}