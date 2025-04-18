public class QueueusingLinkedList {
    Node head;
    Node rear;
    private int size=0;
    //check for empty
    public boolean isEmpty(){
        return size==0;
    }
    //add data
    public void Enque(int data){
        Node newNode=new Node(data);
        if(isEmpty()){
            head=newNode;
            rear=newNode;
            size++;
            return;
        }
        rear.next=newNode;
        rear=newNode;
        size++;
    }
    //remove
    public int Dequeue(){
        if(size==0){
            throw new QueueEmpty();
        }
        int d=head.data;
        head=head.next;
        size--;
        return d;
    }
    //size
    public int size(){
        return size;
    }
    //print
    public String toString(){
        if(isEmpty()){
            return "[ ]";
        }
        String ans="[";
        Node current=head;
        while(current.next!=null){
            ans+=current.data+",";
            current=current.next;
        }
        ans+=current.data +"]";
        return ans;
    }
    private class Node{
        Node next;
        int data;
        Node(int data){
            this.data=data;
        }
    }
}

