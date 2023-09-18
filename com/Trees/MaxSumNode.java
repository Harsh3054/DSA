package com.Trees;

import com.sun.source.tree.Tree;

public class MaxSumNode {
//    Given a tree, find and return the node for which sum of data of all children and
//    the node itself is maximum.
//    In the sum, data of node itself and data of immediate children is to be taken.
    public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
        return maxSumNodeHelper(root).node;
    }
    public static MaxSumNodePair<Integer> maxSumNodeHelper(TreeNode<Integer> root){
        if(root==null){
            MaxSumNodePair<Integer> ans=new MaxSumNodePair<>(null,Integer.MIN_VALUE);
            return ans;
        }
        int sum=root.data;
        for(TreeNode<Integer> child: root.children){
            sum+= child.data;
        }
        MaxSumNodePair<Integer> ans=new MaxSumNodePair<>(root,sum);
        for (TreeNode<Integer> child: root.children) {
            MaxSumNodePair<Integer> childAns=maxSumNodeHelper(child);
            if(childAns.sum> ans.sum){
                ans=childAns;
            }
        }
        return ans;
    }
    static class MaxSumNodePair<T>{
        TreeNode<Integer> node;
        int sum;
        public MaxSumNodePair(TreeNode<Integer> node,int sum){
            this.node=node;
            this.sum=sum;
        }
    }
}

