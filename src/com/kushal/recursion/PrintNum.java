package com.kushal.recursion;

public class PrintNum {
    public void print5num(int i)
    {
        if(i == 5)
        {
            System.out.println(i);
            return;
        }
        System.out.println(i);
        print5num(i+1);
    }
    public static void main(String[] args) {
        PrintNum n = new PrintNum();
        n.print5num(0);

    }
}
