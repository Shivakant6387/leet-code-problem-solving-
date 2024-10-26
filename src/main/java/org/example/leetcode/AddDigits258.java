package org.example.leetcode;

public class AddDigits258 {
    public static void main(String[] args) {
        int num = 38;
        int result = addDigits(num);
        System.out.println("Result: " + result);
    }

    public static int addDigits(int num) {
        if (num == 0) {
            return 0;
        }
        if (num % 9 == 0) {
            return 9;
        }
        return num % 9;
    }
}
