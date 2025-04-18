public class DoublyLinkedList {
    Node head;
    int size;
    //Append toinsert at last
    public void append(int data){
        Node newNode=new Node(data);
        if(isEmpty()){
            head=newNode;
            size++;
            return;
        }
        Node current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newNode;
        newNode.prev=current;
        size++;
    }
    //Prepand to store at first
    public void prepend(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
        size++;
    }
    //To insert element in between
    public void insert(int data,int index){
        if(isEmpty()){
            System.out.println("list is emplty");
        }
        if(index==0){
            prepend(data);
            return;
        }
        if(index==size){
            append(data);
            return;
        }
        if(index>size&&index<0){
            throw new ListIndexOutOfBondsException();
        }
        Node newNode=new Node(data);
        Node current=head;
        int c=0;
        while(index-1>c){
            current=current.next;
            c++;
        }
        Node fwd=current.next;
        fwd.prev=newNode;
        newNode.next=current.next;
        newNode.prev=current;
        current.next=newNode;
        size++;
    }
    //to remove element from start
    public void removeFirst(){
        if(isEmpty()){
            System.out.println("list is empty");
            return;
        }
        head=head.next;
        head.prev=null;
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
        while (current.next.next!=null) {
            current=current.next;
        }
        current.next=null;
        size--;
    }
    //to remove at a particular position
    public void removeAt(int index){
        if(isEmpty()){
            System.out.println("list is empty");
            return;
        }
        if(index==0){
            removeFirst();
            return;
        }
        if(index==size-1){
            removeLast();
            return;
        }
        if(index>=size&&index<0){
            throw new ListIndexOutOfBondsException();
        }
        Node current=head;
        Node pre=null;
        Node fwd=null;
        int c=0;
        while(index>c){
            pre=current;
            current=current.next;
            c++;
        }
        fwd=current.next;
        pre.next=current.next;
        fwd.prev=current.prev;
        current.next=null;
        current.prev=null;
        size--;
    }
    //to reverse
    public Node rev(){
        if(isEmpty()){
            System.out.println("list is empty");
            return null;
        }
        Node current=head;
        while(current.next!=null){
            current=current.next;
        }
        return current;
    }
    public String reverse(){
        Node current=rev();
        String ans=" [";
        while(current.prev!=null){
            ans+=current.data+",";
            current=current.prev;
        }
        ans+=current.data+"]";
        return ans;
    }
    //toString for printing
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
    //to check head is null or not
    public boolean isEmpty(){
        return head==null;
    }
}
