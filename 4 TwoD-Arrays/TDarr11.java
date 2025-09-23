/*Spirally traversing a matrix
Given a matrix of size r*c, where r is number of rows and c is number of columns. Traverse the matrix in spiral form.

Input Format
Input consists of two lines

The first line contains two integers r and c which denotes number of rows and columns respectively.

The next r lines contains c spaced integers, which are the elements of the matrix.

Output Format
Print the spiral matrix.

Example 1
Input

4 4
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
Output

1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
Explanation:

We iterate spirally and print each element.

Example 2
Input

3 4  
1 2 3 4
5 6 7 8
9 10 11 12
Output

1 2 3 4 8 12 11 10 9 5 6 7
Explanation:

We iterate spirally and print each element.

Constraints
1 <= r, c <= 100

0 <= matrix[i][j] <= 100

Topics
2D Arrays - Basics
2D-Arrays
Companies
PayTM
Adobe
MAQ Software
Oyo Rooms
Flipkart
Snapdeal
MakeMyTrip
Nagarro
DE Shaw
Microsoft
Morgan Stanley
Salesforce */

import java.util.*;
public class TDarr11 {

    public static void SpiTra(int mat[][], int r , int c){
        int sr=0;
        int sc=0;
        int er = r-1;
        int ec = c-1;
        while(sr<=sc && er<=ec){
            for(int i=sc;i<=ec;i++){
                System.out.print(mat[sr][i]+" ");
            }
            sr++;
            for(int i=sr;i<=er;i++){
                System.out.print(mat[i][ec]+" ");
            }
            ec--;
            if(sr<er){
                for(int i=ec;i>=sc;i--){
                    System.out.print(mat[er][i]+" ");
                }
                er--;
            }
            if(sc<ec){
                for(int i=er;i<=sr;i++){
                    System.out.print(mat[i][sc]+" ");
                }
                sc++;
            }
        }


    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        int r = sc.nextInt();
        int c = sc.nextInt();
        int mat[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        SpiTra(mat, r, c);
        }

    }
}