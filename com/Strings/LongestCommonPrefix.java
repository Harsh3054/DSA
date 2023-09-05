package com.Strings;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs){
        if(strs.length==0) return "";
        String pref=strs[0];
        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(pref)!=0){
                System.out.println(strs[i].indexOf(pref));
                pref=pref.substring(0,pref.length()-1);
            }
        }
        return pref;
    }
}
