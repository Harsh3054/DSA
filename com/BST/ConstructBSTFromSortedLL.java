package com.BST;

import com.BinaryTree.BinaryTreeNode;
import com.LinkedList.Node;

public class ConstructBSTFromSortedLL {
    public static Node<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {

        return helper(root).head;
    }
    public static doublenode helper(BinaryTreeNode<Integer> root){

        if(root==null){
            doublenode node=new doublenode();
            node.head=null;
            node.tail=null;
            return node;
        }

        if(root.left==null &&root.right==null){
            Node<Integer> rootnode=new Node<>(root.data);
            doublenode node=new doublenode();
            node.head=rootnode;
            node.tail=rootnode;
            return node;
        }

        Node<Integer> centralnode=new Node<>(root.data);

        doublenode leftnode=helper(root.left);

        doublenode rightnode=helper(root.right);

        centralnode.next=rightnode.head;

        doublenode temp=new doublenode(); //temp have to written

        if(leftnode.tail!=null){
            leftnode.tail.next=centralnode;
            temp.head=leftnode.head;
        }
        else{
            temp.head=centralnode;
        }

        if(rightnode.tail!=null){
            temp.tail=rightnode.tail;
        }
        else{
            temp.tail=centralnode;
        }

        return temp;
    }
}
class doublenode{

    Node<Integer> head;
    Node<Integer> tail;

}

