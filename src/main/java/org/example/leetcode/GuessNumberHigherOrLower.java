package org.example.leetcode;

public class GuessNumberHigherOrLower {


    private static int target = 6;

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Guessed Number: " + guessNumber(n));
    }

    public static int guessNumber(int n) {
        int start = 1;
        int end = n;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int g = guess(mid);
            if (g == 0) {
                return mid;
            } else if (g == 1) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    private static int guess(int num) {
        if (num == target) {
            return 0;
        } else if (num < target) {
            return 1;
        } else {
            return -1;
        }
    }
}
