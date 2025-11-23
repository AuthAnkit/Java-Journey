/*Ultra Fast Mathematician
Bob is given 2 numbers a and b, each of them contains only 0 and 1. Your task is to find a number c, such that if the ith digit of number a and b differ then the ith digit of c is 1, 0 in rest of the cases.

Input Format
The first line of input contains a number a.

The second line of input contains a number b.

Output Format
You need to find such a number c, such that if the ith character of a and b are different then the ith position of string c is 1, else 0 in any other case.

Example 1
Input

000
111
Output

111
Explanation

As the both the numbers have different digits in the ith position so the number c is 111.

Example 2
Input

01110
01100
Output

00010
Explanation

only the number at 4th position differs, so the number c has 4th digit as 1.

Constraints
1 <= a,b <= 10100

a,b - {0,1}

Topics
Strings
*/

import java.util.*;
  
public class SB3{
  
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String A=scn.nextLine();
        String B=scn.nextLine();
        StringBuilder a= new StringBuilder(A);
        StringBuilder b= new StringBuilder(B);
        StringBuilder c=solve(a,b);
        System.out.println(c);
    }
    static StringBuilder solve(StringBuilder a, StringBuilder b)
    {
        // your code here
        int s=a.length();
        StringBuilder c=new StringBuilder();
        for(int i=0;i<s;i++)
        {
            char a1=a.charAt(i);
            char b1=b.charAt(i);
            if(a1==b1)
            c.append('0');
            else
            c.append('1');
        }
        return c;
        
    }

    
}

