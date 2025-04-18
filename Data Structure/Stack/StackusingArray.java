import java.util.EmptyStackException;

class StackusingArray{
    private int[] stack;
    private int top;
    StackusingArray(int size){
        stack=new int[size];
        top=-1;
    }
    //check for empty
    public boolean isEmpty(){
        return top==-1;
    }
    //add the data
    public void push(int data){
        if(top==stack.length-1){
            throw new StackOutOfMemory();
        }
        stack[++top]=data;
    }
    //to remove data
    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return stack[top--];
    }
    // to return top element
    public int peek(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return stack[top];
    }
    //to return the size
    public int size(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return top+1;
    }
    // to print the data
    public void print(){
        for(int i=top;i>=0;i--){
            System.out.println("|| "+stack[i]+" ||");
        }
        System.out.println("========");
    }
}
class StackOutOfMemory extends Error{
    public StackOutOfMemory(){
        super("Stack is full");
    }
}