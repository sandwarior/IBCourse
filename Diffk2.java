/*Given an array A of integers and another non negative integer k, find if there exists 2 indices i and j such that A[i] - A[j] = k, i != j. Example : Input :
A : [1 5 3]
k : 2
Output :
1
as 3 - 1 = 2
Return 0 / 1 for this problem.*/


public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int diffPossible(final List<Integer> A, int B) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int len = A.size();
        for(int i=0;i<len;i++){
            if(map.containsKey(A.get(i)))
            map.put(A.get(i),map.get(A.get(i))+1);
            else
             map.put(A.get(i),1);
        }
        for(int i=0;i<len;i++){
            if(map.containsKey(A.get(i)+B)){
                if(B==0){
                    if(map.get(A.get(i))>1)
                    return 1;
                    else
                    return 0;
                }else
                return 1;
            }
        }
        return 0;
    }
}
