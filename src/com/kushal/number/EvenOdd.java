package com.kushal.number;

public class EvenOdd {
    static boolean Odd(int num)
    {
        return (num & 1)==1;
    }

    public static void main(String[] args) {
        System.out.println(Odd(68));
    }
}
