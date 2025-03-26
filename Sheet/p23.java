import java.util.Arrays;
import java.util.Scanner;

public class p23 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] arr2=rev(arr,n);
        System.out.println((Arrays.toString(arr2)));
        
        sc.close();
    }
    public static int[] rev(int[] arr,int n){
        int[] arr2;
        if(n%2==0){
            arr2=new int[n/2];
        }
        else{
            arr2=new int[n/2+1];
        }
        int j=0;
        for(int i=n-1;i>=n/2;i--){
            arr2[j]=arr[i];
            j++;
        }
        return arr2;
    }
}