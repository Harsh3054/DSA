package com.Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

//        int[] num1={1,2,3,0,0,0};
//        int[] num2={2,5,6};
//        MergeSorted.merge(num1,3,num2,3);
//        for(int i:num1){
//            System.out.print(i+" ");
//        }
        //System.out.println(NthRoot(9,1953125));
//        int[] arr={44,22,33,11,1};
//        System.out.println(LeetCode1283.smallestDivisor(arr,5));
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        for(int i=0;i< 3;i++){
            ArrayList<Integer> ans=new ArrayList<>(5);
            for(int j=0;j<3;j++){
                int ele=s.nextInt();
                ans.add(ele);
            }
            arr.add(ans);
        }
        System.out.print(RowWithMax1s.maximumOnesRow(arr,5,5));
    }
    public static int NthRoot(int n, int m) {
        // Write your code here.

        for(int i=1;Math.pow(i, n)<=m;i++){
            if(Math.pow(i, n)==m) return i;
        }
        return -1;
    }
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i),1);
            }
        }
        for(int j=0;j<t.length();j++){
            if(map.containsKey(t.charAt(j)) && map.get(t.charAt(j))>=1){
                map.put(t.charAt(j),map.get(t.charAt(j))-1);
            }else{
                return false;
            }
        }
        return true;
    }
    public static void helper(ArrayList arr){

    }
    public static void sortArray(ArrayList<Integer> arr, int n) {
        // Write your code here.
        int low=0;
        int mid=0;
        int high=n-1;
        while(mid<high){
            if(arr.get(mid)==0){
                swap(low,mid,arr);
                low++;
                mid++;
            }else if(arr.get(mid)==1){
                mid++;
            }else if(arr.get(mid)==2){
                swap(high,mid,arr);
                high--;
            }
        }

    }
    public static void swap(int a,int b,ArrayList arr){
        int temp= (int) arr.get(a);
        arr.set(a,arr.get(b));
        arr.set(b, temp);
    }
}
