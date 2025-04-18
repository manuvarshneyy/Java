public class StrngBuffer {
    public static void main(String[] args) {
        StringBuffer s1=new StringBuffer("hello");
        StringBuffer s2=new StringBuffer("hello");
        s1.append(s2);
        System.out.println(s1);
    }
}
