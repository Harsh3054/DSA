package com.Recursion;

public class KeypadCode {

    public static String[] keypad(int n){
        if(n==0){
            String[] ans={""};
            return ans;
        }

        int ans=n%10;
        String[] output=character(ans);
        String[] ansarray=keypad(n/10);
        String[] finalans=new String[ansarray.length* output.length];
        int k=0;
        for(int i=0;i<ansarray.length;i++){
            for(int j=0;j< output.length;j++){
                finalans[k]=ansarray[i]+output[j];
                k++;
            }
        }
        return finalans;

    }
    public static String[] character(int n){

        String[] ans=new String[]{""};
        switch(n){
            case 2:
                ans=new String[]{"a", "b", "c"};
                return ans;
            case 3:
                ans=new String[]{"d","e","f"};
                return ans;
            case 4:
                ans=new String[]{"g","h","i"};
                return ans;
            case 5:
                ans=new String[]{"j","k","l"};
                return ans;
            case 6:
                ans=new String[]{"m","n","o"};
                return ans;
            case 7:
                ans= new String[]{"p","q","r","s"};
                return ans;
            case 8:
                ans=new String[]{"t","u","v"};
                return ans;
            case 9:
                ans=new String[]{"w","x","y","z"};
                return ans;
        }
        return ans;
    }


    public static void printKeypad(int input){
        String ans="";
        printkeypad(input,ans);
        // Write your code here

    }
    public static void printkeypad(int n, String ans){

        if(n==0){
            System.out.println(ans);
            return;
        }
        int lastdigit=n%10;
        String[] output= character(lastdigit);
        for(int i=0;i< output.length;i++){
            printkeypad(n/10,output[i]+ans);
        }
    }

}
