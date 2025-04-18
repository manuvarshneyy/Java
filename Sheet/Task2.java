import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] arr2=task(arr, n);
        System.out.println((Arrays.toString(arr2)));
    }
    public static int[] task(int[] arr,int n){
        int l=0,r=n-1;
        while(l<r){
            while(arr[r]==0 && l<r) r--;
            while(arr[l]==1 && l<r) l++;
            if(l<r){
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l++;
                r--;
            }
        }
        return arr;
    }
}