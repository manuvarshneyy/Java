public class MethodOverloading {
    public static void main(String[] args) {
        add(40,20);
        add(32.3,20.5);
        add(3,80,47);
    }
    public static void add(int n1, int n2){
        System.out.println(n1+n2);
    }
    public static void add(double n1, double n2){
        System.out.println(n1+n2);
    }
    public static void add(int n1, int n2, int n3){
        System.out.println(n1+n2+n3);
    }
}
