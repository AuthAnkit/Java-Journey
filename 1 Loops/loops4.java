/*
Print N-1 to 0
You are given an integer N.

You are required to write a program that prints numbers from N-1 to 0

where N is a positive integer provided by the user.

Input Format
single line consisting of an integer N.

Output Format
Print numbers from N-1 to 0.

Example 1
Input


5

Output


4 3 2 1 0
 */

import java.util.*;
public class loops4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for(int i =n-1;i>=0;i--){
                System.out.print(i+" ");
            
        }
        sc.close();
    }
}