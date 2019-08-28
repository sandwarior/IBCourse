/*
Given an string A. The only operation allowed is to insert characters in the beginning of the string.
Find how many minimum characters are needed to be inserted to make the string a palindrome string
Input 2:
    A = "AACECAAAA"
Output 2:
    2
    Explanation 2:
        Insert 'A' at beginning, string becomes: "AAACECAAAA".
        Insert 'A' at beginning, string becomes: "AAAACECAAAA".*/

public class Solution {
    public int solve(String A) {
        
        StringBuilder str = new StringBuilder();
        str.append(A);
        str = str.reverse();
        int slen = A.length();
        A= A+"$"+str;
       // System.out.println(A);
        int len = A.length();
        int lpsarr[] = new int[len];
        lpsarr[0] = 0;
        for(int j=0,i=1;i<len;i++){
            if(A.charAt(i)==A.charAt(j)){
            lpsarr[i]=j+1;
            j++;
            }
            else
            {
                if(j==0)
                lpsarr[i]=0;
                else{
                 i--;
                j = lpsarr[j-1];
                }
            }
        }
       // for(int i=0;i<len;i++)
       // System.out.println(lpsarr[i]);
        return slen-lpsarr[len-1];
    }
}
