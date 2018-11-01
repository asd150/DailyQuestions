package StackProblems;

import java.util.Stack;

public class BracketBalances {
    public String findBalances(String s) {

        Stack<Character> stack = new Stack<>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) =='('){
                stack.push('(');
            }
            else if(s.charAt(i) == '{'){
                stack.push('{');
            }
            else if(s.charAt(i) == '['){
                stack.push('[');

            }
            else if(s.charAt(i) == ')' && !stack.empty()){
                if (stack.peek() == '('){
                    stack.pop();
                }
                else return "NO";
            }
            else if(s.charAt(i) == '}' && !stack.empty()){
                if(stack.peek() == '{'){
                    stack.pop();
                }
                else {
                    return "NO";
                }
            }
            else if(s.charAt(i) == ']' && !stack.empty()){
                if(stack.peek() == '['){
                    stack.pop();
                }
                else return "NO";
            }
            else return "NO";


        }
        if(!stack.empty()){
            return "NO";
        }
        return "YES";
    }
}
