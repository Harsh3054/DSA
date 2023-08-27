package com.BinaryTree;

import javax.print.attribute.standard.NumberOfInterveningJobs;

public class Diameter {
    public static Pair<Integer,Integer> heightDiameter(BinaryTreeNode<Integer> root){
        if(root==null){
            Pair<Integer,Integer> output=new Pair<>(0,0);
            return output;
        }
        Pair<Integer,Integer> lo=heightDiameter(root.left);
        Pair<Integer,Integer> ro=heightDiameter(root.right);
        int height=1+Math.max(lo.height,ro.height);
        int option1= lo.diameter+ ro.diameter;
        int option2=lo.diameter;
        int option3=ro.diameter;
        int diameter=Math.max(option1,Math.max(option2,option3));
        Pair<Integer,Integer> output=new Pair<>(height,diameter);
        return output;
    }
}
class Pair<T,V>{
    T height;
    V diameter;

    public Pair(T height,V diameter){
        this.height=height;
        this.diameter=diameter;
    }
}