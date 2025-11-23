/*
 Print N to 1
You are given an integer N.

You are required to write a program that prints numbers from N to 1

where N is a positive integer provided by the user.

Input Format
single line consisting of an integer N.

Output Format
Print numbers from N to 1.

Example 1
Input


5

Output


5 4 3 2 1 

Explanation


Print numbers from 5 to 1.

Example 2
Input


8

Output


8 7 6 5 4 3 2 1 

Explanation


Print numbers from 8 to 1
 */
import java.util.*;
public class loops3 {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
        int n = sc.nextInt();
        for(int i=n;i>0;i--){
            System.out.print(i+" ");
        }
    }
}
}
