package globallogic;

public class ArrayStack {
    private int [] stack;
    private int top;
    private int capacity;

    //step 1 : ArrayStack
    ArrayStack(int size){
        capacity = size;
        stack = new int[capacity];
        top = -1;
    }
    public void push(int element){
        if(isFull()){
            System.out.println("Stack is full");
        }else{
            top++;
            stack[top] = element;
            System.out.println("Pushed Element is : "+element);
        }
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty ");
            return -1;
        }else{
            int popElement = stack[top];
            top--;
            System.out.println("Popped Element is : "+ popElement);
            return popElement;
        }
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }else{
            System.out.println("Top Element : "+ stack[top]);
            return stack[top];
        }
    }
    public boolean isFull(){
        return (top == capacity-1);
    }
    public boolean isEmpty(){
        return (top == -1);
    }
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        stack.peek();
        stack.pop();
        stack.peek();
    }
}
