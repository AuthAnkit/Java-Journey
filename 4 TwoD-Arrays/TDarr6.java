/*Find The Way
You are given a binary matrix of dimensions m*n. A mouse enters the 
matrix at cell (0,0) in left to right direction.

He goes in the same direction if he encounters a 0 and he takes a right
 turn when he encounters a 1, and changes that specific 1 to 0. Otherwise he may get stuck in a cycle!

You have to find the co-ordinates from where this mouse will exit the matrix.

Input Format
First line contains the values m and n.

Next m lines contain n spaced integers.

Output Format
Return the co-ordinates from where this mouse will exit the matrix separated by space.

Example 1
Input

1 2
0 0
Output

0 1
Explanation

The mouse will enter at (0,0) and keep going ahead and come out of (0,1).

Example 2
Input

3 3
0 1 0
0 1 0
1 0 1
Output

1 0
Explanation

We enter the matrix at (0,0) we move to (0,1) and encounter a 1 so we
 change it to 0 and move right to (1,1), we again encounter 1 and turn right.

Then we leave the matrix from (1,0). Thus the output is 1 0.

Constraints
1 <= m,n <= 100

matrix[i][j] is 0, 1

Topics
2D Arrays - Basics
2D-Arrays */

import java.util.*;
public class TDarr6{
    public static int[] FIndTheWay(int mat[][], int n, int m){
         n = mat.length;
         m= mat[0].length;
        int dir =0 ;
        int arr[][]={{0,1},{1,0},{0,-1},{-1,0}};
        int i=0,j=0;
        int ans[]=new int[2];

        while(i<n && j<m && i>=0 && j>=0){
            if(mat[i][j]==1){
                mat[i][j]=0;
                if(dir==0){
                    dir=1;
                }
                else if(dir==1){
                    dir=2;
                }
                else if(dir==2){
                    dir=3;
                }
                else{
                    dir=0;
                }
            }
                ans[0]=i;
                ans[1]=j;

                i=i+arr[dir][0];
                j=j+arr[dir][1];
            }
            return ans;
        }
    
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int mat[][]= new int[n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    mat[i][j]=sc.nextInt();
                            
                }
            }
            System.out.println(Arrays.toString(FIndTheWay(mat,n,m)));
        }
    }
}