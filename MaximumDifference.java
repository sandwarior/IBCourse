/*Given an array of integers A and an integer B. Find and return the maximum value of | s1 - s2 |  where s1 = sum of any subset of size B, s2 = sum of elements of A - sum of elemets of s1 Note |x| denotes the absolute value of x. 
Input Format
The arguments given are the integer array A and integer B.
Output Format
Return the maximum value of | s1 - s2 |.
Constraints
1 <= B < length of the array <= 100000
1 <= A[i] <= 10^5 
For Example
Input 1:
    A = [1, 2, 3, 4, 5]
    B = 2
Output 1:
    9*/

public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        Collections.sort(A);
        int min=0;
        int max=0;
        int len= A.size();
        if(B<=(len/2)){
            for(int i=0;i<len;i++){
                if(i<=B-1)
                min+=A.get(i);
                else
                max+=A.get(i);
            }
        }
        else
        {
            for(int i=0;i<len;i++){
                if(i<=(len-B-1))
                min+=A.get(i);
                else
                max+=A.get(i);
            }
        }
        return max-min;
    }
}
