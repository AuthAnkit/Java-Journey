/*
Print 0 to N-1
You are given an integer N.

You are required to write a program that prints numbers from 0 to N-1

where N is a positive integer provided by the user.

Input Format
single line consisting of an integer N.

Output Format
Print numbers in the range [0 , N-1].

Example 1
Input


10

Output


0 1 2 3 4 5 6 7 8 9

Explanation


Print numbers from 0 to 9.

Example 2
Input


8

Output


0 1 2 3 4 5 6 7
 */

import java.util.*;
public class loops2{
    
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print(i+" ");
        }
        }
    }
}
