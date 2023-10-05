package PrepJava.src.learning.Stack;

import java.util.Arrays;

public class stackUsingArray {

    int arr[];
    int top;
    int capacity;

    public stackUsingArray(int capacity){
        this.capacity=capacity;
        top=-1;
        arr=new int[capacity];
    }

    public void push(int data) throws Exception {
        if (top==capacity-1){
            throw new Exception("Stack is overflowed");
        }
        else{
            top++;
            arr[top]=data;
        }
    }
    public int pop() throws Exception {
        if (top==-1){
            throw new Exception("Statck is empty");
        }
        else{
            int res = arr[top];
            top--;
            return res;
        }
    }

    public int peek() throws Exception {
        if (top==-1){
            throw new Exception("Statck is empty");
        }
        else{
            return arr[top];
        }
    }

    public boolean isEmpty(){
        if (top==-1){
            return true;
        }
        return false;
    }

    public static void main(String[] args) throws Exception {
        stackUsingArray mystc = new stackUsingArray(5);
        mystc.push(3);
        mystc.push(66);
        mystc.push(2);
        System.out.println(mystc.peek());
        mystc.pop();
        System.out.println(mystc.peek());
        System.out.println(mystc.isEmpty());
        mystc.pop();
        mystc.pop();
        System.out.println(mystc.isEmpty());


    }

}
