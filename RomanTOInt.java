/*https://leetcode.com/problems/roman-to-integer/*/

class Solution {
    public int romanToInt(String s) {
    HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int len = s.length();
        char a,b;
        int sum=0;
        for(int i=0;i<len;i++){
            
            a=s.charAt(i);
            if(i!=len-1){
            b=s.charAt(i+1);
            if(a=='I' && b=='V'){
                sum+=4;
                i++;
            }
            else if(a=='I' && b=='X'){
                sum+=9;
                i++;
            }else if(a=='X' && b=='L'){
                sum+=40;
                i++;
            }else if(a=='X' && b=='C'){
                sum+=90;
                i++;
            }else if(a=='C' && b=='D'){
                sum+=400;
                i++;
            }else if(a=='C' && b=='M'){
                sum+=900;
                i++;
            }else
                sum+=map.get(s.charAt(i));
            }else
             sum+=map.get(a);
        }
        return sum;
}
}
