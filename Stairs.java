/*You are climbing a stair case and it takes A steps to reach to the top. Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top? 
 Input Format:
The first and the only argument contains an integer A, the number of steps.
Output Format:
Return an integer, representing the number of ways to reach the top.

Example : Input 1:
A = 2
Output 1:
2
Explanation 1:
[1, 1], [2]
Input 2:
A = 3
Output 2:
3
Explanation 2:
[1 1 1], [1 2], [2 1]*/

public class Solution {
    public int climbStairs(int A) {
        ArrayList<Integer> numOfWays = new ArrayList<Integer>();
        numOfWays.add(0);
        numOfWays.add(1);
        numOfWays.add(2);
        for(int i=3;i<=A;i++){
            int x = numOfWays.get(i-1)+numOfWays.get(i-2);
            numOfWays.add(x);
        }
        return numOfWays.get(A);
    }
}
