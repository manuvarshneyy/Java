public class TaskDriver {
    public static void main(String[] args) {
        Task t=new Task();
        t.visit("Google");
        t.visit("Insta");
        t.visit("Facebook");
        t.visit("Twitter");
        t.print();
        t.back();
        t.back();
        t.print();
        t.forward();
        t.forward();
        t.forward();
        t.print();
        t.current();
    }
}
