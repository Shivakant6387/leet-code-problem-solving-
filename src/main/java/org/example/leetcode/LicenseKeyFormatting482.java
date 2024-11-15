package org.example.leetcode;

public class LicenseKeyFormatting482 {
    public static void main(String[] args) {
        String s = "5F3Z-2e-9-w";
        int k = 4;
        System.out.println(licenseKeyFormatting(s, k));
    }

    public static String licenseKeyFormatting(String s, int k) {
        StringBuilder str = new StringBuilder(s.replaceAll("-", "").toUpperCase());
        StringBuilder result = new StringBuilder();
        str.reverse();
        int n = str.length();
        for (int i = 0; i < n; i = i + k) {
            if (i + k <= n)
                result.append(str.substring(i, i + k));
            else
                result.append(str.substring(i));
            if (i + k < n)
                result.append("-");
        }
        return result.reverse().toString();
    }
}
