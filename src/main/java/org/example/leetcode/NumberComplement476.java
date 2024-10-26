package org.example.leetcode;

public class NumberComplement476 {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(findComplement(num));
    }

    public static int findComplement(int num) {
        int len=(int)(Math.log(num)/Math.log(2))+1;
        int mask=(1<<len)-1;
        return mask ^num;
    }
}
