public class PrivateMethod implements M1{
    public static void main(String[] args) {
        M1 p=new PrivateMethod();
        p.abc();

    }
}
interface M1{
    default void abc(){
        System.out.println("M1");
        Pvtmethod();
    }
    private void Pvtmethod(){
        System.out.println("Private Non-Static Method");
    }
}