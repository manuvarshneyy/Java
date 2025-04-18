public class CountOccurance {
    public static void main(String[] args) {
        String s="abcabc";
        System.out.println(isGood(s));
    }
    public static boolean isGood(String s){
        int[] a1=new int[26];
        for(int i=0;i<s.length();i++){
            a1[s.charAt(i)-97]++;
        }
        int f=-1;
        for(int i:a1){
            if(i==0)continue;
            else if(f==-1)f=i;
            else if(f!=i)return false;
        }
        return true;
    }
}
