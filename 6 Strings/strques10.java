import java.util.*;

public class strques10 {
    public static void OldToNew(String str, int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }

    // Check if substring is palindrome
    public static boolean isPalindrome(String str, int start, int end) {
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void DistinctCharacters(String str) {
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                if (isPalindrome(str, i, j)) {
                    String sub = str.substring(i, j + 1);
                    if (!list.contains(sub)) {  // avoid duplicates
                        list.add(sub);
                    }
                }
            }
        }

        // Sort in lexicographical order
        Collections.sort(list);

        // Print
        for (String s : list) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            DistinctCharacters(str);
        }
    }
}
