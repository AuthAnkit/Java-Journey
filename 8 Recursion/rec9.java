/*Sum of natural numbers
Write a recursive program to find out the sum of all natural numbers till N. Take input of N from the user and make a recursive function that returns the sum of all the natural numbers upto N.

Input Format
First line is an integer N

Output Format
Print the sum of first N natural numbers.

Example 1
Input

5
Output

15
Explanation

Here, n = 5, so 1 + 2 + 3 + 4 + 5 = 15

Example 2
Input

1
Output

1
Explanation

Here n = 1, so 1 = 1

Constraints
1 <= N < = 10^3

Topics
Recursion
Math*/


import java.util.*;

public class rec9{
	static long NumberSum(long N) {
        //Write your code here
        if(N==0) return N;
        return N + NumberSum(N-1);

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        System.out.println(NumberSum(N));
    }
}
