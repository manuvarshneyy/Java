class Missing{
    public static void main(String[] args) {
        String s1="FI_ER";
        String s2="Fever:filer:Filter:fixer:fiber:tailor:offer";
        s1=s1.toUpperCase();
        s2=s2.toUpperCase();
        System.out.println(find(s1, s2));
    }
    public static String find(String s1,String s2){
        String[] a1=s1.split("_");
        String[] a2=s2.split(":");
        String ans="";
        for( String i :a2){
            if(i.length()==s1.length() && i.startsWith(a1[0]) && i.endsWith(a1[1])){
                ans+=(i+":");
            }
        }
        return ans.substring(0, ans.length()-1);
    }
}