/*ASCII string
You are given a string str that contains only lowercase alphabets.

You have to form a string that contains the difference of ASCII values of every two consecutive characters between those characters.

Note Complete the given function. The input and output would be handled by the driver code.

Input Format
The only line contains the string str.

Output Format
Print the new string.

Example 1
Input

abecd
Output

a1b3e-2c1d
Explanation

'b' - 'a' = 1
'e' - 'b' = 3
'c' - 'e' = -2
'd' - 'c' = 1
Example 2
Input

abc
Output

a1b1c
Explanation

'b' - 'a' = 1
'c' - 'b' = 1
Constraints
1 <= |str| <= 1000

Topics
Strings */

import java.io.*;
import java.util.*;
public class SB1 {
  
  public static String solution(String str) {
    StringBuilder sb = new StringBuilder();
    sb.append(str.charAt(0));
    for (int i = 1; i < str.length(); i++) {
      char curr = str.charAt(i);
      char prev = str.charAt(i - 1);
      int gap = curr - prev;
      sb.append(gap);
      sb.append(curr);
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    System.out.println(solution(str));
  }
}
