import java.util.Scanner;

public class P28LinearSearch {
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
        System.out.println(LinearSearch(arr,key,n));
    }
    public static int LinearSearch(int[] arr,int key,int n){
        for(int i=0;i<n;i++){
            if(arr[i]==key)
            return i;
        }
        return -1;
    }
}
