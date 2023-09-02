package com.BST;

import com.BinaryTree.BinaryTreeNode;

public class LCAOfBinaryTree {
//    Given a binary tree and data of two nodes, find 'LCA' (Lowest Common Ancestor)
//    of the given two nodes in the binary tree.
//    LCA
//    LCA of two nodes A and B is the lowest or deepest node which has
//    both A and B as its descendants.
    static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {

        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */

        return helper(root,a,b);

    }
    private static int helper(BinaryTreeNode<Integer> root, int a, int b){
        if(root==null){
            return -1;
        }

        // if(root.data==a || root.data==b){
        //     return root.data;
        // }

        int left=helper(root.left,a,b);
        int right=helper(root.right,a,b);
        if(left==-1 && right!=-1){
            return right;
        }
        else if(left!=-1&& right==-1){
            return left;
        }
        else if(left==-1&& right==-1){
            return -1;
        }
        else{
            return root.data;
        }

    }

    //2nd way
    static BinaryTreeNode<Integer> getLCAHelper(BinaryTreeNode<Integer> root,int a,int b ){
        if(root==null){
            return null;
        }
        if(root.data==a || root.data==b){
            return root;
        }
        BinaryTreeNode<Integer> leftLCA=getLCAHelper(root.left,a,b);
        BinaryTreeNode<Integer> rightLCA=getLCAHelper(root.right,a,b);
        if((leftLCA!=null) &&(rightLCA!=null)){
            return root;
        }
        if(leftLCA!=null){
            return leftLCA;
        }
        return rightLCA;
    }

    static int getLCA2(BinaryTreeNode<Integer> root,int a,int b){
        BinaryTreeNode<Integer> node=getLCAHelper(root,a,b);
        if(node!=null){
            return node.data;
        }
        else{
            return -1;
        }
    }

}
