/*Given a string A representing a roman numeral. Convert A into integer. A is guaranteed to be within the range from 1 to 3999. 
Input 1:
    A = "XIV"
Output 1:
    14

Input 2:
    A = "XX"
Output 2:
    20*/
public class Solution {
    public int romanToInt(String A) {
        int[] arrInt = new int[]{1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String[] arrStr = new String[]{"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        int i=0;
        int len = A.length();
        int j=12;
        int sum=0;
        while(i<len){
            if((i==len-1)&&((j%2)==1))
            j--;
            else{
            if(A.substring(i,i+(j%2)+1).equals(arrStr[j])){
                sum+=arrInt[j];
                i=i+(j%2)+1;
            }else
            j--;
            }
        }
        return sum;
    }
}
