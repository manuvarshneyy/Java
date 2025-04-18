public class StaticMembers {
    static int a=10;
    static{
        System.out.println("Block 1");
    }
    public static void main(String[] args) {
        System.out.println("main start");
        System.out.println(a);
        System.out.println("main end");
    }
    static{
        System.out.println("Block 2");
    }
}
