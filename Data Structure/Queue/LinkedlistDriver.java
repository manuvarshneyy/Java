public class LinkedlistDriver {
    public static void main(String[] args) {
        QueueusingLinkedList q=new QueueusingLinkedList();
        q.Enque(10);
        q.Enque(20);
        q.Enque(30);
        q.Enque(40);
        System.out.println(q);
        System.out.println(q.size());
        q.Dequeue();
        q.Dequeue();
        System.out.println(q);
        System.out.println(q.size());
    }
}
