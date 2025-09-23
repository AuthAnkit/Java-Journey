/*Maxima Minima
Given an n*n matrix mat find an element such that it is the smallest in a row and largest in a column,
 if such an element does not exist return -1.

Input Format
First line contains the values n.

Next n lines contain n spaced integers.

Output Format
Return the element that is smallest in a row and largest in a column if not found return -1.

Example 1
Input

2
1 3
6 5
Output

5
Explanation

Row 2 contains minimum element 5 that is largest in the 2nd column.

Example 2
Input

3
1 2 3
4 5 6
7 8 9
Output

7
Explanation

Here the minimum value is 7 in the third row and the largest value in the 1st column.

Constraints
1 <= n <= 10^3

1 <= mat[i][j] <=10^5

Topics
2D Arrays - Basics
2D-Arrays */
import java.util.*;
public class TDarr9 {
    public static int MaximaMinima(int mat[][]){
        int n = mat.length;
        for(int i=0;i<n;i++){
            int smallest = mat[i][0] , columnidx =0;
            for(int j=1;j<n;j++){
                if(smallest>mat[i][j]){
                    smallest = mat[i][j];
                    columnidx = j;
                }
            }
            int k;
            for(k =0;k<n;k++){
                if(mat[k][columnidx]>smallest){
                    break;
                }
            }
            if(k==n){
                    return smallest;
                }
        }
        return -1;
        
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int mat[][]= new int[n][n];
            for(int i =0;i<n;i++){
                for(int j=0;j<n;j++){
                    mat[i][j]=sc.nextInt();
                }
            }
            System.out.print(MaximaMinima(mat));
        }
    }
    
}