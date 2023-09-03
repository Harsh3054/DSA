package com.LinkedList;

public class LengthOfLL {
    public static int length(Node<Integer> head){

        if(head == null){
            return 0;
        }
        int count=1;
        while(head.next != null){
            count++;
            head=head.next;
        }
        return count;
        //Your code goes here
    }
}
