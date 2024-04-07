package com.kushal.recursion;

import java.util.ArrayList;

public class Dice {

    static ArrayList<String> RollDice(String p, int target)
    {
        if(target == 0 )
        {
            ArrayList<String> op = new ArrayList<>();
            op.add(p);
            return op;
        }
        ArrayList<String> list = new ArrayList<>();
        for(int i = 1; i <= 6 && i <= target; i++)
        {
              list.addAll(RollDice(p + i,target - i));
        }

        return list;
    }
    static int countRollDice(String p, int target)
    {
        if(target == 0)
        {
              return 1;
        }
        int count = 0;
        for(int i = 1; i <= 6 && i <= target; i++)
        {
            count = count + countRollDice(p + i,target - i);
        }

        return count;
    }


    public static void main(String[] args) {
        System.out.println(RollDice("",4));
        System.out.println("count" + countRollDice("",4));

    }
}
