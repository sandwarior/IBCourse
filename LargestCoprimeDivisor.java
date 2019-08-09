/*You are given two positive numbers A and B. You need to find the maximum valued integer X such that:
X divides A i.e. A % X = 0
X and B are co-prime i.e. gcd(X, B) = 1
For example,
A = 30
B = 12
We return
X = 5*/

public class Solution {
    public int cpFact(int A, int B) {
        
        int sqrtA = (int)Math.sqrt(A);
        int max = -1;
        for(int i=1;i<=sqrtA;i++){
            if(A%i==0){
                int a = i;
		        int b = B;
		        int c;
		        int dvs = Math.min(a,b);
		        int dvd = Math.max(a,b);
		        while(dvd%dvs!=0){
			        c =dvd;
			        dvd = dvs;
			        dvs = c%dvs;
			        
		        }
		        
		        if(dvs==1 && i>max)
		        max = i;
		        
		         a = A/i;
		         
		         b = B;
		         dvs = Math.min(a,b);
		         dvd = Math.max(a,b);
		        while(dvd%dvs!=0){
			        c =dvd;
			        dvd = dvs;
			        dvs = c%dvs;
			        
		        }
		        
		        if(dvs==1 && a>max)
		        max = a;
		       
            }
        }
        return max;
    }
}
