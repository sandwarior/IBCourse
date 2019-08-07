/*Given an integer A which denotes the number of people standing in the queue. A selection process follows a rule where people 
standing on even positions are selected. Of the selected people a queue is formed and again out of these only people on 
even position are selected.
Input 1:
    A = 10
Output 1:
    8*/



public class Solution {
    public int solve(int A) {
        int sum = 1;
        
        for(int i=1;A/2>=1;i++){
            sum = sum*2;
            A=A/2;
        }
        return sum;
    }
}
