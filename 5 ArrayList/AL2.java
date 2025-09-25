/*Pascal's Triangle
You are given a number n, you are required to print the first n rows of the pascal triangle.

Pascal Triangle

Your task is to complete the function pascalTriangle which receives n as the parameters and returns a 2D array containing the first n rows of the pascal's triangle.

Input Format
You are given a single integer n representing the number of rows of pascal's triangle.

Output Format
Print n lines of output, where ith line represents the ith row of the triangle.

Example 1
Input

3
Output

1
1 1
1 2 1
Example 2
Input

5
Output

1
1 1
1 2 1
1 3 3 1
1 4 6 4 1   
Constraints:
1<= n <= 30

Topics
Math
Companies
Samsung
Amazon
Goldman Sachs
Twitter
Bloomberg
Adobe
VMware
Apple
Uber
Google
Microsoft
Yahoo */

import java.util.*;
public class AL2 {

    public static List<List<Integer>> Pascal(int n){
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer> row = new  ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || i==j){
                    row.add(1);
                }
                else{
                    row.add(ans.get(i-1).get(j-1)+ans.get(i-1).get(j));
                }
            }
            ans.add(row);
        }
        return  ans;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        int n = sc.nextInt();
        List<List<Integer>> triangle = Pascal(n);

        // Print each row
        for (List<Integer> row : triangle) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
}