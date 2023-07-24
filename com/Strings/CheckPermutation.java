package com.Strings;

public class CheckPermutation {
    public static boolean isPermutation(String str1, String str2) {
//        Two strings are said to be a permutation of each other
//        when either of the string's characters can be rearranged so that
//        it becomes identical to the other one.
        int[] arr= new int[256];
        boolean istrue=false;
        if(str1.length()==str2.length()){
            for(int i=0;i<str1.length();i++){
                arr[str1.charAt(i)]+=1;
            }
            for(int j=0;j<str2.length();j++){
                arr[str2.charAt(j)]-=1;
            }
        }
        else{
            return false;
        }
        for(int k=0;k< str2.length();k++){
            if(arr[str2.charAt(k)]==0){
                continue;
            }
            else{
                istrue=true;
                break;
            }
        }
        if(istrue){
            return false;
        }
        return true;
    }
}

