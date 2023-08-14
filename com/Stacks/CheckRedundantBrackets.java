package com.Stacks;

import java.util.Stack;

public class CheckRedundantBrackets {
//    For a given expression in the form of a string, find if there exist any redundant brackets or not.
//    It is given that the expression contains only rounded brackets or parenthesis and the input expression will always be balanced.
//    A pair of the bracket is said to be redundant when a sub-expression is surrounded by unnecessary or needless brackets.
//    Expression: (a+b)+c
//    Since there are no needless brackets, hence, the output must be 'false'.
//
//    Expression: ((a+b))
//    The expression can be reduced to (a+b).
//    Hence the expression has redundant brackets and the output will be 'true'.
public static boolean checkRedundantBrackets(String expression) {
    Stack<Character> s=new Stack<>();
    //Your code goes here
    int count;
    for(int i=0;i<expression.length();i++){
        if(expression.charAt(i) != ')'){
            s.push(expression.charAt(i));
        }
        else if(expression.charAt(i) ==')'){
            count=0;
            while(s.peek() != '('){
                s.pop();
                count++;
            }
            if (count == 1){
                return true;
            }
            else if(count > 0){
                s.pop();
                count=0;
            }
            else{
                return true;
            }
        }
    }
    return false;
}
}

