/*Recursively Print Numbers
Write a recursive program to print all numbers starting from 1 till N. The sequence should be 1 2 3 ... N.

Input Format
Input consists of a single integer N

Output Format
Print the numbers between 1 and N in ascending order, each separated by a single space.

Example 1
Input

5
Output

1 2 3 4 5
Example 2
Input

10
Output

1 2 3 4 5 6 7 8 9 10
Constraints
1 <= N <= 1000

Topics
Recursion */


import java.util.*;

public class rec1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
		printtillN(n);
        
    }

	public static void printtillN(int n) {
		//write your code
        if(n==0)return;
         printtillN(n-1);
        System.out.print(n+" ");
    }
}