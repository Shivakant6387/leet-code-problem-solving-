package org.example.leetcode;

public class RepeatedSubstringPattern459 {
    public static void main(String[] args) {
//        String s = "abab";
//        String s="aba";
        String s =
                "abcabcabcabc";
        System.out.println(repeatedSubstringPattern(s));
    }

    public static boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for (int i = n / 2; i >= 1; i--) {
            if (n % i == 0) {
                String subStr = s.substring(0, i);
                StringBuilder newStr = new StringBuilder();
                for (int j = 1; j <= n / i; j++)
                    newStr.append(subStr);
                if (newStr.toString().equals(s))
                    return true;
            }
        }
        return false;
    }
}
