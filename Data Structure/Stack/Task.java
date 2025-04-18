import java.util.EmptyStackException;
public class Task {
    Node head;
    Node1 head1;
    int top=-1;
    int t=-1;
    //check empty
    public boolean isEmpty(){
        return top==-1;
    }
    //add
    public void visit(String data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
        top++;
    }
    //remove
    public void back(){
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        String d=head.data;
        head=head.next;
        top--;
        Node1 newNode1=new Node1(d);
        newNode1.next=head1;
        head1=newNode1;
        t++;
    }
    //forward
    public void forward(){
        // return head1.data;/
        if(t==-1){
            throw new NoMoreForward();
        }
        String d=head1.data;
        Node newNode=new Node(d);
        newNode.next=head;
        head=newNode;
        top++;
        head1=head1.next;
        t--;
        // Node1 newNode1=new Node1(back());
        // newNode1.next=head1;
        // head1=newNode1;
        // return head1.data;
    }
    //current
    public void current(){
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        System.out.println(head.data);
    }
    // to print the data
    public void print(){
        Node current=head;
        while(current.next!=null){
            System.out.println("|| "+current.data+" ||");
            current=current.next;
        }
        System.out.println("|| "+current.data+" ||");
        System.out.println("==========");
    }
    class Node1{
        Node1 next;
        String data;
        Node1(String data){
            this.data=data;
        }
    }
    class Node{
        Node next;
        String data;
        Node(String data){
            this.data=data;
        }
    }
}
class NoMoreForward extends Error{
    NoMoreForward(){
        super("No more forward");
    }
}
