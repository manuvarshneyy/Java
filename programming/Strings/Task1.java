public class Task1 {
    public static void main(String[] args) {
        String s="Hello Buddy";

        System.out.println(lastIndexOf(s, 'y'));
        System.out.println(replace(s, 'l', 'a'));
        System.out.println(replaceAll(s,"Hello","Bye"));
    }
    public static int lastIndexOf(String s,char ch){
        for(int i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);
            if (c==ch){
                return i;
            }
        }
        return -1;
    }
    public static String replace(String s,char c1,char c2){
        String s2="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c==c1){
                c=c2;
            }
            s2+=c;
        }
        return s2;
    }
    public static String replaceAll(String s,String s1,String s2){
        String m="";
        String[] ss=s.split(" ");
        for(int i=0;i<ss.length;i++){
            if(ss[i].equals(s1)){
                m=m.concat(s2+" ");
            }else 
            m=m.concat(ss[i]+" ");
        }
        return m;
    }
}
