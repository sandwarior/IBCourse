/*Given an array A of N integers where each value represents number of chocolates in a packet. i-th can have A[i] number of chocolates.  There are B number students, the task is to distribute chocolate packets following below conditions:
1. Each student gets one packet.
2. The difference between the number of chocolates in packet with maximum chocolates and packet with minimum chocolates given to the students is minimum.
Return the minimum difference (that can be achieved) between maximum and minimum number of chocolates distributed. 
A : [3, 4, 1, 9, 56, 7, 9, 12]
B : 5
SAMPLE OUTPUT
6*/

public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
       
        Collections.sort(A);
        int len = A.size();
         if (B==0 || B==1||B>len)
         return 0;
        int min=9999999;
        for(int i=0;i<len-B;i++){
            int x = A.get(i+B-1)-A.get(i);
            if(x<min)
            min=x;
        }
        return min;
    }
}
