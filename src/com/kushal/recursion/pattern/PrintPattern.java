package com.kushal.recursion.pattern;
/*
* * * * * *
* * * * *
* * * *
* * *
* *
*

 */
public class PrintPattern {
    static void print(int r,int c)
    {

        if(r == 0)
        {
            return;
        }
        if(c < r)
        {
            //System.out.print("*");
            System.out.print(r+" "+c);
            print(r,c+1);
        }
        else
        {
            System.out.println();
            print(r-1,0);
        }

    }

    public static void main(String[] args) {
        print(6,0);
    }
}
