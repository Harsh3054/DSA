package com.BST;

import com.BinaryTree.BinaryTreeNode;

public class IsBST {
    public static boolean isBST(BinaryTreeNode<Integer> root) {
        return helper(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    public static boolean helper(BinaryTreeNode<Integer> root,int minvalue,int maxvalue){
        if(root==null){
            return true;
        }
        if(root.data>maxvalue || root.data<minvalue){
            return false;
        }

        return helper(root.left,minvalue,root.data) && helper(root.right,root.data,maxvalue);




    }
}
