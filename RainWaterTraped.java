/*Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.*/
/*Input 1:
    A = [0,1,0,2,1,0,1,3,2,1,2,1]
Output 1:
    6*/
public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int trap(final int[] A) {
        int len =  A.length;
        int max=-1;
        int sum=0;
        int maxr[] = new int[len];
        int maxl[] = new int[len];
        for(int i=0;i<len;i++)
        {
            if(max<A[i])
            max=A[i];
            maxl[i]=max;
        }
        max=-1;
        for(int i=len-1;i>=0;i--)
        {
            if(max<A[i])
            max=A[i];
            maxr[i]=max;
        }

        for(int i=1;i<len-1;i++){
            sum= sum + (Math.min(maxr[i],maxl[i])-A[i]);
        }
        return sum;
    }
}
