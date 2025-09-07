/*
 * Rectangle Pattern
You are given two integers N and M.

You are required to write a program that prints a Rectangle of size N * M.


Pattern for N = 3 and M = 5

* * * * * 
* * * * * 
* * * * * 

Input Format
single line consisting of two integers N and M.

Output Format
Print the required pattern

Example 1
Input


3 5

Output


* * * * * 
* * * * * 
* * * * * 

Explanation


Pattern for N = 3 and M = 5

Example 2
Input


4 2

Output


* * 
* * 
* * 
* * 
 

Explanation


Pattern for N = 4 and M = 2

Constraints
1 <= N , M <= 100
Topics
 */

import java.util.*;
public class nsloops2 {
public static void main(String[] args) {
    try(Scanner sc  = new Scanner(System.in)){
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i=1;i<=n;i++){
        for (int j = 1; j <= m; j++) {
            System.out.print("*"+" ");
        }
        System.out.println();
    }
    }
}
    
}
