package com.LinkedList;

public class Midpoint {
    public static Node<Integer> midpoint(Node<Integer> head){
        if(head==null){
            return head;
        }
        Node<Integer> slow=head;
        Node<Integer> fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
