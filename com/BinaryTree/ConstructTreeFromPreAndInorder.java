package com.BinaryTree;

public class ConstructTreeFromPreAndInorder {


//            7
//            1 2 4 5 3 6 7
//            4 2 5 1 6 3 7
    //output->
//            1
//            2 3
//            4 5 6 7
    public static BinaryTreeNode<Integer> buildTree(int[] in,int[] pre){
        return buildTreeHelper(in,pre,0,in.length-1,0,pre.length-1);


    }
    public static BinaryTreeNode<Integer> buildTreeHelper(int[] in,int[] pre,int inS,int inE,int preS,int preE){
        if(inS>inE){
            return null;
        }
        int rootData=pre[preS];
        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(rootData);
        int rootIndex=-1;
        for (int i = inS; i <=inE ; i++) {
            if(in[i]==rootData){
                rootIndex=i;
                break;
            }
        }
        if(rootIndex==-1){
            return null;
        }

        int leftInS=inS;
        int leftInE=rootIndex-1;
        int leftPreS=preS+1;
        int leftPreE=leftInE-leftInS+leftPreS;

        int rightInS=rootIndex+1;
        int rightInE=inE;
        int rightPreS=leftPreE+1;
        int rightPreE=preE;

        root.left=buildTreeHelper(in,pre,leftInS,leftInE,leftPreS,leftPreE);

        root.right=buildTreeHelper(in,pre,rightInS,rightInE,rightPreS,rightPreE);


        return root;
    }


    public static BinaryTreeNode<Integer> buildTree2(int[] preOrder, int[] inOrder) {
        //Your code goes here
        return helper(preOrder,inOrder,0,inOrder.length-1,0);
    }
    public static BinaryTreeNode<Integer> helper(int[] preorder,int[] inorder,int sI,int eI,int prestart){

        if(sI==eI){
            BinaryTreeNode<Integer> root=new BinaryTreeNode<>(inorder[sI]);
            return root;
        }
        else if(sI>eI){
            BinaryTreeNode<Integer> root=null;
            return root;
        }
        BinaryTreeNode<Integer> root= new BinaryTreeNode<>(preorder[prestart]);
        int count=0;
        int element=root.data;
        for(int i=sI;i<=eI;i++){
            if(element != inorder[i]){
                count++;
            }
            else{
                break;
            }
        }


        BinaryTreeNode<Integer> leftnode=helper(preorder,inorder,sI,sI+count-1,prestart+1);

        BinaryTreeNode<Integer> rightnode=helper(preorder,inorder,sI+count+1,eI,prestart+1+count);

        root.left=leftnode;
        root.right=rightnode;
        return root;


    }
}
