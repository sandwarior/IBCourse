/*Evaluate the value of an arithmetic expression in Reverse Polish Notation.
Valid operators are +, -, *, /. Each operand may be an integer or another expression. 
Input Format
Input 1:
    A =   ["2", "1", "+", "3", "*"]
Output 1:
    9
Explaination 1:
    starting from backside:
    *: ( )*( )
    3: ()*(3)
    +: ( () + () )*(3)
    1: ( () + (1) )*(3)
    2: ( (2) + (1) )*(3)
    ((2)+(1))*(3) = 9

Input 2:
    A = ["4", "13", "5", "/", "+"]
Output 2:
    6
Explaination 2:
    +: ()+()
    /: ()+(() / ())
    5: ()+(() / (5))
    1: ()+((13) / (5))
    4: (4)+((13) / (5))
    (4)+((13) / (5)) = 6*/
public class Solution {
    public int evalRPN(String[] A) {
        int len  = A.length;
        int[] stack = new int[len];
        int top =-1;
        int sum=0;
        for(int i=0;i<len;i++){
            if(A[i].equals("+")){
                sum = stack[top-1]+stack[top];
                top = top-1;
                stack[top]=sum;
            }else if(A[i].equals("-")){
                sum = stack[top-1]-stack[top];
                top = top-1;
                stack[top]=sum;
            }else if(A[i].equals("*")){
                sum = stack[top-1]*stack[top];
                top = top-1;
                stack[top]=sum;
            }else if(A[i].equals("/")){
                sum = stack[top-1]/stack[top];
                top = top-1;
                stack[top]=sum;
            }else
            {
                stack[++top] = Integer.parseInt(A[i]);
                
            }
            /*for(int j=0;j<=top;j++)
            System.out.print(stack[j]+" ");
            System.out.println("top"+top);*/
        }
        return stack[top];
    }
}
