class SearchingMatchingMethod{
    public static void main(String[] args) {
        String s="Hello Munna bhai";
        String s1="ai";
        System.out.println("contains    : "+s.contains(s1));
        System.out.println("indexOf     : "+s.indexOf(s1));//returns first occurance
        System.out.println("lastIndexOf : "+s.lastIndexOf(s1));//returns last occurance
        System.out.println("startsWith  : "+s.startsWith(s1));
        System.out.println("endsWith    : "+s.endsWith(s1));
    }
}