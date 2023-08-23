package com.BST;

import com.BinaryTree.BinaryTreeNode;

public class ConstructBSTFromSortedArray {
    public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){

        int sI=0;
        int eI=arr.length-1;
        return helper(arr,sI,eI);
    }
    public static BinaryTreeNode<Integer> helper(int[] arr,int sI,int eI){


        if(sI>eI){
            return null;
        }
        int mid=(sI+eI)/2;

        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(arr[mid]);

        BinaryTreeNode<Integer> leftnode=helper(arr,sI,mid-1);

        BinaryTreeNode<Integer> rightnode=helper(arr,mid+1,eI);

        root.left=leftnode;
        root.right=rightnode;
        return root;


    }
}
