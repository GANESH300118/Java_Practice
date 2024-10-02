class Stack{
    int top,maxSize;
    int[] stackArr;
    Stack(int size){
        maxSize = size;
        top = -1;
        stackArr = new int[maxSize];
    }
    void push(int ele){
        if(top == maxSize -1){
            System.out.println("Stack is full.");
            return;
        }
        stackArr[++top] = ele;
    }
    int pop(){
        if(top == -1){
            System.out.println("Stack is Empty");
            return -1;
        }
        return stackArr[top--];
    }
    int topElement(){
        if(top == -1){
            System.out.println("Stack is Empty");
            return -1;
        }
        return stackArr[top];
    }
    void printStack(){
        if(top == -1){
            System.out.println("Stack is Empty");
            return;
        }
        for(int i=top ; i>-1; --i){
            System.err.print(stackArr[i] +" ");
        }
        System.err.println();
    }
}
public class Sssstack {
    public static void main(String args[]){
        Stack s1 = new Stack(5);
        s1.push(10);
        s1.push(3);
        s1.push(4);
        s1.push(6);
        s1.push(95);
        s1.push(82);
        System.err.println(s1.pop());
        System.err.println(s1.pop());
        System.err.println(s1.pop());
        System.err.println(s1.pop());
        System.err.println(s1.pop());
        System.err.println(s1.pop());
        s1.push(4);
        s1.push(6);
        System.err.println(s1.topElement());
    }   
}