package org.example.leetcode;

public class NimGame292 {
    public static void main(String[] args) {
        int num = 4;
        boolean nim = canWinNim(num);
        System.out.println(nim);
    }

    public static boolean canWinNim(int n) {
        return n % 4 != 0;
    }
}
