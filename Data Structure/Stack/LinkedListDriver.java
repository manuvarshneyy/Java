class LinkedListDriver{
    public static void main(String[] args) {
        StackUsingLinkedList s=new StackUsingLinkedList();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.print();
        System.out.println("size :"+s.size());
        System.out.println("pop :"+s.pop());
        s.print();
        System.out.println("peek :"+s.peek());
        System.out.println("size :"+s.size());
    }
}