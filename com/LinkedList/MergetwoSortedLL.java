package com.LinkedList;

public class MergetwoSortedLL {
    public static Node<Integer> mergeTwoSortedLinkedLists(Node<Integer> head1, Node<Integer> head2) {
        //Your code goes here

        if(head1 ==null){
            return head1;
        }
        if(head1 == null && head2 != null ){
            return head2;
        }
        if(head2 == null && head1 != null){
            return head1;
        }

        Node<Integer> head=null;
        Node<Integer> tail=null;
        Node<Integer> temp1=head1;
        Node<Integer> temp2=head2;

        if(temp1.data < temp2.data){
            head=temp1;
            tail=temp1;
            temp1=temp1.next;
        }
        else{
            head=temp2;
            tail=temp2;
            temp2=temp2.next;
        }

        while(temp1 != null && temp2 != null){
            if(temp1.data < temp2.data){
                tail.next=temp1;
                tail=temp1;
                temp1=temp1.next;
            }
            else{
                tail.next=temp2;
                tail=temp2;
                temp2=temp2.next;
            }
        }
        if(temp1 == null){
            tail.next=temp2;
            tail=temp2;
            return head;
        }
        else{
            tail.next=temp1;
            tail=temp1;
            return head;
        }

    }
}
