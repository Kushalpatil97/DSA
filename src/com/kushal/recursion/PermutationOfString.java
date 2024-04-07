package com.kushal.recursion;

public class PermutationOfString {

    static void doPermutation(String p, String input)
    {
        if(input.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch = input.charAt(0);
        for(int i =0;i<=p.length();i++)
        {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());

            doPermutation(f + ch + s,input.substring(1));
        }
    }

    public static void main(String[] args) {
        doPermutation("","abcd");
    }
}
