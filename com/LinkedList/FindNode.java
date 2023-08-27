package com.LinkedList;

public class FindNode {
    public static int findNode(Node<Integer> head,int n){
        int pos=0;
        while(head!=null){
            if(head.data.equals(n)){
                return pos;
            }
            head=head.next;
            pos++;
        }
        return -1;
    }
}
