package com.Recursion;

public class ReturnAllCodes {

//    input->1123
//    output->aabc
//    kbc
//    alc
//    aaw
//    kw
public static  String[] getCode(String input){
    if(input.length()==0){
        String[] ans= {""};
        return ans;
    }

    String[] output1=getCode(input.substring(1));
    String[] output2= new String[0];

    int firstNumber=(input.charAt(0)-'0');
    int twoDigitNumber=0;

    if(input.length()>=2){
        twoDigitNumber=(firstNumber*10)+(input.charAt(1)-'0');
        if(twoDigitNumber>=10 && twoDigitNumber<=26){
            output2=getCode(input.substring(2));
        }
    }
    String[] output= new String[output1.length+output2.length];
    int k=0;
    for(int i=0;i< output1.length;i++){
        char ch=getchar(firstNumber);
        output[k]=ch+output1[i];
        k++;
    }
    for(int i=0;i< output2.length;i++){
        char ch=getchar(twoDigitNumber);
        output[k]=ch+output2[i];
        k++;
    }
    return output;

}
    public static char getchar(int n){
        return (char) (n+96);
    }
}
