/*https://leetcode.com/problems/longest-common-prefix/submissions/*/

class Solution {
    public String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        if(len==0)
            return "";
        if(len==1)
            return strs[0];
        String s="";
        String s1 = strs[0];
        String s2 ;
        
        int l1=s1.length();
        int l2=0;
        int l3 = 0;
        for(int i=1;i<len;i++){
            l2 = strs[i].length();
            s2 = strs[i];
            if(l1>l2)
                l3=l2;
            else
                l3=l1;
            
            for(int j=0;j<l3;j++){
                if(s1.charAt(j)==s2.charAt(j))
                    s= s+s1.charAt(j);
                else break;
                //System.out.println(s);
            }
            l1 = s.length();
            s1 = s;
            s="";
        }
        return s1;
    }
}
