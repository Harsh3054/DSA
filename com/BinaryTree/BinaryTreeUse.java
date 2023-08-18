package com.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTreeUse {
    public static BinaryTreeNode<Integer> takeInput(Scanner s){
        int rootData;
        System.out.println("Enter root data");
        rootData=s.nextInt();
        if(rootData==-1){
            return null;
        }
         BinaryTreeNode<Integer> root=new BinaryTreeNode<>(rootData);
        root.left=takeInput(s);
        root.right=takeInput(s);
        return root;
    }

    public static BinaryTreeNode<Integer> takeInputLevelWise(){
        Scanner s=new Scanner(System.in);
        Queue<BinaryTreeNode<Integer>> pendingNodes=new LinkedList<>();
        System.out.println("Enter root data ");
        int rootData=s.nextInt();
        if(rootData==-1){
            return null;
        }
        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(rootData);
        pendingNodes.add(root);
        while(!pendingNodes.isEmpty()){
            BinaryTreeNode<Integer> front=pendingNodes.poll();
            System.out.println("Enter left child of "+front.data);
            int leftChild=s.nextInt();
            if(leftChild!=-1){
                BinaryTreeNode<Integer> child=new BinaryTreeNode<>(leftChild);
                pendingNodes.add(child);
                front.left=child;
            }
            System.out.println("Enter right child of "+front.data);
            int rightChild=s.nextInt();
            if(rightChild!=-1){
                BinaryTreeNode<Integer> child=new BinaryTreeNode<>(rightChild);
                pendingNodes.add(child);
                front.right=child;
            }

        }
        return root;
    }
    public static void printTree(BinaryTreeNode<Integer> root){
        if(root==null){
            return;
        }
        String s=root.data+" ";
        if(root.left!=null){
            s+="L:"+root.left.data;
        }
        if(root.right!=null){
            s+="R:"+root.right.data;
        }
        System.out.println(s);
        printTree(root.left);
        printTree(root.right);
    }

    public static void printLevelWise(BinaryTreeNode<Integer> root) {
        //Your code goes here
        Queue<BinaryTreeNode<Integer>> pending=new LinkedList<>();
        if(root==null){
            return;
        }
        pending.add(root);
        while(!pending.isEmpty()){

            BinaryTreeNode<Integer> front=pending.poll();
            int leftend,rightend;
            if(front.left != null){
                leftend=front.left.data;
                pending.add(front.left);
            }
            else{
                leftend=-1;
            }

            if(front.right != null){
                rightend=front.right.data;
                pending.add(front.right);
            }
            else{
                rightend=-1;
            }
            System.out.println(front.data+":"+"L:"+leftend+","+"R:"+rightend);

        }
    }
    public static void main(String[] args) {
        //Scanner s=new Scanner(System.in);
       int[] postOrder={4,5,2,6,7,3,1};
       int[] inOrder={4,2,5,1,6,3,7};
       BinaryTreeNode<Integer> root=ConstructTreeFromPostAndInorder.buildTree(postOrder,inOrder);
       printLevelWise(root);
    }
}
