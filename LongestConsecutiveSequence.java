/*Given an unsorted array of integers, find the length of the longest consecutive elements sequence. Example: Given [100, 4, 200, 1, 3, 2], 
The longest consecutive elements sequence is [1, 2, 3, 4]. 
Return its length: 4. Your algorithm should run in O(n) complexity.
*/

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int longestConsecutive(final List<Integer> A) {
        HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
        int len = A.size();
        for(int i=0;i<len;i++){
            hash.put(A.get(i),1);
        }
        int max =0;
        for(int i=0;i<len;i++){
            if(!hash.containsKey(A.get(i)-1)){
               int count=1;
               int x = A.get(i);
                while(hash.containsKey(++x))
                count++;
                if(count>max)
                max=count;
            }
        }
        return max;
    }
}
