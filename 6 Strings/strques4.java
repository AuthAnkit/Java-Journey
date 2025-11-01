/*
 Camel Case
You are given a string consisting of different words separated by underscores _.
 You have to convert the string to camel case. 
 The first letter of the entire case should be lowercase.

eg: app_dsd_sdda to appDsdSdda

Input Format
The first line contains the number of test cases.

For each test case: The first line contains the string S.

Output Format
For each test case print the final formed string in a new line.

Example 1
Input:

1
abb_b_cc_d
Output:

abbBCcD
Explanation:

We remove the underscores and convert the next character to uppercase.

Example 2
Input:

1
how_are_you
Output:

howAreYou

Explanation:

We remove the underscores and convert the next character to uppercase.

Constraints
1 <= T <= 10

1 <= |S| <= 100000

Topics
Strings - Basics
String
 */

import java.util.*;
public class strques4 {
    public static void CamelCase(String str){
        int len = str.length();
        str=str.toLowerCase();
        for(int i=0;i<len;i++){
            char ch = str.charAt(i);
            if(ch=='_') continue;

            if(i>0 && str.charAt(i-1)=='_'){
                ch=(char)(ch-32);
                System.out.print(ch);
            }
             else{
                System.out.print(ch);
             }
            
        }
    }

    public static void main(String[] args) {
        try(Scanner sc =  new Scanner(System.in)){
            String str = sc.nextLine();
            CamelCase(str);
        }
    }
    
}