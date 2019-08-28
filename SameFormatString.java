/*Given two strings A and B. Check if B contains same characters as that of given string A and in the same order. Note
 1: A and B contain only UPPERCASE Letters.
2: No two consecutive characters are same in A.
3: You can only use constant amount of extra memory. 
Input 1:
    A = "HIRED" 
    B = "HHHIIIRRRRREEEEEDDDDD"
Output 1:
    1

Input 2:
    A = "HIRED"
    B = "DDHHHHIIIIRRRRREEEEDDD"
Output 2:
    0*/

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int solve(final String A, final String B) {
        int len1 = A.length();
        int len2 = B.length();
        int i=0;
        int j=0;
        while(i<len1 && j<len2){
            if(A.charAt(i)!=B.charAt(j))
            return 0;
            else{
            int x =  A.charAt(i);
             while(i<len1 && A.charAt(i)==x)
             i++;
             while(j<len2 && B.charAt(j)==x)
             j++;
            }
        }
        if(i==len1 && j==len2)
        return 1;
        else
        return 0;
    }
}
