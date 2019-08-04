/*Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

Example 1:

Input: 121
Output: true
Example 2:

Input: -121
Output: */
class Solution {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        int len=s.length();
        for(int i=0;i<len/2;i++){
            //System.out.println(s.charAt(i)+" "+(s.charAt(len-i-1)));
            if(s.charAt(i)!=(s.charAt(len-i-1))){
              //   System.out.println(i);
                return false;
            }
        }
        return true;
    }
}
