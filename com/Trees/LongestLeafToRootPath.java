package com.Trees;

import com.BinaryTree.BinaryTreeNode;

import java.util.ArrayList;

public class LongestLeafToRootPath {

    public static ArrayList<Integer> longestRootToLeafPath(BinaryTreeNode<Integer> root){
     if(root==null){
        ArrayList<Integer> output=new ArrayList<>();
        return output;
    }

    ArrayList<Integer> left=longestRootToLeafPath(root.left);

    ArrayList<Integer> right=  longestRootToLeafPath(root.right);


        if(left.size()>right.size()){
        left.add(root.data);
    }
        else{
        right.add(root.data);
    }

        if(left.size()>right.size()){
        return left;
    }
        return right;
}
}
