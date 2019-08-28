/*Given the array of strings A, you need to find the longest string S which is the prefix of ALL the strings in the array.
Longest common prefix for a pair of strings S1 and S2 is the longest string S which is the prefix of both S1 and S2. 
Input 1:
    A = ["abcdefgh", "aefghijk", "abcefgh"]
Output 1:
    "a"
    Explanation 1:
        Longest common prefix of all the strings is "a".

Input 2:
    A = ["abab", "ab", "abcd"];
Output 2:
    "ab"
    Explanation 2:
        Longest common prefix of all the strings is "ab".*/

public class Solution {
    public String longestCommonPrefix(ArrayList<String> A) {
        String s = A.get(0);
        int len = A.size();
        for(int i=1;i<len;i++){
            int slen = s.length();
            String s1 = A.get(i);
            int slen1 = s1.length();
            int x=0;
            int y=0;
            int flag =0;
            while(x<slen && y<slen1){
                if(s.charAt(x)!=s1.charAt(y)){
                s = s.substring(0,x);
                flag=1;
                break;
                }
                x++;
                y++;
            }
            if(flag==0 && slen1<=slen)
            s = s1;
        }
        return s;
    }
}
