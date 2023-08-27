package com.Queues;

public class Dequeue {
//    You need to implement a class for Dequeue i.e. for double ended queue.
//    In this queue, elements can be inserted and deleted from both the ends.
private int[] arr;
    private int front;
    private int rear;
    private int size;

    public Dequeue(int capacity){
        arr=new int[capacity];
        front=-1;
        rear=-1;
        this.size=capacity;
    }
    public boolean isFull(){
        return ((front == 0 && rear == size-1)||
                (front == rear+1));
    }
    public boolean isEmpty(){
        return (front == -1 && rear == -1);
    }
    public void insertFront(int key)
    {
        // check whether Deque if  full or not
        if (isFull())
        {
            System.out.println(-1);
            return;
        }
        // If queue is initially empty
        else if (front == -1 && rear == -1)
        {
            front = 0;
            rear = 0;
            //arr[front] = key ;  // insert current element into Deque
        }
        // front is at first position of queue
        else if (front == 0){
            front = size - 1 ;
            //arr[front] = key ;
        }
        else {// decrement front end by '1'
            front = front-1;
            //arr[front] = key ;
        }
        arr[front] = key ;
    }
    public void insertRear(int key)
    {
        if (isFull())
        {
            System.out.println(-1);
            return;
        }

        // If queue is initially empty
        else if (front == -1 && rear == -1)
        {
            front = 0;
            rear = 0;
            //arr[rear]=key
        }
        // rear is at last position of queue
        else if (rear == size-1){
            rear = 0;
            //arr[rear]=key
        }
        // increment rear end by '1'
        else{
            rear = rear+1;
            //arr[rear]=key
        }
        // insert current element into Deque
        arr[rear] = key ;
    }
    public void deleteFront()
    {
        // check whether Deque is empty or not
        if (isEmpty())
        {
            System.out.println(-1);
            return ;
        }
        // Deque has only one element
        else if (front == rear)
        {
            front = -1;
            rear = -1;
        }
        else if(front==size-1){
            front = 0; // back to initial position
        }

        else {// increment front by '1' to remove current
            // front value from Deque
            front = front+1;
        }
    }
    public void deleteRear()
    {
        if (isEmpty())
        {
            System.out.println(-1);
            return ;
        }

        // Deque has only one element
        else if (front == rear)
        {
            front = -1;
            rear = -1;
        }
        else if (rear == 0){
            rear = size-1;
        }
        else{
            rear = rear-1;
        }

    }
    public int getFront()
    {
        // check whether Deque is empty or not
        if (isEmpty())
        {
            return -1 ;
        }
        return arr[front];
    }
    public int getRear()
    {
        // check whether Deque is empty or not
        if(isEmpty())
        {
            return -1 ;
        }
        return arr[rear];
    }
}
