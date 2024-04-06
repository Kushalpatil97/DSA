package com.kushal.recursion;

import java.util.Arrays;

public class BubbleSort {
    static void doBubbleSort(int[] arr,int r,int c)
    {
        /* [3,2,1]*/
        if(r == 0)
        {
            return;
        }

        if(c <  r) {
            if (arr[c] > arr[c + 1]) {
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;  //[2,1,3] [1,2,3]
            }
            doBubbleSort(arr,r,c+1);
        }
        else
        {
                doBubbleSort(arr,r-1,0);
        }
    }

    public static void main(String[] args) {
        int[]  arr = {1,4,3};
        doBubbleSort(arr,arr.length -1,0);
        System.out.println(Arrays.toString(arr));
    }
}
