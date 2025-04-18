public class ModificationReplacementMethod {
    public static void main(String[] args) {
        String s1="Hello Hello";
        String s2="ABC";
        String s3="xyz";
        String s4="    xyz    ";
        System.out.println("replace      : "+s1.replace('H', 'K'));
        System.out.println("replaceAll   : "+s1.replaceAll("Hello","Bye"));
        System.out.println("replaceFirst : "+s1.replaceFirst("Hello","Bye"));
        System.out.println("toLowerCase  : "+s2.toLowerCase());
        System.out.println("toUpperCase  : "+s3.toUpperCase());
        System.out.println("trim         : "+s4.trim());
    }
}
