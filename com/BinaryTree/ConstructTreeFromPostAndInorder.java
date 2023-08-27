package com.BinaryTree;



public class ConstructTreeFromPostAndInorder {

    public static BinaryTreeNode<Integer> buildTree(int[] postOrder,int[] inOrder){
        int n= postOrder.length;
        int postStart=0;
        int postEnd=n-1;
        int inStart=0;
        int inEnd=n-1;
        return buildTreeHelper(inOrder,postOrder,inStart,inEnd,postStart,postEnd);


    }


    private static BinaryTreeNode<Integer> buildTreeHelper(int[] inOrder,int[] postOrder,int inStart,int inEnd,int postStart,int postEnd){
        if(inStart>inEnd){
            return null;
        }
        int rootData=postOrder[postEnd];
        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(rootData);
        int k=0;
        for (int i = inStart; i <=inEnd ; i++) {
            if(inOrder[i]==rootData){
                k=i;
                break;
            }
        }
        root.left=buildTreeHelper(inOrder,postOrder,inStart,k-1,postStart,postStart+k-inStart-1);
        root.right=buildTreeHelper(inOrder,postOrder,k+1,inEnd,postStart+k-inStart,postEnd-1);
        return root;
    }


    public static BinaryTreeNode<Integer> buildTree2(int[] postOrder, int[] inOrder) {
        //Your code goes here
        int[] storage=new int[1];
        storage[0]=postOrder.length-1;
        return helper(postOrder,inOrder,0,inOrder.length-1,storage);
    }
    public static BinaryTreeNode<Integer> helper(int[]postOrder,int[]inOrder,int sI,int eI,int[] storage){

        if(sI>eI){
            return null;
        }

        int element=storage[0];
        int search=postOrder[element];
        int count=0;
        for(int i=sI;i<=eI;i++){
            if(search == inOrder[i]){
                break;
            }
            else{
                count++;
            }
        }
        element--;
        storage[0]=element;
        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(search);

        BinaryTreeNode<Integer> rightnode=helper(postOrder,inOrder,sI+count+1,eI,storage);
        BinaryTreeNode<Integer> leftnode=helper(postOrder,inOrder,sI,sI+count-1,storage);

        root.right=rightnode;
        root.left=leftnode;
        return root;

    }
}
