package com.LinkedList;

public class AppendLastNToFirst {
    public static Node<Integer> appendLastNToFirst(Node<Integer> head,int n){

        if(n==0 || head==null){
            return head;
        }
        Node<Integer> fast=head;
        Node<Integer> slow=head;
        Node<Integer> initialHead=head;

        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        Node<Integer> temp=slow.next;
        slow.next=null;
        fast.next=initialHead;
        head=temp;
        return head;
    }
    public static Node<Integer> appendLastNToFirst2(Node<Integer> head, int n) {
        //Your code goes here
        if(head==null){
            return head;
        }
        if(n==0){
            return head;
        }
        Node<Integer> temp=head;
        int i=1; //for counting total nodes in LL
        while(temp.next != null){
            temp=temp.next;
            i++;
        }

        Node<Integer> newhead=head;
        Node<Integer> prev=null;
        int j=0;
        while(i-j != n){
            if(i-j-1==n){
                prev=newhead;
            }
            newhead=newhead.next;
            j++;
        }
        temp.next=head; //here i am making new connection to tail which will be head
        prev.next=null; //before returning new head prev one which was pointing to new head should be null
        return newhead;//otherwise it will become circular linked list

    }
}
