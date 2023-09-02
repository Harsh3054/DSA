package com.BST;

import com.BinaryTree.BinaryTreeNode;

public class LCABST {
//    Given a binary search tree and data of two nodes, find
//    'LCA' (Lowest Common Ancestor) of the given two nodes in the BST.
//    LCA
//    LCA of two nodes A and B is the lowest or deepest node
//    which has both A and B as its descendants.
public static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {
    if (root == null)
        return -1;


    if (root.data > a && root.data > b)
        return getLCA(root.left, a, b);
    if (root.data < a && root.data < b)
        return getLCA(root.right, a, b);

    return root.data;
}
//2nd
    public static int getLCA2(BinaryTreeNode<Integer> root,int a,int b){
         BinaryTreeNode<Integer> node=helper(root,a,b);
         return (node==null)?-1: node.data;
    }
    public static BinaryTreeNode<Integer> helper(BinaryTreeNode<Integer> root,int a,int b){
        if(root==null || root.data==a||root.data==b){
            return root;
        }

        if(root.data<a && root.data<b){
            return helper(root.right, a, b);
        }
        else if(root.data>a && root.data>b){
            return helper(root.left, a, b);
        }
        BinaryTreeNode<Integer> leftLCA=helper(root.left, a, b);
        BinaryTreeNode<Integer> rightLCA=helper(root.right, a, b);
        if(leftLCA!=null && rightLCA!=null){
            return root;
        }
        else if(leftLCA!=null){
            return leftLCA;
        }
        else{
            return rightLCA;
        }

    }
}
