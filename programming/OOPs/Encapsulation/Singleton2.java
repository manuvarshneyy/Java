public class Singleton2 {
    public static void main(String[] args) {
        Singleton s1=Singleton.getObject("abc", "ghf");
        System.out.println(s1);
        Singleton s2=Singleton.getObject("abc", "ghf");
        System.out.println(s2);
    }
}
