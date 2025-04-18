public class Driver {
    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        System.out.println("Empty list            : "+l);
        System.out.println("Size:"+l.size);
        l.append(10);
        l.append(20);
        l.append(30);
        l.append(40);
        System.out.println("Appended list         : "+l);
        System.out.println("Size:"+l.size);
        l.prepend(5);
        System.out.println("Prepended list        : "+l);
        System.out.println("Size:"+l.size);
        l.insert(15, 2);
        System.out.println("Insert at index 2     : "+l);
        System.out.println("Size:"+l.size);
        l.insert(60, 6);
        System.out.println("Insert at last index  : "+l);
        System.out.println("Size:"+l.size);
        l.insert(2, 0);
        System.out.println("Insert at first index : "+l);
        System.out.println("Size:"+l.size);
        l.removeFirst();
        System.out.println("Removed first         : "+l);
        System.out.println("Size:"+l.size);
        l.removeLast();
        System.out.println("Removed last          : "+l);
        System.out.println("Size:"+l.size);
        l.removeAt(1);
        System.out.println("Removed from index 1  : "+l);
        System.out.println("Size:"+l.size);
        System.out.println("Get Data              :"+l.get(2));
        System.out.println("Get Index             :"+l.contains(50));
        l.insert(100, 10);//exception condition
        System.out.println("Size:"+l);
    }
}
