public class NonStatic {
    public void demo(){
        System.out.println("hi");
    }
    public static void main(String[] args) {
        NonStatic d= new NonStatic();
        d.demo();

    }
}
