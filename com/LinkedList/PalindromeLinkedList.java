package com.LinkedList;

public class PalindromeLinkedList {
    public static boolean isPalindrome(Node<Integer> head) {
        //Your code goes here
        if(head == null || head.next == null){
            return true;
        }

        Node slow=head;
        Node fast=head;

        //find middle of linkedlist
        while(fast.next != null && fast.next.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        //reverse list and slow will be starting point or reverse nlist
        slow=reverseList(slow.next);

        while(slow != null){
            if(head.data.equals(slow.data)){
                head=head.next;
                slow=slow.next;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static Node<Integer> reverseList(Node<Integer> head){
        Node<Integer> next=null;
        Node<Integer> prev=null;
        while(head != null){
            next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        return prev;
    }
}
