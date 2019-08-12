/*Given an array of integers, every element appears thrice except for one which occurs once.  Find that element which does not appear thrice. Note: Your algorithm should have a linear runtime complexity.  Could you implement it without using extra memory? Example :
Input : [1, 2, 4, 3, 3, 2, 2, 3, 1, 1]
Output : 4*/


public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int singleNumber(final int[] A) {
        int len = A.length;
        int arr[] = new int[32];
        int x;
        int bit=0;
        int sum=0;
        for(int i=0;i<len;i++){
            x=A[i];
            bit=0;
            while(x!=0){
                arr[bit] += x%2;
                bit++;
                x=x/2;
            }
        }
        x=1;
        for(int i=0;i<32;i++){
            sum+=x*(arr[i]%3);
            x=x*2;
        }
        return sum;
    }
}
