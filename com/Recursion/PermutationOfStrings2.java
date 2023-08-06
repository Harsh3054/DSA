package com.Recursion;

public class PermutationOfStrings2 {

    public static String[] permutationOfString(String str){
        if(str.length()==0){
            String[] output={""};
            return output;
        }
        String[] smallerOutput=permutationOfString(str.substring(1));

        String[] output=new String[str.length()*smallerOutput.length];

        int k=0;
        for (int i = 0; i < smallerOutput.length; i++) {
            String currentString=smallerOutput[i];
            for (int j = 0; j <=currentString.length(); j++) {
                output[k]=currentString.substring(0,j)+str.charAt(0)+currentString.substring(j);
                k++;
            }


        }
        return output;
    }
}
