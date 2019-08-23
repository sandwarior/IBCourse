/*Given an array of integers A, find and return whether the given array contains a subarray with a sum equal to 0. 
If the given array contains a sub-array with sum zero return 1 else return 0.
Note: Length of sub array should be at least one. 
Input 1:
    A = [1, 2, 3, 4, 5]
Output 1:
    0

Input 2:
    A = [5, 17, -22, 11]
Output 2:
    1*/


public class Solution {
    public int solve(ArrayList<Integer> A) {
        int size = A.size();
        HashMap<Long,Integer> hash = new HashMap<Long,Integer>();
        hash.put(0L,1);
        ArrayList<Long> arr = new ArrayList<Long>();
        arr.add(0,(long)A.get(0));
        for(int i=1;i<size;i++){
            arr.add(i,(long)A.get(i)+arr.get(i-1));
        }
        //System.out.println(A);
        for(int i=0;i<size;i++){
            long x = arr.get(i);
            if(hash.containsKey(x))
            return 1;
            else
            hash.put(x,1);
        }
        return 0;
    }
}
