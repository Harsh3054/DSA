package com.LinkedList;

public class Kreverse {

    public static Node<Integer> kReverse(Node<Integer> head,int k){
        if(k==0 || k==1){
            return head;
        }
        int count=0;
        Node<Integer> curr=head;
        Node<Integer> prev=null,fwd=null;
        while(count<k && curr!=null){
            fwd=curr.next;
            curr.next=prev;
            prev=curr;
            curr=fwd;
            count++;
        }
        if(fwd!=null){
            head.next=kReverse(fwd,k);
        }
        return prev;
    }
}
