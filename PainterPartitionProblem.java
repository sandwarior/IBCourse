public class Solution {
    public int paint(int A, int B, ArrayList<Integer> C) {
        int len  = C.size();
        int low = 0 ;
        int high = 0;
        long ans=-1;
        for(int i=0;i<len;i++){
            high+=C.get(i);
            if(C.get(i)>low){
                low=C.get(i);
            }
        }
        int mid,sum=0,cnt;
        if(A>len){
         ans = (low%10000003 * B)%10000003;
        return (int)ans;
        }
        while(high>=low){
            cnt=0;
            mid = (high+low)/2;
            sum = mid;
            for(int i=0;i<len;i++){
                if(sum>=C.get(i)){
                    sum=sum-C.get(i);
                }else{
                    cnt++;
                    sum=mid;
                    i--;
                }
            }
            if(sum>=0)
            cnt++;
            if(cnt>A)
            low=mid+1;
            else
            {
                ans =mid;
                high=mid-1;
            }
        }
        return (int)((ans%10000003 * B)%10000003);
    }
}
