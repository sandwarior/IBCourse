/*Repeat and Missing Number Array
You are given a read only array of n integers from 1 to n.  Each integer appears exactly once except A which appears twice and B which is missing. Return A and B.  Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory? Note that in your output A should precede B.  Example:
Input:[3 1 2 5 3] 

Output:[3, 4] 

A = 3, B = 4*/

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] A) {
        long sum1 = 0;
        long sum2 = 0;
        int arr[] = new int[2];
        int miss = 0;
        int repeat = 0;
        int len =  A.length;
        for(long i = 1;i<=len;i++){
            sum1 = sum1+i-A[(int)i-1];
            sum2 = sum2 + (i*i)-((long)A[(int)i-1]*(long)A[(int)i-1]);
           
        }
        
        sum2 = sum2/sum1;
        miss = ((int)(sum2+sum1)/2);
        repeat = (int)(miss-sum1);
        arr[0] = repeat;
        arr[1] = miss;
        return arr;
    }
}
