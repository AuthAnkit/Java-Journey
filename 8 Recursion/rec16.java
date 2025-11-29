/*Find Number of Digits
Given the number n, find out and return the number of digits present in a number recursively.

Input Format
Input consists of single line which has the integer n.

Output Format
Return the number of digits present in n.

Example 1
Input

1256
Output

4
Example 2
Input

12345
Output

5
Constraints
1 <= n <= 10^9

Topics
Recursion
Companies
Oracle*/

import java.util.*;

public class rec16 {
	static int numOfDigi(int n) {
        //Write code here
        if(n<10)return 1;
        return 1 + numOfDigi(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int result = numOfDigi(n);
        System.out.println(result);
        sc.close();
    }
}
