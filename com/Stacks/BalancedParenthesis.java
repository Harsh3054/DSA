package com.Stacks;

import java.util.Stack;

public class BalancedParenthesis {
    public static boolean isBalanced(String str)  {
        if(str.length()%2!=0){
            return false;
        }
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='{' || str.charAt(i)=='[' || str.charAt(i)=='('){
                s.push(str.charAt(i));
            }else if(str.charAt(i)=='}' || str.charAt(i)==']' || str.charAt(i)==')'){
                if(s.size()>0 && s.peek()!=str.charAt(i) ){
                    s.pop();
                }else{
                    return false;
                }
            }
        }
        if(s.size()==0){
            return true;
        }else{
            return false;
        }
    }
}
