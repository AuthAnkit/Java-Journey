/*Toggle Characters
Given a string of length N, toggle the case of all the characters in the string, i.e.
 You should set all lowercase characters to uppercase and vice versa.

Please note that the string may contain numbers or special characters as well.

Input Format
The input consists of two lines.

The first line of the input contains one integer N, denoting the size of the string.

The second line of the input contains the string S.

Output Format
Your code should output the string S with its characters toggled.

Example 1
Input

8
helloABC
Output

HELLOabc
Explanation

All the lower case alphabets got converted into upper case and vice versa.

Example 2
Input

4
aBC1
Output

Abc1
Explanation

All the lower case alphabets got converted into upper case and vice versa.

Constraints
`1 <= N <= 2*10^5``

where n is the size of the string.

Topics
Strings - Basics
Strings */

import java.util.*;
public class strques2 {

    public static void ToggledString(int len ,String str){
            for(int i=0;i<len;i++){
                char ch = str.charAt(i);
                if(ch>='a' && ch<='z'){
                    ch=(char)(ch-32);
                }
                else if(ch>='A'&& ch<='Z'){
                    ch=(char)(ch+32);
                }
                System.out.print(ch);
            }
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int len = sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine();
            ToggledString(len, str);
        }
    }
}