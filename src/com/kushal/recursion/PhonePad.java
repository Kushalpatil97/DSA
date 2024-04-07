package com.kushal.recursion;
//Leetcode Question
public class PhonePad {

    static void  doCombination(String p, String InputDigit)
    {
        if(InputDigit.isEmpty())
        {
            System.out.println(p);
            return;
        }
        int digit = InputDigit.charAt(0) - '0';
        for(int i = (digit - 1)*3; i < digit*3 ; i++ )
        {
            char ch = (char) ('a' + i );
            doCombination(p + ch,InputDigit.substring(1));
        }
    }

    public static void main(String[] args) {
        doCombination("","12");
    }
}
