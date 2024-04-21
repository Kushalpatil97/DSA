package com.kushal.recursion;

import java.util.ArrayList;

public class Maze {

    // find direction from start to end in matrix .. Right and down
    static  void PrintPath(String p,int R, int C)
    {
        if(R == 1 && C == 1)
        {
            System.out.println(p);
            return;
        }

        if(C > 1)
        {
            PrintPath(p + "R",R,C -1);
        }
        if(R > 1)
        {
            PrintPath(p + "D",R -1 ,C);
        }


    }

    static ArrayList<String> PrintPathConsiderDiagonal(String p, int R, int C)
    {
        if( R == 1 && C == 1)
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(R > 1 && C >1)
        {
            list.addAll(PrintPathConsiderDiagonal(p + "D",R -1,C -1));
        }
        if( R > 1)
        {
            list.addAll(PrintPathConsiderDiagonal(p + "V",R -1 ,C));
        }
        if( C > 1)
        {
            list.addAll(PrintPathConsiderDiagonal(p + "H",R,C -1));
        }


        return list;

    }

    public static void main(String[] args) {
        //PrintPath("",3,3);
        System.out.println(PrintPathConsiderDiagonal("",3,3));
    }
}
