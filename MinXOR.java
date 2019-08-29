/*Given an array of N integers, find the pair of integers in the array which have minimum XOR value. Report the minimum XOR value. Examples :
Input
0 2 5 7
Output
2 (0 XOR 2)
Input
0 4 7 9
Output
3 (4 XOR 7) */

public class Solution {
    public int findMinXor(ArrayList<Integer> A) {
        Collections.sort(A);
        int len = A.size();
        int min = 1000000001;
        for(int i =0;i<len-1;i++){
            int x = A.get(i)^A.get(i+1);
            if(min>x)
            min = x;
        }
        return min;
    }
}
