public class BasicStringsMethod {
    public static void main(String[] args) {
        String s="Hello Munna bhai";
        String s2="Hello munna bhai";
        String s3=" ";
        System.out.println("Length                   : "+s.length());
        System.out.println("Index                    : "+s.charAt(8));
        System.out.println("Substring                : "+s.substring(3));
        System.out.println("Substring(with endindex) : "+s.substring(3,10));//end index is exclusive
        System.out.println("Equals                   : "+s.equals(s2));
        System.out.println("Equals(ignoring case)    : "+s.equalsIgnoreCase(s2));
        System.out.println("CompareTo                : "+s.compareTo(s2));
        System.out.println("IsEmpty                  : "+s.isEmpty());
        System.out.println("IsEmpty                  : "+s3.isEmpty());
        System.out.println("IsEmpty                  : "+s3.isBlank());//will only take characters
    }
}
