/*
 * All substrings of a string
Given a string str, print all possible non-empty substrings of str, 
in order of occurrence in the string.

Input Format
Input consists of a single line of string.

Output Format
Print all the substrings of a string in order of occurrence in the string in different lines.

Example 1
Input

abc
Output

a
ab
abc
b
bc
c
Explanation:

These are the possible non-empty substrings.

Example 2
Input

abcd
Output

a
ab
abc
abcd
b
bc
bcd
c
cd
d
Explanation:

These are the possible non-empty substrings.

Constraints
0 <= str.length() <= 280

Topics
Loops
Strings - Basics
Strings
Companies
Amazon
 */


//  Way 1

// import java.util.*;
// public class strques5{
//     public static void SubOfString(String str){
//         for(int i=0;i<str.length();i++){
//             for(int j=i+1;j<=str.length();j++){
//                 System.out.println(str.substring(i,j));
//             }
//         }
//     }
//     public static void main(String[] args) {
//         try(Scanner sc = new Scanner(System.in)){
//             String str =  sc.nextLine();
//             SubOfString(str);
//         }
//     }

// }


//  Way 2

import java.util.*;
public class strques5{
    public static void SubOfString(String str){
        for(int i=0;i<str.length();i++){
            String NewSub =""; 
            for(int j=i;j<str.length();j++){
                NewSub+=str.charAt(j);
                System.out.println(NewSub);
            }
        }
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            String str = sc.nextLine();
            SubOfString(str);
        }
    }
}
