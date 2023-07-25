package com.Strings;

public class MinimumWordLength {
    public static String minLengthWord(String input){
        String ans="";
        int minlength=Integer.MAX_VALUE;
        int start=0;
        int startindex=0;
        int endindex=0;
        int i=0;
        for(;i<input.length();i++){
            if(input.charAt(i) == ' '){
                int length =i-start;
                if(length<minlength){
                    minlength=length;
                    endindex=i;
                    startindex=start;
                }
                start=i+1;//This is for finding length if at index 4 I am getting length
                //so start should be 5 why?because  //aaaa aa aaaaa
                //In above example next time I will get space at 7 then length of word is 7-5=2
            }
        }

        int length =i-start;
        if(length<minlength){
            minlength=length;
            endindex=i;
            startindex=start;
        }
        ans=input.substring(startindex,endindex);
        return ans;
    }
}

