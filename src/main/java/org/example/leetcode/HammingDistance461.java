package org.example.leetcode;

public class HammingDistance461 {
    public static void main(String[] args) {
        int x = 1;
        int y = 4;
        System.out.println(hammingDistance(x, y));
    }

    public static int hammingDistance(int x, int y) {
        int result = x ^ y;
        int count = 0;
        while (result > 0) {
            count += result & 1;
            result >>= 1;
        }
        return count;
    }
}
