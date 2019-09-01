/*Given an array A of both positive and negative integers. Your task is to compute sum of minimum and maximum elements of all sub-array of size B. Note: Since the answer can be very large, you are required to return the sum module 1000000007. 
Input Format
1 <= size of array A <= 100000
-1000000000 <= A[i] <= 1000000000
1 <= B <= size of array
** Example**
Input 1:
    A[] = {2, 5, -1, 7, -3, -1, -2}
    B = 4

Output 1:
    18
Explanation : 
    Subarrays of size 4 are : 
        {2, 5, -1, 7},   min + max = -1 + 7 = 6
        {5, -1, 7, -3},  min + max = -3 + 7 = 4      
        {-1, 7, -3, -1}, min + max = -3 + 7 = 4
        {7, -3, -1, -2}, min + max = -3 + 7 = 4   
        Sum of all min & max = 6 + 4 + 4 + 4 
                             = 18 */

public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        int len = A.size();
        int queueMax[] = new int[100001];
        int queueMin[] = new int[100001];
        int fmax =-1;
        int rmax = -2;
        int fmin =-1;
        int rmin =-2;
        int sum=0;
        for(int i=0;i<len;i++){
            int x = A.get(i);
            if(i>=B){
                sum=Math.floorMod(sum,1000000007)+Math.floorMod((queueMax[fmax]+queueMin[fmin]),1000000007);
                if(queueMax[fmax]==A.get(i-B))
                    fmax++;
                if(queueMin[fmin]==A.get(i-B))
                    fmin++;
                
            }
                while(fmax<=rmax && queueMax[fmax]<x){
                    fmax++;
                }
                while(fmax<=rmax && queueMax[rmax]<x){
                    rmax--;
                }
                if(fmax>rmax){
                    fmax=0;
                    rmax=0;
                    queueMax[fmax]=x;
                }else{
                    rmax++;
                    queueMax[rmax]=x;
                }
                while(fmin<=rmin && queueMin[fmin]>x){
                    fmin++;
                }
                while(fmin<=rmin && queueMin[rmin]>x){
                    rmin--;
                }
                if(fmin>rmin){
                    fmin=0;
                    rmin=0;
                    queueMin[fmin]=x;
                }else{
                    rmin++;
                    queueMin[rmin]=x;
                }
            
        }
        sum=Math.floorMod((Math.floorMod(sum,1000000007)+Math.floorMod((queueMax[fmax]+queueMin[fmin]),1000000007)),1000000007);
                return sum;
    }
}
