class QueueUsingArray{
    private int[] queue;
    private int front=0;
    private int rear=-1;
    private int size=0;
    QueueUsingArray(int len){
        queue=new int[len];
    }
    //check for empty
    public boolean isEmpty(){
        return size==0;
    }
    //to add data
    public void Enque(int data){
        if(size==queue.length){
            throw new QueueOutOfMemory();
        }
        rear=(rear+1)%queue.length;
        queue[rear]=data;
        size++;
    }
    //to remove data
    public int Dequeue(){
        if(isEmpty()){
            throw new QueueEmpty();
        }
        int f=queue[front];
        front=(front+1)%queue.length;
        size--;
        return f;
    }
    //to return size
    public int size(){
        return size;
    }
    //print
    public String toString(){
        if(isEmpty()){
            return "empty";
        }
        String ans="";
        for(int i=0;i<size;i++){
            int idx = (front + i) % queue.length;
            ans+="|"+queue[idx];
        }ans+="|";
        return ans;
    }
}
class QueueOutOfMemory extends Error{
    public QueueOutOfMemory(){
        super("Queue is full");
    }
}
class QueueEmpty extends Error{
    public QueueEmpty(){
        super("Queue is Empty");
    }
}