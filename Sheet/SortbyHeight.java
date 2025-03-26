import java.util.Arrays;
import java.util.Scanner;

public class SortbyHeight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter height");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.nextLine();
        String[] s=new String[n];
        System.out.println("enter names");
        for(int i=0;i<n;i++){
            s[i]=sc.nextLine();
        }
        String[] s2=height(arr,s,n);
        System.out.println(Arrays.toString(s2));

    }
    public static String[] height(int[] arr,String[] s,int n){
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    String t=s[i];
                    s[i]=s[j];
                    s[j]=t;
                }
            }
        }
        return s;
    }
}
