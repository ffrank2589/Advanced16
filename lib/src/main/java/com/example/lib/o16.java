package com.example.lib;


import java.util.Scanner;

public class o16 {
    public static void main(String[] args) {
        System.out.println(add3());
    }

    static int add3() {
        int addcount = 0;
        for (int i = 0; i <= 100; i += 2) {
            addcount += i;
        }
        return addcount;
    }
}
