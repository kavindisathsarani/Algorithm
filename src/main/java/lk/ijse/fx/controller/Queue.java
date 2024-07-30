package lk.ijse.fx.controller;

public class Queue {
    int capacity;
    int[] queue;
    int start;
    int end;

    Queue(int size){
        capacity=size;
        queue=new int[size];
        start=0;
        end=-1;
    }

    boolean isFull(){
        return end+1==capacity;
    }

    void enqueue(int x) {
        if (isFull()) {
            System.out.println("Queue is full.try again");
        } else {
            end++;
            queue[end] = x;
            System.out.println(x + " is added successfully!");
        }
    }

    boolean isEmpty(){
        return end==-1;
    }

    void dequeue(){
        if (isEmpty()) {
            System.out.println("Queue is empty ");
        }else {
            System.out.println(queue[start]+ " is removed now!");
            start++;
        }
    }

    void printQueue(){
        for (int i = start; i <end+1 ; i++) {
            System.out.println(queue[i]);
        }
    }
    public static void main(String[] args) {
        Queue myQue=new Queue(5);
        myQue.enqueue(10);
        myQue.enqueue(20);
        myQue.enqueue(30);
        myQue.enqueue(40);
        myQue.enqueue(50);
        myQue.enqueue(60);
        myQue.dequeue();
        myQue.dequeue();
        myQue.printQueue();
    }
}
