import java.util.EmptyStackException;

public class StackUsingLinkedList {
    private int top=-1;
    Node head;
    //check for empty
    public boolean isEmpty(){
        return top==-1;
    }
    //add the data
    public void push(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
        top++;
    }
    //to remove data
    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int d=head.data;
        head=head.next;
        top--;
        return d;
    }
    public int peek(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return head.data;
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
        Node current=head;
        while(current.next!=null){
            System.out.println("|| "+current.data+" ||");
            current=current.next;
        }
        System.out.println("|| "+current.data+" ||");
        System.out.println("========");
    }
    private class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
}
