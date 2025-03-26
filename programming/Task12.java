import java.util.Arrays;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        System.out.println("enter array elements");
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=rev(arr[i]);
        }
        System.out.println("Reversed digits:"+Arrays.toString(arr));
    }
    public static int rev(int n){
        int ans=0;
        while(n>0){
            ans=ans*10+n%10;
            n/=10;
        }
        return ans;
    }
}
