package com.kushal.recursion.pattern;

import java.util.ArrayList;

public class SubSequence {

    static void  print_subsequenc(String p, String input)
    {
        if(input.isEmpty())
        {
            System.out.println(p);
            return;
        }
       char ch = input.charAt(0);
        print_subsequenc(p,input.substring(1));
        print_subsequenc(p + ch,input.substring(1));
    }

    static ArrayList<String> SubSequenceInArrayList(String p, String input)
    {
        if(input.isEmpty())
        {
            ArrayList<String> op1 = new ArrayList<>();
            op1.add(p);

            return op1;

        }
        char ch = input.charAt(0);
        ArrayList<String> left = SubSequenceInArrayList(p,input.substring(1));
        ArrayList<String> right = SubSequenceInArrayList(p + ch,input.substring(1));

        left.addAll(right);
        return left;
    }

    public static void main(String[] args) {
        print_subsequenc("","abc");
    }
}
