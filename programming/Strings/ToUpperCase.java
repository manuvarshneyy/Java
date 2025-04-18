public class ToUpperCase {
    public static void main(String[] args) {
        String s="abc1";
        StringBuffer s2 = new StringBuffer();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='a' && c<='z'){
                c=(char) (c-32);
            }
            s2.append(c);
        }
        System.out.println(s2.toString());
    }
}
