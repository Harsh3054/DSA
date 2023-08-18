package com.LinkedList;



public class BubbleSortLL {
    private static int length(Node<Integer> head){
        int count=0;
        while(head!=null){
            head=head.next;
            count++;
        }
        return count;
    }
    public static Node<Integer> bubbleSort(Node<Integer> head){
        int n=length(head);
        for(int i=0;i<n;i++){
            Node<Integer> prev=null;
            Node<Integer> curr=head;
            for(int j=0;j<(n-i+1);j++){
                if(curr.data<=curr.next.data){
                    prev=curr;
                    curr=curr.next;
                }else{
                    if(prev==null){
                        Node<Integer> fwd=curr.next;
                        head=head.next;//In each sub iteration head will be changing
                        //so at last the smallest will be head
                        curr.next=fwd.next;
                        //curr is biggest element which we want to place at last so it
                        //is not changing only connections are changing
                        fwd.next=curr;
                        prev=fwd;
                    }else{
                        Node<Integer> fwd=curr.next;
                        prev.next=fwd;
                        curr.next=fwd.next;
                        fwd.next=curr;
                        prev=fwd;
                    }
                }
            }
        }
        return head;
    }
}
