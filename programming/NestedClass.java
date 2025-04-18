public class NestedClass {
    int a=10;
    static class Demo{
        int a=20;
    }
    public static void main(String[] args) {
        NestedClass n=new NestedClass();
        System.out.println(n.a);
        Demo d=new Demo();
        System.out.println(d.a);
    }
}
