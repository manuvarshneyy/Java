import java.util.Scanner;

public class TAsk1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<=n;i++){
            int f=1;
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j]){
                    f++;
                    a[j]=Integer.MIN_VALUE;
                }
            }
                if(f>1&&a[i]!=Integer.MIN_VALUE)
                 System.out.println(a[i]);
        }
    }
}
