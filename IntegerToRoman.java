/*Given an integer A, convert it to a roman numeral, and return a string corresponding to its roman numeral version
1 <= A <= 3999
For Example
Input 1:
    A = 5
Output 1:
    "V"

Input 2:
    A = 14
Output 2:
    "XIV"*/

public class Solution {
    public String intToRoman(int A) {
        int[] arrInt = new int[]{1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String[] arrStr = new String[]{"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        String s="";
        int i=12;
        while(A>0){
            if(A>=arrInt[i]){
                s+=arrStr[i];
                A = A-arrInt[i];
            }else
            i--;
        }
        return s;
    }
}
