package lk.ijse.fx.controller;

public class StackReverse {
    public static void main(String[] args) {
        StackReverse stackReverse = new StackReverse(4);

        stackReverse.push("I");
        stackReverse.push("J");
        stackReverse.push("S");
        stackReverse.push("E");
        stackReverse.pop();
        stackReverse.pintStack();
    }

    int capacity;
    int top;
    String [] arr;
    int start;

    StackReverse (int size) {
        capacity = size;
        top = -1;
        arr = new String[size];
        start = 0;
    }

    boolean isFull() {
        return top == capacity - 1;
    }

    void push(String data) {
        if (isFull()) {
            System.out.println("Stack is full");
        } else {
            arr[++top] = data;
            System.out.println("Pushed: " + data);
        }
    }

    boolean isEmpty() {
        return  top == -1;
    }

    void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            while (top != -1) {
                System.out.print(" " + arr[top]);
                top--;
            }
        }
    }

    void pintStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
