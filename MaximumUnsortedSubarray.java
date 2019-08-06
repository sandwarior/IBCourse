/*Maximum Unsorted Subarray
You are given an array (zero indexed) of N non-negative integers, A0, A1 ,..., AN-1. Find the minimum sub array Al, Al+1 ,..., Ar so if we sort(in ascending order) that sub array, then the whole array should get sorted. If A is already sorted, output -1. Example :
Input 1:

A = [1, 3, 2, 4, 5]

Return: [1, 2]*/


public class Solution {
    public int[] subUnsort(int[] A) {
        int len = A.length;
        int max =-1;
        int x=-1;
        int y =-1;
        int arr[] = new int[2];
        int arr1[] = new int[1];
        for(int i=0;i<len;i++){
            if(A[i]<max)
            x=i;
            else
            max =A[i];
        }
        int min = max+1;
       // System.out.println(x+" "+max);
        for(int i=len-1;i>=0;i--){
            if(A[i]>min)
            y=i;
            else
            min =A[i];
        }
       // System.out.println(y+" "+min);
        if(x==-1){
        arr1[0] = x;
        return arr1;
        }else{
        arr[0]=y;
        arr[1]=x;
        return arr;
        }
    }
}
