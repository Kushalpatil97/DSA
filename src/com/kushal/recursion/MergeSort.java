package com.kushal.recursion;

import java.util.Arrays;

public class MergeSort {
    static int[] MergeSort(int[] arr)
    {
        if(arr.length ==1 )
        {
            return arr;
        }
        int mid = arr.length /2;
        int [] left = MergeSort(Arrays.copyOfRange(arr,0,mid));
        int [] right = MergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }
    static  int[] merge(int[] left,int[] right)
    {
        int[] res = new int[left.length + right.length];
        int i =0;
        int j = 0;
        int k =0;
        while(i < left.length && j < right.length)
        {
            if(left[i] < right[j])
            {
                res[k] = left[i];
                i++;
            }
            else {
                res[k] = right[j];
                j++;
            }
            k++;
        }
        while( i < left.length)
        {
            res[k] = left[i];
            i++;
            k++;
        }
        while( j < right.length)
        {
            res[k] = right[j];
            j++;
            k++;
        }

        return res;
    }
    static void MergeSortInplace(int[] arr,int start, int end)
    {
        if(end - start == 1)
        {
            return;
        }
        int mid = (end + start)/2;

        MergeSortInplace(arr,start,mid);
        MergeSortInplace(arr,mid,end);
        MergeInplace(arr,start,mid,end);

    }
    static void MergeInplace(int[] arr, int s,int m,int e)
    {
        int i = s;
        int j = m;
        int k = 0;
        int [] mix = new int[e - s];
         while (i < m && j < e)
         {
             if(arr[i] < arr[j])
             {
                 mix[k] = arr[i];
                 i++;
             }
             else {
                 mix[k] = arr[j];
                 j++;
             }
             k++;

         }
         while(i < m)
         {
             mix[k] = arr[i];
             i++;
             k++;

         }
        while(j < e)
        {
            mix[k] = arr[j];
            j++;
            k++;

        }
         for(int l = 0;l < mix.length;l++)
         {
             arr[s+l] = mix[l];
         }

    }
    public static void main(String[] args) {
        int[] arr = {4,3,2,1}; //MergeSort()
         MergeSortInplace(arr,0,arr.length );//Inplace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
