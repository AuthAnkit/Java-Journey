/*Word from Keyboard
You are given array of strings, you need to print words from that array which can be typed using only one row of Keyboard.

First row of keyboard = "qwertyuiop"

Second row of keyboard = "asdfghjkl"

Third row of keyboard = "zxcvbnm"

KeyBoard
Input Format
First line contains n number of strings in array

Next n lines contains strings denoting elements of array

Output Format
Print strings which can be formed using single row of keyboard in separate lines

Example 1
Input

2
glad
monkey
Output

glad
Explanation

glad can be formed only from the characters present in row 2

Example 2
Input

3
horse
peter
jass
Output

peter
jass
CONSTRAINTS
1 <= n <= 1000

1 <= |s| <= 100

Each string consist of lowercase english letter only.

Topics
Strings - Basics
Strings
Companies
Facebook
Amazon
Airbnb
Bloomberg
Apple
Google
Salesforce */

import java.io.IOException;
import java.util.*;
public class strques17{
    static int[] charRow = new int[]{2, 3, 3, 2, 1, 2, 2, 2, 1, 2, 2, 2, 3, 3, 1, 1, 1, 1, 2, 1, 1, 3, 1, 3, 1, 3};
    
    static ArrayList<String> getStrings(ArrayList<String> arr)
    {
        ArrayList<String> result = new ArrayList<String>();
        for(int i = 0; i < arr.size(); i++){
            String cur = arr.get(i);
            Set<Integer> temp = new HashSet<Integer>();
            int len = cur.length();
            for(int j = 0; j < len; j++)
                temp.add(charRow[cur.charAt(j) - 'a']);
            if(temp.size() == 1) result.add(cur);
        }

        return result;
    }

    public static void main(String args[]) throws IOException {
        try(
        Scanner sc = new Scanner(System.in);){
    
        int n = sc.nextInt();
        ArrayList<String> arr = new ArrayList<String>();
        for(int i = 0; i < n; i++){
            String s = sc.next();
            arr.add(s);
        }

        ArrayList<String> result = getStrings(arr);
        for(int i = 0; i < result.size(); i++){
            System.out.println(result.get(i));
        }
    }
    }
}