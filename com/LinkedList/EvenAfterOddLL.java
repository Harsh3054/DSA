package com.LinkedList;

public class EvenAfterOddLL {
    public static Node<Integer> evenAfterOff(Node<Integer> head){
        if(head==null){
            return null;
        }
        Node<Integer> evenHead=null,evenTail=null,oddHead=null,oddTail=null;

        while (head != null) {

            if(head.data%2==0){
                if(evenHead==null){
                    evenHead=head;
                    evenTail=head;
                }
                else{
                    evenTail.next=head;
                    evenTail=evenTail.next;
                }
            }
            else{
                if(oddHead==null){
                    oddHead=head;
                    oddTail=head;
                }
                else{
                    oddTail.next=head;
                    oddTail=oddTail.next;
                }
            }
            head=head.next;
        }
        if(oddHead==null){
            return evenHead;
        }else{
            oddTail.next=evenHead;
        }
        if(evenHead!=null){
            evenTail.next=null;
        }
        return oddHead;

    }
}
