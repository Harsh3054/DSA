package com.LinkedList;

public class MergeSort {
    public static Node<Integer> mergeSort(Node<Integer> head) {

        if(head == null || head.next ==null){
            return head;
        }
        Node<Integer> mid = Midpoint.midpoint(head);

        Node<Integer> part1Head=head;

        Node<Integer> part2Head=mid.next;

        mid.next=null;
        Node<Integer> head1= mergeSort(part1Head);

        Node<Integer> head2= mergeSort(part2Head);


        Node<Integer> ans = MergetwoSortedLL.mergeTwoSortedLinkedLists(head1,head2);

        return ans;
        //Your code goes here
    }
}
