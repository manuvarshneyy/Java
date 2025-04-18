public class Child extends Parent{
    static int c=30;
    int d=40;
    static{
        System.out.println("child static block");
    }

    {
        System.out.println("child non-static block");
    }
    Child(){
        System.out.println("child constructor");
    }
    public static void m3(){
        System.out.println("child static method");
    }
    public void m4(){
        System.out.println("child non-static method");
    }
    public static void main(String[] args) {
        Child ch=new Child();
    }
}
