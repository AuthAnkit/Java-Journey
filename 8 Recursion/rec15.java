/*Nth Even Fibonacci Number
Given a positive integer N, find the Nth Even Fibonacci number.

Fibonacci Series is a series of numbers in which each number ( Fibonacci number ) is the sum of the two preceding numbers. The simplest is the series 1, 1, 2, 3, 5, 8, etc.

Note:

Since the answer could be very large, use long datatype in JAVA to store the answer. Similarly, use long long in C++.

Return the answer in modulo 109 + 7

Input Format
First line contains the positive integer N.

Output Format
Return the required number.

Example 1
Input

1
Output

2
Explanation

2 is the first even number in the Fibonacci series. (1 1 "2" 3 ....)

Example 2

Input

2
Output

8
Explanation

8 is the second even number in the fibonacci series. (1 1 2 3 5 "8")

Constraints

1 <= n <= 20*/

import java.util.*;
import static java.lang.Math.ceil;

public class rec15 {
    static long Fibo(long fu){
        if(fu ==1)return 0;
        if(fu ==2)return 1;
        return Fibo(fu-1)+(fu-1);

    }

	static long NthEvenFibonacci(long n) {
        if (n < 1)
            return n;
        if (n == 1)
            return 2;
        return ((4 * NthEvenFibonacci(n-1))%1000000007 + NthEvenFibonacci(n-2)%1000000007)%1000000007;
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(NthEvenFibonacci(n));
    }
}
