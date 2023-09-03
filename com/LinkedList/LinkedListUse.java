package com.LinkedList;

import java.util.Scanner;

public class LinkedListUse {

    public static void main(String[] args) {
        Node<Integer> input=takeInput();
        Node<Integer> ans=SwapTwoNodes.swapNodes(input,3,4);
        print(ans);

        

    }
    public static void print(Node<Integer> head){
        Node<Integer> temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static Node<Integer> takeInput(){

        Node<Integer> head=null,tail=null;
        Scanner s=new Scanner(System.in);
        int data=s.nextInt();

        while(data!=-1){
            Node<Integer> newNode=new Node<>(data);
            if(head==null){
                head=newNode;
                tail=newNode;
            }
            else{
                tail.next=newNode;
                tail=newNode;
            }
            data=s.nextInt();
        }
        return head;
    }
}
