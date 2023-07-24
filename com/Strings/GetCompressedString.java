package com.Strings;

public class GetCompressedString {
    public static String getCompressedString(String str){
        int length=str.length();
        String compressedString="";
        int startIndex=0;
        int endIndex=0;
        while(startIndex<length){
            while(endIndex<length && str.charAt(endIndex)==str.charAt(startIndex)){
                endIndex++;
            }
            int totalCount=endIndex-startIndex;
            //If count is greater than 1 then append count to the string else only character
            if(totalCount!=1){
                compressedString=compressedString+str.charAt(startIndex)+totalCount;
            }
            else{
                compressedString+=str.charAt(startIndex);
            }
            startIndex=endIndex;
        }
        return compressedString;
    }
}
