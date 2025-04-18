public class DProblem extends Parent implements P1,P2{
    public void m1(){
        P1.super.m1();
        System.out.println("child");
    }
    public static void main(String[] args) {
        P2 obj=new DProblem();//P1 obj bhi bna skte h same result hoga
        obj.m1();

    }
}

interface P1 {
    default void m1()
    {
        System.out.println("P1");
    } 
}
interface P2{
    default void m1(){
        System.out.println("P2");
    } 
}
class Parent{

}