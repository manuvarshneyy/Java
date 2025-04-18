public class NonStaticBlock {
    int a=10;
    {
        System.out.println("Non-static-block 1");
    }
    NonStaticBlock(){
        System.out.println("constructor");
    }
    {
        System.out.println("Non-static-block 2");
    }
    void m1(){
        System.out.println("Non-static method");
    }
}
