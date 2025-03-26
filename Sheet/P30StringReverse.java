import java.util.Arrays;
import java.util.Scanner;

public class P30StringReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length");
        int n=sc.nextInt();
        sc.nextLine();
        String[] s=new String[n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++){
            s[i]=sc.nextLine();
        }
        String[] s2=rev(s, n);
        System.out.println(Arrays.toString(s2));
    }
    public static String[] rev(String[] s,int n){
        String[] ab=new String[n];
        int j=0;
        for(int i=n-1;i>=0;i--){
            ab[j]=s[i];
            j++;
        }
        return ab;
    }
}
