package com.kushal.recursion;

import java.util.ArrayList;
import java.util.List;

public class Subset {

    static List<List<Integer>> SubsetUsingLoop(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());  //[ [] ]
        for(int i : arr)    //[1,2]
        {
            int n = outer.size();
            for(int j = 0;j< n;j++)
            {
                List<Integer> internal = new ArrayList<>(outer.get(j)); //[]
                internal.add(i);  //[1] [2]
                outer.add(internal);//[ [],[1],[2] ]
            }
        }
        return  outer;

    }

    public static void main(String[] args) {
        int[] arr = {1,2};
        System.out.println(SubsetUsingLoop(arr));

    }

}
