package com.Recursion;

public class ReplaceCharacter {

    public static String replaceCharacter(String input, char c1, char c2) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        String ans="";
        return replace_Character(input,c1,c2,0,ans);

    }
    private static String replace_Character(String input,char c1,char c2,int startIndex,String ans){

        if(startIndex==input.length()){
            return ans;
        }
        if(input.charAt(startIndex)==c1){
            ans+=c2;
        }
        else{
            ans+=input.charAt(startIndex);
        }
        return replace_Character(input,c1,c2,startIndex+1,ans);
    }
    public static String replaceChar(String input,char c1,char c2){
        if(input.length()==0){
            return "";
        }
        char c;
        if(input.charAt(0)==c1){
            c=c2;
        }
        else{
            c=input.charAt(0);

        }
        String ans=replaceChar(input.substring(1),c1,c2);
        return (c+ans);
    }
}
