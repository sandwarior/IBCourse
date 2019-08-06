/*Given an array of integers A, find and return the minimum elements to be removed such that in the resulting array the sum of any two adjacent values is even.*/

public class Solution {
    public int solve(int[] A) {
        int len = A.length;
        int odd = 0;
        int even = 0;
        
        for(int i=0;i<len;i++){
            if(A[i]%2==0)
            even++;
            else
            odd++;
        }
        
        if(odd<even)
        return odd;
        else
        return even;
    }
}
