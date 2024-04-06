package com.kushal.recursion;

import java.util.Arrays;

public class SelectionSort {
    static void doSelectionSort(int[] arr,int r,int c,int max)
    {
        /* [3,2,1]*/
        if(r == 0)
        {
            return;
        }

        if(c <  r) {
            if (arr[c] > arr[max]) {
                doSelectionSort(arr,r,c+1,c);
            }
            else {
                doSelectionSort(arr, r, c + 1, max);
            }
        }
        else
        {
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[max] = temp;
            doSelectionSort(arr,r-1,0,0);
        }
    }

    public static void main(String[] args) {
        int[]  arr = {4,3,1};
        doSelectionSort(arr,arr.length -1,0,0);
        System.out.println(Arrays.toString(arr));
    }
}
