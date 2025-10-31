/*Pangrams
A pangram is a string that contains every letter of the alphabet.
 Given a sentence determine whether it is a pangram in the English alphabet. 
 Ignore case. Return either pangram or not pangram as appropriate.

Input Format
The first line inputs a string, S.

Output Format
In a new line, print "pangram" if string contains every letter of the alphabet else "not pangram".

Example 1
Input

We promptly judged antique ivory buckles for the next prize
Output

pangram
Explanation All of the letters of the alphabet are present in the string.

Example 2
Input

We promptly judged antique ivory buckles for the prize
Output

not pangram
Explanation

The string lacks an x.

Constraints:
0 < length of s <= 1000\

Each character of s, s[i]∈{a-z,A-Z,space}

Topics
Strings - Basics
Arrays
Array - Basics
Hashing
Strings
Companies
Snapdeal */

import java.util.*;
public class strques3{

    public static void isPalgam(String str){
        str = str.toLowerCase();
        boolean arr [] = new boolean[26];
        int len = str.length();

        for(int i=0;i<len;i++){
            char ch = str.charAt(i);
            if(ch>='a' && ch<='z'){
               int idx = (int)(ch-'a');
               arr[idx] = true;
            }
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]==false){
                System.out.print("not pangram");
                return;
            }
        }
        System.out.print("pangram");

    }
    public static void main(String[] args) {
        try(Scanner sc =  new Scanner(System.in)){
            String str = sc.nextLine();
                isPalgam(str);
            }
        }
    }
