package com.BST;

import com.BinaryTree.BinaryTreeNode;

import java.util.ArrayList;

public class FindPathInBST {

    public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root,int k){
        if(root==null){
            return null;
        }
        if(root.data==k){
            ArrayList<Integer> output=new ArrayList<>();
            output.add(root.data);
            return output;
        }
        else if(k<root.data){
            ArrayList<Integer> leftOutput=getPath(root.left,k);
            if(leftOutput!=null){
                leftOutput.add(root.data);
            }
            return leftOutput;
        }else{
            ArrayList<Integer> rightOutput=getPath(root.right,k);
            if(rightOutput!=null){
                rightOutput.add(root.data);
            }
            return rightOutput;
        }
    }
}
