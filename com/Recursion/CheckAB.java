package com.Recursion;

public class CheckAB {
//    Suppose you have a string, S, made up of only 'a's and 'b's.
//    Write a recursive function that checks if the string was generated using the following rules:
//    a. The string begins with an 'a'
//    b. Each 'a' is followed by nothing or an 'a' or "bb"
//    c. Each "bb" is followed by nothing or an 'a'
      public static boolean checkAB(String input) {
          if(input.length()==0){
              return true;
          }
          if(input.charAt(0)=='a') {
              if (input.substring(1).length() > 1 && input.substring(1, 3).equals("bb")) {
                  return checkAB(input.substring(3));
              } else {
                  return checkAB(input.substring(1));
              }
          }
          return false;
      }
    public static boolean check_AB(String input) {
        if(input.length()==1 || input.length()==0){
            return true;
        }
        if(input.charAt(0)=='a'){
            if(input.charAt(0+1)=='a'){
                return check_AB(input.substring(1));
            }
            if(input.charAt(0+1)=='b' &&  input.charAt(0+2)=='b'){
                return check_AB(input.substring(3));
            }
        }
        return false;

    }
}
