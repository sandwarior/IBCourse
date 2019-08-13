/*Given an array of integers A, find and return the peak element in it. 
An array element is peak if it is NOT smaller than its neighbors. For corner elements, 
we need to consider only one neighbor. For example, for input array {5, 10, 20, 15}, 20 is the only peak element.
Input 1:
    A = [1, 2, 3, 4, 5]
Output 1:
    5

Input 2:
    A = [5, 17, 100, 11]
Output 2:
    100*/

public class Solution {
    public int solve(int[] A) {
        int len = A.length;
        int low=0;
        int high = len-1;
        int mid;
        int midx;
        while(low<=high){
           // System.out.println(low+" "+high);
            mid = low + ((high-low)/2);
            midx = A[mid];
           // System.out.println(mid+" "+midx);
            if(mid==0 || mid==len-1)
            return A[mid];
            if(midx>A[mid-1] && midx>A[mid+1])
            return A[mid];
            else if(midx<A[mid-1])
                high=mid-1;
            else
                low=mid+1;
           // System.out.println(low+" "+high);
        }
        return 0;
    }
}
