package com.Recursion;

public class Pair_Star {
    public static String addStars(String s) {
        String ans="";
        return add_Stars(s,0,ans);
        // Write your code here

    }
    public static String addstars1(String s){
        if(s.length()<=1){
            return s;
        }
        String out=addstars1(s.substring(1));
        if(s.charAt(0)==s.charAt(1)){
            out=s.charAt(0)+"*"+s.charAt(1)+out.substring(1);
        }
        else{
            out=s.charAt(0)+out;
        }
        return out;
    }
    private static String add_Stars(String input,int startIndex,String ans){
        ans+=input.charAt(startIndex);
        if(startIndex==input.length()-1){
            return ans;
        }
        if(input.charAt(startIndex)==input.charAt(startIndex+1)){
            ans+='*';
        }
        return add_Stars(input,startIndex+1,ans);
    }
}
