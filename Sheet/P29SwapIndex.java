import java.util.Arrays;
import java.util.Scanner;

public class P29SwapIndex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter indexes");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int[] arr2;
        if(a>=n || b>=n){
            System.out.println("Out of range");
        }
        else{
            arr2=swap(arr, n, a, b);
            System.out.println(Arrays.toString(arr2));
        }
    }
    public static int[] swap(int[] arr,int n,int a,int b){
        for(int i=0;i<n;i++){
            int temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
        }
        return arr;
    }
}
