/*Given a sorted array of integers A where every element appears twice except for one element which appears once, find and return this single element that appears only once. 
Input Format
The only argument given is the integer array A.
Output Format
Return the single element that appears only once.
Constraints
1 <= length of the array <= 100000
1 <= A[i] <= 10^9 
For Example
Input 1:
    A = [1, 1, 2, 2, 3]
Output 1:
    3

Input 2:
    A = [5, 11, 11, 100, 100]
Output 2:
    5*/


public class Solution {
    public int solve(int[] A) {
        int len = A.length;
        int low=0;
        int high=len-1;
        int mid;
        while(low<=high){
            mid =low+((high-low)/2);
            if(mid==0 || mid==len-1)
            return A[mid];
            if(A[mid]!=A[mid-1] && A[mid]!=A[mid+1])
            return A[mid];
            else if(A[mid]==A[mid-1]){
                if((mid-1)%2==0)
                low = mid+1;
                else
                high = mid-2;
            }else if(A[mid]==A[mid+1]){
                if((mid)%2==0)
                low = mid+2;
                else
                high = mid-1;
            }
        }
        return 0;
    }
}
