public class Method_Intro {
    static int num=0;
    public static void main(String[] args) {
        System.out.println("main start");
        m1();
        System.out.println("main end");
    }
        public static void m1(){
            num++;
            m2();
        }
        public static void m2(){
            System.out.println(num);
            m1();
        }
}
