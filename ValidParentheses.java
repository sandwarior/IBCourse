/*https://leetcode.com/problems/valid-parentheses/submissions/*/

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>(); 
        int len = s.length();
        char c;
        for(int i=0;i<len;i++){
            c = s.charAt(i);
            if( c=='('|| c=='{' || c=='[')
                stack.push(c);
            else if(!stack.empty() && (c==')' && stack.peek()=='('))
               stack.pop();
            else if(!stack.empty() && (c=='}' && stack.peek()=='{'))
               stack.pop();
            else if(!stack.empty() && (c==']' && stack.peek()=='['))
               stack.pop();
            else
               return false;
            
        }
              //  System.out.println(stack.empty());   
                    if(stack.empty())
                    return true;
                    else
                    return false;
    }
}
               
