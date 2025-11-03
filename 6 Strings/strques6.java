/*Palindrome String
Given a string str, determine if it is a palindrome,
 considering only alphabetic characters and ignoring the upper or lower case.
  Return 0 if it is not a palindrome, else return 1.

Input Format
Input consists of one line

The first line given is a string str.

Output Format
Returns 0 if it is not a palindrome, else return 1 if it is a palindrome

Example 1
Input

race a car
Output

0
Explanation

Not a palindrome

Example 2
Input

a man, a plan, a canal Panama
Output

1
Explanation

It is a palindrome.

Constraints
1 <= str.length <= 10000

Topics
Strings - Basics
Recursion
2-Pointers
Strings
Companies
Facebook
PayTM
Amazon
FactSet
Cisco
DE Shaw
Morgan Stanley
Zoho */

import java.util.*;
public class strques6 {
        public static int SmallAttachString(String str){
            String smol="";
            String rev="";
            for(int i=0;i<str.length();i++){
                char ch = str.charAt(i);
                if(ch>='A' && ch<='Z'){
                   ch=(char)(ch+32);
                     smol+=ch;
                }
                else if (ch>='a' && ch<='z')smol+=ch;
            }

            for(int i=smol.length()-1;i>=0;i--){
                rev+=smol.charAt(i);
            }
            if(rev.equals(smol)){
                return 1;
            }
            else{
                return 0;
            }
            

}

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            String str =  sc.nextLine();
            System.out.print(SmallAttachString(str));
        }
    }
}