public class ReplaceAll {
    public static void main(String[] args) {
        String s="Hi    Buddy    baby";
        s=s.replaceAll("\\s+", " ");
        System.out.println(s);
    }
}
