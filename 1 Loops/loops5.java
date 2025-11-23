/*
 * Multiplication Table
You are given an integer N.

You are required to write a program that generates the multiplication table of a given number N.

The program should read an integer N from the user and then output the multiplication table of N up to 20 times.

Input Format
single line consisting of an integer N.

Output Format
Print the Multiplication Table.

Example 1
Input


8

Output


8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
8 x 4 = 32
8 x 5 = 40
8 x 6 = 48
8 x 7 = 56
8 x 8 = 64
8 x 9 = 72
8 x 10 = 80
8 x 11 = 88
8 x 12 = 96
8 x 13 = 104
8 x 14 = 112
8 x 15 = 120
8 x 16 = 128
8 x 17 = 136
8 x 18 = 144
8 x 19 = 152
8 x 20 = 160


Explanation


output is Multiplication Table of 8


 */

 import java.util.*;
 public class loops5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        for(int i=1;i<=10;i++){
            System.out.println(n+" "+"x"+" "+i+" "+"="+i*n);
        }
    }
 }