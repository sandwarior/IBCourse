/*Given a string A denoting a stream of lowercase alphabets. You have to make new string B. 
B is formed such that we have to find first non-repeating character each time a character is inserted to the stream and append it at the end to B.
if no non-repeating character is found then append '#' at the end of B.
Input 1:
    A = "abadbc"
Output 1:
    "aabbdd"

    Explanation:
    "a"      -   first non repeating character 'a'
    "ab"     -   first non repeating character 'a'
    "aba"    -   first non repeating character 'b'
    "abad"   -   first non repeating character 'b'
    "abadb"  -   first non repeating character 'd'
    "abadbc" -   first non repeating character 'd'
*/


public class Solution {
    public String solve(String A) {
        int[] hash = new int[26];
        char[] queue = new char[26];
        int len = A.length();
        int front =-1;
        int rear = -1;
        char[] arr = new char[len];
        int cnt=0;
        for(int i=0;i<len;i++){
            int x = A.charAt(i)-97;
            if(hash[x]==0){
                if(front==-1)
                front++;
                rear++;
                queue[rear] = A.charAt(i);
                hash[x]++;
            }else{
                hash[x]++;
               if(front!=-1)
                while( front<=rear && hash[queue[front]-97]>=2){
                    front++;
                }
                if(front>rear){
                front=-1;
                rear = -1;
                }
            }
            if(front==-1)
            arr[cnt++]='#';
            else
            arr[cnt++]=queue[front];
        }
        String s = new String(arr);
        return s;
    }
}
