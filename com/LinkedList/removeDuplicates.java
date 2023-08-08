package com.LinkedList;

public class removeDuplicates {
    public static Node<Integer> removeDuplicates(Node<Integer> head) {
        //Your code goes here
        if(head==null){
            return head;
        }
        Node<Integer> temp=head.next;
        Node<Integer> prev=head;
        while(temp != null){
            if(prev.data.equals(temp.data)){
                temp=temp.next;
            }
            else{
                prev.next=temp;
                prev=temp;
                temp=temp.next;
            }
        }
        prev.next=null;
        return head;
    }
    public static Node<Integer> removeDuplicates2(Node<Integer> head){
        if(head==null){
            return head;
        }
        Node<Integer> currHead=head;
        while(currHead.next!=null){
            if(currHead.data.equals(currHead.next.data)){
                currHead.next=currHead.next.next;
            }
            else{
                currHead=currHead.next;
            }
        }
        return head;

    }
}
