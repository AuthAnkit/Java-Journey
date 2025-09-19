/*
 * Matrix 90 Degree Rotation
You are given a n x n 2-D matrix representing an image. Your task is to rotate the image by 90 degrees 
in the clockwise direction.

Input Format
The first line will contain two integers n and n again.

The next n lines contain n integers each representing the matrix.

Output Format
Print a matrix that is rotated by 90 degrees in the clockwise direction.

Example 1
Input

2 2 
1 2
2 3 
Output

2 1 
3 2
Explanation

We do a 90 degree clockwise rotation of the matrix.

Example 2
Input

3 3
7  2  3 
2  3  4 
5  6  1 
Output

5 2 7
6 3 2
1 4 3
Explanation

We do a 90 degree clockwise rotation of the matrix.

Constraints
1 <= n <= 100

Topics
Basics
2D-Arrays
Companies
ServiceNow
Facebook
ByteDance
PayTM
Amazon
Bloomberg
Oracle
Adobe
Cisco
Quora
VMware
Apple
Databricks
Uber
Google
Microsoft
eBay
Nvidia
 */
import java.util.*;
public class TDarr5{
    public static void RotArr(int matrix[][] , int n){
        //first we will transpose the matrix
        //then we will reverse all the rows
            for(int row=0;row<n;row++){
                for(int col=row+1;col<n;col++){
                    int temp = matrix[row][col];
                    matrix[row][col]=matrix[col][row];
                    matrix[col][row]=temp;
                }
            }
            
                for(int i=0;i<n;i++){
                    int li =0;
                    int ri = n-1;
                    while(li<ri){
                        int temp = matrix[i][li];
                        matrix[i][li]=matrix[i][ri];
                        matrix[i][ri]=temp;
                        li++;
                        ri--;
                    }
                }
            
            
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(matrix[i][j]+" ");
                }
                System.out.println();
            }
    }
 public static void main(String[] args) {
    try(Scanner sc = new Scanner(System.in)){
        int n = sc.nextInt();
        int matrix[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        RotArr(matrix, n);
    }
 }
}