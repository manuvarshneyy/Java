public class CircularDriver {
    public static void main(String[] args) {
        CircularSinglyLinkedList c=new CircularSinglyLinkedList();
        c.append(10);
        c.append(20);
        c.append(30);
        c.append(40);
        System.out.println(c);
        System.out.println(c.size());
        c.prepend(5);
        System.out.println(c);
        System.out.println(c.size());
        c.removeFirst();
        System.out.println(c);
        System.out.println(c.size());
        c.removeLast();
        System.out.println(c);
        System.out.println(c.size());
    }
}
