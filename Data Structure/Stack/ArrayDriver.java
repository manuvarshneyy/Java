class ArrayDriver{
    public static void main(String[] args) {
        StackusingArray s=new StackusingArray(10);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        s.print();
        System.out.println("poped :"+s.pop());
        s.print();
        System.out.println("top :"+s.peek());
        System.out.println("size :"+s.size());

    }
}