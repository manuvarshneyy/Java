class HashMap{
    private class Node{
        Integer key;
        String value;
        Node next;
        Node(Integer key,String value){
            this.key=key;
            this.value=value;
        }
    }

    private Node[] buckets;
    private int capacity=12;
    int size;
    private float loadFactor=0.75f;
    public HashMap(){
        buckets=new Node[capacity];
        size=0;
    }
    //to get index
    private int getIndex(Integer key){
        return Math.abs(key.hashCode())%capacity;//based on key we will store in array
        //hashCode() returns both positive and negative that's why we use Math.abs
    }
    //to insert 
    public void put(Integer key,String value){
        int index=getIndex(key);
        //when key is duplicate
        Node head=buckets[index];
        while(head!=null){
            if(head.key.equals(key)){
                head.value=value;
                return;
            }
            head=head.next;
        }
        Node newNode=new Node(key, value);
        newNode.next=buckets[index];
        buckets[index]=newNode;
        size++;
        // calling reSize method as size passes loadFactor value
        if(size>=loadFactor*capacity){
            reSize();
        }
    }
    //to return value
    public String get(Integer key){
        int index=getIndex(key);
        Node head=buckets[index];
        while(head!=null){
            if(head.key.equals(key)){
                return head.value;
            }
            head=head.next;
        }
        return null;
    }
    //to remove
    public String remove(Integer key){
        int index=getIndex(key);
        Node head=buckets[index];
        Node prev=null;
        while(head.next!=null){
            prev=head;
            head=head.next;
            if(head.key.equals(key)){
                String s=head.value;
                prev.next=head.next;
                return s;
            }
        }
        return null;
    }
    //when size is greater than 75% then we will create another array of double size
    //resizing to maintain time complexity of O(1)
    public void reSize(){
        System.out.println("resize calling");
        Node[] oldValues=buckets;//copying
        capacity*=2;
        buckets=new Node[capacity];
        size=0;//because size will also become double
        for(int i=0;i<oldValues.length;i++){
            Node head=oldValues[i];
            while(head!=null){
                put(head.key,head.value);
                head=head.next;
            }
        }
    }
}