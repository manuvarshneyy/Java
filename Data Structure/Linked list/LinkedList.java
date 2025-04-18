class LinkedList{
    Node head;
    int size;
    //APPEND
    public void append(int data){//adding at last
        Node newNode=new Node(data);
        //case 1 when empty list
        if(isEmpty()){
            head=newNode;
            size++;
            return;
        }
        // case 2-> when node is present
        Node current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newNode;
        size++;
    }
    //PREPEND
    public void prepend(int data){//to add at first
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
        size++;
    }
    //To insert element in between
    public void insert(int data,int index){
        if(index==0){
            prepend(data);
            return;
        }
        if(isEmpty()){
            System.out.println("list is empty");
        }
        if(index==size){
            append(data);
            return;
        }
        if(index>size||index<0){
            throw new ListIndexOutOfBondsException();
        }
        Node newNode=new Node(data);
        Node current=head;
        int c=0;
        while(index-1>c){
            current=current.next;
            c++;
        }
        newNode.next=current.next;
        current.next=newNode;
        size++;
    }
    //to remove element from start
    public void removeFirst(){
        if(isEmpty()){
            System.out.println("List is empty");
            return;
        }
        head=head.next;
        size--;
    }
    //to remove from last
    public void removeLast(){
        if(isEmpty()){
            System.out.println("List is empty");
            return;
        }
        if(size==1){
            head=null;
            size--;
            return;
        }
        Node current=head;
        while(current.next.next!=null){
            current=current.next;
        }
        current.next=null;
        size--;
    }
    //to remove at a particular position
    public void removeAt(int index){
        if(index==0){
            removeFirst();;
            return;
        }
        if(isEmpty()){
            System.out.println("list is empty");
        }
        if(index==size-1){
            removeLast();;
            return;
        }
        if(index>=size||index<0){
            throw new ListIndexOutOfBondsException();
        }
        Node current = head;
        Node prev= null;
        int c=0;
        while(index>c){
            prev=current;
            current=current.next;
            c++;
        }
        prev.next=current.next;
        current.next=null;
        size--;
    }//return data
    public Node get(int index){
        if(isEmpty()){
            System.out.println("List is empty");
            return null;
        }
        if(index>=size||index<0){
            throw new ListIndexOutOfBondsException();
        }
        Node current=head;
        int c=0;
        while(index>c){
            current=current.next;
            c++;
        }
        return current;
    }
    //search if data is present or not
    public boolean contains(int data){
        if(isEmpty()){
            System.out.println("List is empty");
            return false;
        }
        Node current=head;
        for(int i=0;i<size;i++){
            if(current.data==data){
                return true;
            }
            current=current.next;
        }
        return false;
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
    //Check whether the index is empty or not
    public boolean isEmpty(){//to check head is null or not
        return head==null;
    }
}
