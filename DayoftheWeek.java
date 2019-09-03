/*Given three integers A, B and C, find and return the day of the week for the given date A/B/C where A represents the date, B represents the month and C represents the year. Assume that Jan 1st 1 AD is a Monday in Gregorian calendar. February has 28 days(excluding leap years when it has 29 days). 
Leap year is a year that is either (divisible by 400) or (divisible by 4 and not divisible by 100).
1 <= A <= 31
1 <= B <= 12
1990 <= C <= 2100
For Example
Input 1:
    A = 19
    B = 4
    C = 2019
Output 1:
    friday*/

public class Solution {
    public String solve(int A, int B, int C) {
        int[] arr = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
        String[] s = new String[]{"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
        int sum = (C-1)*365;
        sum = sum + ((C-1)/4)-((C-1)/100)+((C-1)/400);
        boolean isleap = false;
        if((C%4==0 && C%100!=0) || C%400==0)
        isleap = true;
        for(int i=0;i<B-1;i++){
            sum+=arr[i];
            if(i==1 && isleap)
            sum++;
        }
        sum = sum+A;
        return s[sum%7];
    }
}
