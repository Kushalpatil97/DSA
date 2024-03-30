package com.kushal.number;

//Find  unique element in array
//[1,1,2,3,4,4,5,5]   3
public class UniqueElem {
    static int FindElem(int[] num)
    {
        int unique = 0;
        for(int i=0;i< num.length;i++)
        {
            unique^=num[i];
        }
        return unique;
    }
}
