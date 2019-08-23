/*Parity Queries
Given an empty multiset of integers initially and N queries to perform on it
. + X — add non-negative integer X to the multiset. Note, that there may be many occurrences of the same integer.
- X — delete a single occurrence of non-negative integer X from the multiset. 
It's guaranteed, that there is at least one X in the multiset. 
? S — count the number of integers in the multiset (with repetitions) that match some pattern S consisting of 0 and 1.
In the pattern, 0 stands for the even digits, while 1 stands for the odd. Integer X matches the pattern S,
if the parity of the i'th from the right digit in decimal notation matches the i'th from the right digit of the pattern.
If the pattern is shorter than this integer, it's supplemented with 0's from the left. Similarly,
if the integer is shorter than the pattern its decimal notation is supplemented with the 0's from the left. For example, 
if the pattern is S = 010, than integers 92, 2212, 50 and 414 match the pattern,
while integers 3, 110, 25 and 1030 do not. 
Given an array of characters A and an array of Strings B (representing the value of X for each query) of size N each,
perform the queries and return the result for every third query in the form of an array of integers.
Input 1:
    A = ['+', '+', '-', '?']
    B = [200, 200, 200, 0]
Output 1:
    [1]

Input 2:
    A = ['+', '+', '?', '+', '-', '?']
    B = [1, 241, 1, 361, 241, 101]
Output 2:
    [2, 1]*/

public class Solution {
    public ArrayList<Integer> solve(ArrayList<Character> A, ArrayList<String> B) {
        HashMap<Long,Integer> map = new HashMap<Long,Integer>();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int len = A.size();
        for(int i=0;i<len;i++){
            long x = convert(B.get(i));
            if(A.get(i)=='+'){
                if(map.containsKey(x))
                map.put(x,map.get(x)+1);
                else
                map.put(x,1);
            }else if(A.get(i)=='-'){
                map.put(x,map.get(x)-1);
            }else{
                if(map.containsKey(x))
                arr.add(map.get(x));
                else
                arr.add(0);
            }
        }
        return arr;
    }
    
    public long convert(String s){
        int len = s.length();
        long l=0;
        for(int i =len-1;i>=0;i--){
            int x = s.charAt(i);
            l+=(x%2)*((long)Math.pow(2,len-1-i));
        }
        return l;
    }
}
