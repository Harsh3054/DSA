package com.BST;

import com.BinaryTree.BinaryTreeNode;

public class BinarySearchTree {
    private BinaryTreeNode<Integer> root;

    public void insert(int data) {

        root=insertHelper(root,data);
        //Implement the insert() function
    }

    private BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer> root,int data){

        if(root==null){
            BinaryTreeNode<Integer> node=new BinaryTreeNode<>(data);
            return node;
        }

        if(root.data<data){
            root.right=insertHelper(root.right,data);
            //return root;
            //call on right
        }
        else{
            root.left=insertHelper(root.left,data);
            // return root;
            //call on left
        }
        return root;
    }

    public void remove(int data) {
        root=removeHelper(root,data);
        //Implement the remove() function
    }

    private BinaryTreeNode<Integer> removeHelper(BinaryTreeNode<Integer> root,int data){

        if(root==null ){
            return null;
        }
        if(root.data==data){
            if(root.left==null && root.right==null){
                return null;
            }
            else if(root.left==null && root.right!=null){
                return root.right;
            }
            else if(root.right==null && root.left!=null){
                return root.left;
            }
            else{
//                int[] arr=new int[1];
//                arr[0]=Integer.MAX_VALUE;
//                //find minimum from right side and replace it with current node and delete that minimum from right side
//                minimumHelper(root.right,arr);
//                //here I will have minimum from right side in array
//                root.data=arr[0];
//                root.right=removeHelper(root.right,arr[0]);
//                return root;
                BinaryTreeNode<Integer> minNode=root.right;
                while(minNode.left!=null){
                    minNode=minNode.left;
                }
                root.data=minNode.data;
                root.right=removeHelper(root.right,minNode.data);
                return root;
            }

        }

        else if(root.data<data){
            root.right=removeHelper(root.right,data);
            return root;
            //call on right
        }
        else{
            root.left=removeHelper(root.left,data);
            return root;
            //call on left
        }

    }

    private void minimumHelper(BinaryTreeNode<Integer> root,int[] arr){
        if(root==null){
            return;
        }
        if(root.data<arr[0]){
            arr[0]=root.data;
            minimumHelper(root.left,arr);
        }
    }

    public void printTree() {
        printTreeHelper(root);
        //Implement the printTree() function
    }
    private static void  printTreeHelper(BinaryTreeNode<Integer> root){
        if(root==null){
            return ;
        }
        String ans=root.data+":";
        if(root.left!=null){
            ans+="L:"+root.left.data+",";
        }
        if(root.right!= null){
            ans+="R:"+root.right.data;
        }
        System.out.println(ans);
        printTreeHelper(root.left);
        printTreeHelper(root.right);

    }

    public boolean search(int data) {

        return searchHelper(root,data);
        //Implement the search() function
    }

    private boolean searchHelper(BinaryTreeNode<Integer> root,int data){

        if(root==null){
            return false;
        }
        if(root.data==data){
            return true;
        }
        if(data>root.data){
            return searchHelper(root.right,data);
        }
        else{
            return searchHelper(root.left,data);
        }


    }
}
