/*Ptice
Adrian, Bruno and Goran wanted to join the bird lovers’ club. 
However, they did not know that all applicants must pass an entrance exam. 
The exam consists of n questions, each with three possible answers: A, B and C.

Unfortunately, they couldn’t tell a bird from a whale so they are trying to guess the correct answers.
 Each of the three boys has a theory of what set of answers will work best:

Adrian claims that the best sequence is: A, B, C, A, B, C, A, B, C, A, B, C ...

Bruno is convinced that this is better: B, A, B, C, B, A, B, C, B, A, B, C ...

Goran laughs at them and will use this sequence: C, C, A, A, B, B, C, C, A, A, B, B ...

Write a program that, given the correct answers to the exam, determines who of the three was right – whose sequence contains the most correct answers.

Input Format
First line contains an integer n denoting number of questions.

Second line contains a string of n letters ‘A’, ‘B’ and ‘C’. These are, in order, the correct answers to the questions in the exam.

Last line contains the indices separated by space.

Output Format
On the first line, output m, the largest number of correct answers one of the three boys gets.

After that, output the names of the boys (in alphabetical order) whose sequences result in m correct answers.

Example 1
Input

5
BAACC
Output

3
Bruno
Explanation

Here only Bruno has most correct answers i.e. 3.

Example 2
Input

9
AAAABBBBB
Output

4
Adrian
Bruno
Goran
Explanation

Here all 3 have 4 correct answers.

Constraints
1 <= n <= 100

Topics
Strings - Basics
Strings */

import java.util.*;
public class strques14 {
public static void FullMarks(int len , String ans){
        String a ="ABC";
        String b = "BABC";
        String c  = "CCAABB";
        int AdrianSrc=0 , BrunoSrc=0 , GoranSrc =0;

        for(int i=0;i<len;i++){
            if(ans.charAt(i)==a.charAt(i%3)) AdrianSrc++;
            if(ans.charAt(i)==b.charAt(i%4)) BrunoSrc++;
            if(ans.charAt(i)==c.charAt(i%6)) GoranSrc++;
        }

        int maxans = Math.max(GoranSrc, Math.max(AdrianSrc, BrunoSrc));
        System.out.println(maxans);

        if(maxans==AdrianSrc) System.out.print("Adrian");
        else if (maxans==BrunoSrc) System.out.print("Bruno");
        else if (maxans==GoranSrc)  System.out.print("Goran");


}

public static void main(String[] args) {
    try(Scanner sc = new Scanner(System.in)){
        int len = sc.nextInt();
        sc.nextLine();
        String ans = sc.nextLine();
        FullMarks(len, ans);

    }
}
    
}
