/*Given a positive integer, return its corresponding column title as appear in an Excel sheet. For example:
    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB */

public class Solution {
    public String convertToTitle(int A) {
        String s = "";
        int x;
        char c;
        while(A>0){
            x = A%26;
            A=A/26;
           // System.out.println(x);
            if(x==0){
            c='Z';
            A=A-1;
            }
            else
            c = (char)(x+64);
            s = String.valueOf(c)+s;
            
            //System.out.println(s+" "+A);
        }
        return s;
    }
}
