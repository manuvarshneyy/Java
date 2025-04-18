import java.util.Arrays;
import java.util.Scanner;
/* another method
   for(int i=0;i<=n;i++){
       int f=1;
       for(int j=i+1;j<n;j++){
           if(a[i]==a[j]){
               f++;
               a[j]=Integer.MIN_VALUE;
           }
       }
           if(a[i]!=Integer.MIN_VALUE)
            System.out.println(a[i]+":"+f+"times");
   }
*/ 

public class CountOccurance {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("enter length");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] arr2=count(arr, n);
        for(int i=0;i<arr2.length;i++){
            if(arr2[i]!=0){
                System.out.println(i+" : "+arr2[i] +" times");
            }
        }
    }
    public static int[] count(int[] arr,int n){
        int max=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int[] arr2=new int[max+1];
        for(int i=0;i<n;i++){
            arr2[arr[i]]++;
        }
        return arr2;
    }
}
