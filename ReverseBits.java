/*Reverse bits of an 32 bit unsigned integer Example 1: x = 0,
          00000000000000000000000000000000  
=>        00000000000000000000000000000000
return 0  Example 2: x = 3,
          00000000000000000000000000000011 
=>        11000000000000000000000000000000
return 3221225472*/

public class Solution {
	public long reverse(long a) {
	    
	    long arr[] = new long[32];
	    arr[0]=1;
	    for(int i=1;i<32;i++){
	        arr[i] = 2*arr[i-1];
	    }
	    long sum=0;
	    int cnt=31;
	    long x;
	    while(a>0){
	        x=a%2;
	        if(x==1)
	        sum+=arr[cnt];
	        cnt--;
	        a=a/2;
	    }
	    return sum;
	}
}
