package com.Strings;

public class HighestOccuringCharacter {
    public static char highestOccuringChar(String str) {
        int[] Freq =new int[256];
        for(int i=0;i<str.length();i++){
            Freq[str.charAt(i)]+=1;
        }

        char ch=str.charAt(0);
        int max=Freq[str.charAt(0)];
        for(int j=1;j<str.length();j++){
            if(Freq[str.charAt(j)]>max){
                max=Freq[str.charAt(j)];
                ch=str.charAt(j);
            }
        }
//        input=aaabbccdsa
//        output=a3b2c2dsa
        return ch;
    }
}
