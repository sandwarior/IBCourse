Given an integer A, find and return the A'th magic number. A magic number is defined as a number which can be expressed as a power of 5 or sum of unique powers of 5. First few magic numbers are 5, 25, 30(5 + 25), 125, 130(125 + 5), …. 
Input Format
Constraints
1 <= A <= 5000
For Example
Input 1:
    A = 10
Output 1:
    650*/

public class Solution {
    public int solve(int A) {
        int sum=0;
        int x=5;
        while(A!=0){
            sum+=(A%2)*x;
            A=A/2;
            x=x*5;
        }
        return sum;
    }
}
