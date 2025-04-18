import java.util.Scanner;

public class Stocks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(stock(arr, n));
    }
    public static int stock(int[] arr,int n){
        int min=arr[0];
        int maxx=0;
        for(int i=1;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            else{
                maxx=Math.max(maxx,arr[i]-min);
            }
        }
        return maxx;
    }
}
