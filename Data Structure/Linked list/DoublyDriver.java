public class DoublyDriver {
    public static void main(String[] args) {
        DoublyLinkedList d=new DoublyLinkedList();
        System.out.println("Empty list            : "+d);
        System.out.println("Size:"+d.size);
        d.append(10);
        d.append(20);
        d.append(30);
        d.append(40);
        System.out.println("Appended list         : "+d);
        System.out.println("Size:"+d.size);
        d.prepend(5);
        System.out.println("Prepended list        : "+d);
        System.out.println("Size:"+d.size);
        d.insert(15, 2);
        System.out.println("Insert at index 2     : "+d);
        System.out.println("Size:"+d.size);
        d.removeFirst();
        System.out.println("Removed first         : "+d);
        System.out.println("Size:"+d.size);
        d.removeLast();
        System.out.println("Removed last          : "+d);
        System.out.println("Size:"+d.size);
        d.removeAt(1);
        System.out.println("Removed from index 1  : "+d);
        System.out.println("Size:"+d.size);
        System.out.println("Reverse               :"+d.reverse());
    }
}
