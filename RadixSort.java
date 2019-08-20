package main;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int arr[] = {120,136,184,144,172,30,120,144,144};
        int max =184;
        int min = 30;
        int count=0;
        int len = arr.length;
        while(max!=0){
            max=max/10;
            count++;
        }
        max =184;
        for(int i=0;i<count;i++){
            int freq[] = new int[10];
            int cFreq[] = new int[10];
            int arr1 [] = new int[len];
            int mod=(int)Math.pow(10,i+1);
            int div = (int)Math.pow(10,i);
            for(int j=0;j<len;j++){
                freq[(arr[j]%mod)/div]++;
            }
            cFreq[9] = freq[9];
            for(int j=8;j>=0;j--){
                cFreq[j]=cFreq[j+1]+freq[j];
               // System.out.print(cFreq[j]+" ");
            }
            for(int j=0;j<len;j++){
                int x  = (arr[j]%mod)/div;
                System.out.print(x+" ");
                arr1[len-cFreq[x]] = arr[j];
                cFreq[x]--;
            }
            for(int j=0;j<len;j++) {
                System.out.println(arr1[j]);
            }
            arr = Arrays.copyOf(arr1,arr1.length);
            }


    }
}
