/*
 * Print Fibonacci Numbers
You've to print first n Fibonacci numbers. Take as input n, the count of Fibonacci numbers to print.

The Fibonacci Series is a series of numbers in which each number ( Fibonacci number ) is the sum of the two preceding numbers. The simplest is the series 0, 1, 1, 2, 3, 5, 8, etc.

Print first n Fibonacci numbers.

Input Format
The first line contains an integer n.

Output Format
Print first n Fibonacci numbers.

Example 1
Input

10
Output

0
1
1
2
3
5
8
13
21
34
Explanation

The first 10 terms of the Fibonacci sequence are printed above.

Example 2
Input

2
Output

0
1
Explanation

The first 2 terms of the Fibonacci sequence are printed above.

Constraints
1 ≤ N ≤ 40

Topics
Loops
Companies
Wipro
TCS
Accenture
Infosys
 */

import java.util.*;
public class loops21{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int a=0;
            int b=1;
            int c=0;
            if(n>=1){
                System.out.println(a);
            }
            if(n>=2){
                System.out.println(b);
            }
            for(int i=3;i<=n;i++){
                c=a+b;
                System.out.println(c);

                a=b;
                b=c;
            }
            }
        }
    }
