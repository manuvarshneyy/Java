import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter key");
        int key=sc.nextInt();
        System.out.println(BinarySrch(arr,key,n));
    }
    public static int BinarySrch(int[] arr,int key,int n){
        int left=0,right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;// Avoids overflow
            if(key==arr[mid]){
                return mid;
            }
            else if(key>arr[mid]){
                left=mid+1;
            }
            else if(key<arr[mid]){
                right=mid-1;
            }
        }
        return -1;
    }
}
