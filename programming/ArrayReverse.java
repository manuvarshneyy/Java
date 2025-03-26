import java.util.Arrays;
import java.util.Scanner;
public class ArrayReverse {
    public static void main(String[] args) {
        System.out.println("enter elements");
        int[] arr=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int[] arr3=rev(arr);
        for(int i=0;i<arr3.length;i++){
            System.out.println(arr3[i]);
        }
    }
    public static int[] rev(int[] arr){
        int[] arr2=new int[5];
        int j=0;
        for(int i=arr.length-1;i>=0;i--){
            arr2[j]=arr[i];
            j++;
        }
        return arr2;
    }
}
