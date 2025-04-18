public class Split {
    public static void main(String[] args) {
        String s1="I Love Java";
        String [] sArray=s1.split(" ");
        for(String s: sArray){
            System.out.println(s);
        }
    }
}
