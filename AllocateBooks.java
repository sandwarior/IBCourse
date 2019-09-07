public class Solution {
    public int books(ArrayList<Integer> A, int B) {
        int len  = A.size();
        int low = 0 ;
        int high = 0;
        int ans=-1;
        for(int i=0;i<len;i++){
            high+=A.get(i);
            if(A.get(i)>low){
                low=A.get(i);
            }
        }
        int mid,sum=0,cnt;
        if(B>len)
        return -1;
        while(high>=low){
            cnt=0;
            mid = (high+low)/2;
            sum = mid;
            for(int i=0;i<len;i++){
                if(sum>=A.get(i)){
                    sum=sum-A.get(i);
                }else{
                    cnt++;
                    sum=mid;
                    i--;
                }
            }
            if(sum>=0)
            cnt++;
            if(cnt>B)
            low=mid+1;
            else
            {
                ans =mid;
                high=mid-1;
            }
        }
        return ans;
    }
}
