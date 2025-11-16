/*
 * Good Strings
You are given a set 'S' of distinct characters. You are also given an array 'A' of 'N' strings.

A String in array 'A' is called good if all the characters of the string is present in the set 'S'.

You have to find how many strings in the array 'A' are good.

Input Format
The first line contains the number of test cases.

For each test case: The first line contains a string denoting the characters of the set 'S'.

The next line contains 'N', the number of strings in 'A'.

The next 'N' lines contains a string each, which are the elements of the array 'A'.

Output Format
For each test case print the count of good strings in a new line.

Example 1
Input:

1
abc
4
ab
abd
cacb
cabef
Output:

2
Explanation:

Only 'ab' and 'cacb' are good strings. Rest of the strings contain characters apart from 'abc'.

Example 2
Input:

1
pq
3
pqqqpp
abc
rst
Output:

1
Explanation:

Only 'pqqqpp' is a good string.

Constraints
1 <= T <= 10

1 <= |S| <= 26

1 <= N <= 1000

1 <= |A[i]| <= 1000

Topics
Strings - Basics
Arrays
Array - Basics
Stringss
 */



import java.util.*;

public class strques8 {
    public static int NumGoodString(String allowed, String[] arr, int len) {
        boolean[] present = new boolean[26];

        // mark allowed characters
        for (int i = 0; i < allowed.length(); i++) {
            present[allowed.charAt(i) - 'a'] = true;
        }

        int goodCount = 0;

        for (int i = 0; i < len; i++) {
            String word = arr[i];
            boolean isGood = true;

            for (int j = 0; j < word.length(); j++) {
                char c = word.charAt(j);
                if (!present[c - 'a']) {
                    isGood = false;
                    break;
                }
            }

            if (isGood) {
                goodCount++;
            }
        }

        return goodCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  // number of test cases
        sc.nextLine(); // consume newline

        while (T-- > 0) {
            String allowed = sc.nextLine().trim();
            int len = sc.nextInt();
            sc.nextLine(); // consume newline

            String[] arr = new String[len];
            for (int i = 0; i < len; i++) {
                arr[i] = sc.nextLine().trim();
            }

            System.out.println(NumGoodString(allowed, arr, len));
        }
        sc.close();
    }
}
