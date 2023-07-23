package com.Strings;

public class Allsubstrings_2 {


    public static void Allsubstrings_2(String str){

        for(int len=1;len<=str.length();len++){
            //First printing 1 length string then 2 and so on
            for (int start = 0; start <=str.length()-len; start++) {
                int end=start+len;
                System.out.println(str.substring(start,end));
            }
        }

    }
}
