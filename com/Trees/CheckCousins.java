package com.Trees;

import com.BinaryTree.BinaryTreeNode;

public class CheckCousins {
//    Given the binary Tree and two nodes say ‘p’ and ‘q’.
//    Determine whether the two nodes are cousins of each other or not.
//    Two nodes are said to be cousins of each other if they are at same level of the Binary Tree and have different parents.
//    Do it in O(n).
static int level1, level2, parent1, parent2 = 0;
public static boolean isCousin(BinaryTreeNode<Integer> root, int p, int q) {
    // Write your code here
    getDepth(root, p, q, 0);
    return level1 == level2 && parent1 != parent2;
}
    public static void getDepth(BinaryTreeNode<Integer> root, int x, int y, int level) {
        if (root == null) return;
        if ((root.left != null && root.left.data == x) || (root.right != null && root.right.data == x)) {
            level1 = level + 1;
            parent1 = root.data;
            return;
        }

        if ((root.left != null && root.left.data == y) || (root.right != null && root.right.data == y)) {
            level2 = level + 1;
            parent2 = root.data;
            return;
        } else {
            getDepth(root.left, x, y, level + 1);
            getDepth(root.right, x, y, level + 1);
        }
    }
}
