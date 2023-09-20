package com.Recursion;

import java.util.ArrayList;
import java.util.List;

public class BinaryStringWithNoConse1 {
    public static List< String > generateString(int N) {
        // Write your code here.
        if(N==0){
            return new ArrayList<>();
        }
        List<String> ans=new ArrayList<>();
        List<String> small=generateString(N-1);
        if(small.isEmpty()){
            small.add("0");
            small.add("1");
            return small;
        }
        int count=0;
        while(count<2){
            for(int i=0;i<small.size();i++){
                String individual=small.get(i);
                if(count==0){
                    String every=Integer.toString(count)+individual;
                    ans.add(every);
                }
                else if(count==1 && individual.charAt(0)!='1'){
                    String every=Integer.toString(count)+individual;
                    ans.add(every);
                }
            }
            count++;
        }
        return ans;

    }
}
