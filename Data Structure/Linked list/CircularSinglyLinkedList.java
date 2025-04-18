public class CircularSinglyLinkedList {
    
    private class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    Node head;
    private int size;
    public int size(){
        return this.size;//bcoz size variable is private to access it we will create getter method
    }
    //Append toinsert at last
    public void append(int data){
        Node newNode=new Node(data);
        if(isEmpty()){
            head=newNode;
            head.next=head;
            size++;
            return;
        }
        Node current=head;
        while(current.next!=head){
            current=current.next;
        }
        current.next=newNode;
        newNode.next=head;
        size++;
    }
    //Prepand to store at first
    public void prepend(int data){
        Node newNode=new Node(data);
        if(isEmpty()){
            head=newNode;
            head.next=head;
            size++;
            return;
        }
        Node current=head;
        while(current.next!=head){
            current=current.next;
        }
        current.next=newNode;
        newNode.next=head;
        head=newNode;
        size++;
    }
    //to remove element from start
    public void removeFirst(){
        if(isEmpty()){
            System.out.println("list is empty");
            return;
        }
        if(size==1){
            head=null;
            size--;
            return;
        }
        Node current=head;
        while(current.next!=head){
            current=current.next;
        }
        head=head.next;
        current.next=head;
        size--;
    }
     //to remove element from last
     public void removeLast(){
        if(isEmpty()){
            System.out.println("list is empty");
            return;
        }
        if(size==1){
            head=null;
            size--;
            return;
        }
        Node current=head;
        while(current.next.next!=head){
            current=current.next;
        }
        current.next=head;
        size--;
     }
    //toString for printing
    public String toString(){
        if (isEmpty()) {
            return "[ ]";
        }
        StringBuffer ans=new StringBuffer("[");
        Node current = head;
        while(current.next!=head){
            ans.append(current.data+",");
            current=current.next;
        }
        ans.append(current.data+"]");
        return ans.toString();
    }
    //to check head is null or not
    public boolean isEmpty(){
        return head==null;
    }
}
