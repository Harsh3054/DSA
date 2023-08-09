package com.LinkedList;

public class DeleteEveryNNodes {
    public static Node<Integer> skipMdeleteN(Node<Integer> head, int M, int N){

        Node<Integer> temp=null;
        Node<Integer> currentNode=head;
        while(currentNode!=null){
            int take=0;
            int skip=0;
            while(currentNode!=null && take<M){
                if(temp==null){
                    temp=currentNode;
                }else{
                    temp.next=currentNode;
                    temp=currentNode;
                }
                currentNode=currentNode.next;
                take++;
            }

            while(currentNode!=null && skip<N){
                currentNode=currentNode.next;
                skip++;
            }

        }
        if(temp!=null){
            temp.next=null;
        }
        return head;

    }
}
