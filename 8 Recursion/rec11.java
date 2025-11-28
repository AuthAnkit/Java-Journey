/*Recursive Multiplication
You are given two integers N and M. Calculate and return their multiplication using recursion.

You can only use subtraction and addition for your calculation. No other operators are allowed.

Note

Complete the given function. The input would be handled by the driver code. You only have to print the answer.

Input Format
The first line contains N.

The second line contains M.

Output Format
Print the product.

Example 1
Input

10
13
Output

130
Explanation

10 * 13 = 130

Example 2
Input

5
4
Output

20
Explanation

5 * 4 = 20.

Constraints
1 <= N, M <= 10000

Topics
Recursion
Matha*/

import java.io.*;
import java.util.*;
public class rec11 {
  
  public static int multiply(int n, int m) {
    if (n < m)
      return multiply(m, n);
    else if (m != 0)
      return (n + multiply(n, m - 1));
    else
      return 0;
  }
  
  public static void multiplyRecursively(int n, int m) {
    System.out.println(multiply(n,m));
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();
    multiplyRecursively(n, m);
  }
}
