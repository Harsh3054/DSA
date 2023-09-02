package com.BST;

import com.BinaryTree.BinaryTreeNode;

public class LargestBST {
    //Given a Binary tree, find the largest BST subtree.
    // That is, you need to find the BST with maximum height in the given binary tree.
    // You have to return the height of largest BST.
    public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {

        if(root == null) {
            return 0;
        }
        return helper(root).height;
    }
    public static Quadruple helper(BinaryTreeNode<Integer> root) {

        if(root == null) {

            Quadruple q = new Quadruple();
            q.max = Integer.MIN_VALUE;
            q.min = Integer.MAX_VALUE;
            q.height = -1;
            q.isBST = true;
            return q;
        }
        Quadruple left = helper(root.left);
        Quadruple right = helper(root.right);
        Quadruple output = new Quadruple();
        if(left.height == -1 && right.height == -1) {
            output.max = root.data;
            output.min = root.data;
            output.height = 1;
            output.isBST = true;
        }
        else if((left.isBST == true && right.isBST == true) && (root.data > left.max && root.data < right.min)) {
            output.max = Math.max(root.data , Math.max(left.max , right.max));
            output.min = Math.min(root.data , Math.min(left.min , right.min));
            output.height = 1 + Math.max(left.height , right.height);
            output.isBST = true;
        }
        else {
            output.max = Math.max(left.max , right.max);
            output.min = Math.min(left.min , right.min);
            output.height = Math.max(left.height , right.height);
            output.isBST = false;
        }
        return output;
    }
}
class Quadruple {
    int max ;
    int min ;
    int height;
    boolean isBST;
}
