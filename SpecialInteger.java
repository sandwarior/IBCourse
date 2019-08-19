/*Given an array of integers A and an integer B, find and return the maximum value K such that there is no subarray in A of size K with sum of elements greater than B.
Input Format
The first argument given is the integer array A.
The second argument given is integer B.
Output Format
Return the maximum value of K (sub array length).
Constraints
1 <= length of the array <= 100000
1 <= A[i] <= 10^9
1 <= B <= 10^9
For Example
Input 1:
    A = [1, 2, 3, 4, 5]
    B = 10
Output 1:
    2

Input 2:
    A = [5, 17, 100, 11]
    B = 130
Output 2:
    3*/


public class Solution {
    public int solve(int[] A, int B) {
        int len = A.length;
        int low =1;
        int high = len;
        int mid;
        int sum=0;
        while(low<=high){
        mid = low+((high-low)/2);
        sum=0;
        for(int i=0;i<len;i++){
            if(i<mid)
            sum+=A[i];
            else
            sum=sum+A[i]-A[i-mid];
           // System.out.print(sum+" ");
            if(sum>B){
                high=mid-1;
                break;
            }
        }
        if(sum<=B)
        low=mid+1;
        }
        return high;
    }
}
