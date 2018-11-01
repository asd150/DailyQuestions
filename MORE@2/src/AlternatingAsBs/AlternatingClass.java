package AlternatingAsBs;

import java.util.Stack;

public class AlternatingClass {

    public void alternating(String str){
        //create stack
        Stack<Character> stack = new Stack<>();
        int delete =0;

        for(int i=0;i<str.length();i++){
            if(i==0){
                stack.push(str.charAt(i));
            }
            else{
                if(str.charAt(i)!=stack.peek()){
                    stack.push(str.charAt(i));
                }
                else{
                    delete++;
                }
            }
        }
        System.out.println(delete);
    }
}
