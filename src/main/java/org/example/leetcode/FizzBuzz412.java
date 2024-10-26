package org.example.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz412 {
    public static void main(String[] args) {
        int n=3;
        System.out.println(fizzBuzz(n));
    }

    public static List<String> fizzBuzz(int n) {
        List<String> resp = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) resp.add("FizzBuzz");
            else if (i % 3 == 0) resp.add("Fizz");
            else if (i % 5 == 0) resp.add("Buzz");
            else resp.add(i + "");
        }
        return resp;
    }
}
