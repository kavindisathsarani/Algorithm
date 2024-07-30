package lk.ijse.fx.controller;


import java.util.Arrays;

public class stack {
    public static void main(String[] args) {
        stack myStack=new stack(5);
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.priStack();
        myStack.pop();
        myStack.priStack();
    }
    int capasity;
    int top;
    int[] arr;
    int start;

    stack(int size){
        capasity=size;
        top=-1;
        arr=new int[size];
        start=0;
    }
     boolean isFull(){
        return top+1==capasity;
     }

     void push(int x){
        if(isFull()){
            System.out.println("stack is full");
        }else {
            top++;
            arr[top]=x;
            System.out.println(x+" is added sucessfull");
        }
     }

     boolean isEmpty(){
        return start==top+1;
     }

     void pop(){
        if(isEmpty()){
            System.out.println("stack is empty.Add some data");
        }else {
            System.out.println(arr[top]+" is removing now");
            top--;
        }
     }

     void priStack(){
         for (int i = 0; i <(top+1); i++) {
             System.out.println(arr[i]);
         }
    }
}
