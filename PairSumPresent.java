/*Given an array A of N distinct and positive elements, 
the task is to find number of unordered pairs whose sum already exists in given array. 
A : [ 3, 4, 2, 6 ,7]
SAMPLE OUTPUT
2*/

public class Solution {
    public int solve(ArrayList<Integer> A) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int cnt=0;
        int len = A.size();
        for(int i=0;i<len;i++){
            map.put(A.get(i),1);
        }
        for(int i=0;i<len-1;i++){
            for(int j=i+1;j<len;j++)
            if(map.containsKey(A.get(i)+A.get(j)))
            cnt++;
        }
        return cnt;
    }
}
