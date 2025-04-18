public class ArrayDriver {
    public static void main(String[] args) {
        QueueUsingArray q=new QueueUsingArray(6);
        q.Enque(10);
        q.Enque(20);
        q.Enque(30);
        q.Enque(40);
        q.Enque(50);
        q.Enque(60);
        System.out.println(q);
        System.out.println(q.Dequeue());
        System.out.println(q.Dequeue());
        q.Enque(70);
        q.Enque(80);
        System.out.println(q);
        System.out.println(q.size());
    }
}
