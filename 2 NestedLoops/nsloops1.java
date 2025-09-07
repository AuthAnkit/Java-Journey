/*
 * Print Asterisk pattern
You are given an integer N.

The task is to print a series of asterisk(*) from 1 till N terms with increasing order and difference being 1.

Input Format
single line consisting of an integer N.

Output Format
Print the required pattern.

Example 1
Input


3

Output


* ** ***

Explanation


First, print 1 asterisk then space after
that print 2 asterisk and space after that 
print 3 asterisk now stop as N is 3.

Example 2
Input


5

Output


* ** *** **** ***** 

Explanation


First, print 1 asterisk then space after
that print 2 asterisk and space and do this
3 more times.

Constraints
1 <= N <= 100
Topics
 */
import java.util.*;
public class nsloops1{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.print(" ");
        }
    }
    }

}
