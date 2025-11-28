/*Print the pattern
Using recursion, print the given pattern.

Input Format
First line contains integer n, representing rows of the given pattern

Output Format
Display the given pattern.

Example 1
Input

5

Output


* 
* * 
* * * 
* * * * 
* * * * * 


Explanation:

The number of rows given is 5.

Example 2
Input

3

Output


* 
* * 
* * * 

Explanation:

The number of rows given is 3.

Constraints
1 <= n <= 102

Topics
Recursion
Companies*/
import java.io.*;
import java.util.*;

class rec13
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
        solve(n);

    }

	static void solve(int n)
    {
          // Your code here
        if (n == 0)
        {
            return;
        }
        solve(n - 1);
        for (int i = 0; i < n; i++)
            System.out.print("*"+" ");

        System.out.println();
    }
}
