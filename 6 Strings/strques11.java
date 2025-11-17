/*
 * Shuffle String
Given a string s and an integer array indices of the same length.

The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.

Print the shuffled string.

Input Format
Input consists of two lines.

First line contains an integer n.

Second line contains the string.

Last line contains the indices separated by space.

Output Format
Print the shuffled string.

Example 1
Input

8
acciojob
4 5 6 7 0 2 1 3
Output

ojobacci
Explanation

As the problem states "acciojob" becomes "oojbacci" after shuffling.

Example 2
Input

3
abc
0 1 2
Output

abc
Explanation

No shuffling is done here.

Constraints
1 <= n <= 500

Topics
Strings - Basics
Arrays
Array - Basics
Strings
 */
import java.util.*;
public class strques11 {
    public static void ShuffledStr(int len , String str , int arr[]){
      char res[] = new char[len];
        for(int i=0;i<len;i++){
            res[arr[i]]=str.charAt(i);
        }
        System.out.print(new String(res));
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int len = sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine();
            int [] arr = new int[len];
            for(int i=0;i<len;i++){
                arr[i]=sc.nextInt();
            }
            ShuffledStr(len, str, arr);
        }
    }
}