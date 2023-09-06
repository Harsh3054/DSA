package com.Strings;

public class CountWithKDiff {
    public static int countSubStrings(String str, int k) {
        // Write your code here.
        int ans=0;
        for(int i=0;i<str.length();i++){
            int j=i;
            int count=1;
            while(j<str.length() && count<k){
                if(count<k && str.charAt(j)!=str.charAt(j+1)){
                    j++;
                    count++;
                }
                else if(count<k && str.charAt(j)==str.charAt(j+1)){
                    j++;
                }
            }
            ans+=1;

        }
        return ans;
    }
}
