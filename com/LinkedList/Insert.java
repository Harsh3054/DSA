package com.LinkedList;

public class Insert {
    public static Node<Integer> insert(Node<Integer> head, int data, int pos){
        Node<Integer> newNode=new Node<>(data);

        if(pos==0){
            newNode.next=head;
            return newNode;
        }

        int i=0;
        Node<Integer> temp=head;
        while(i<pos-1){

            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        return head;
    }
    public static Node<Integer> insertRec(Node<Integer> head,int pos,int ele){
        if(pos==0){
            Node<Integer> newNode=new Node<>(ele);
            newNode.next=head;
            return newNode;
        }

        if(head==null){
            return head;
        }
        head.next=insertRec(head.next,pos-1,ele);
        return head;
    }
}
