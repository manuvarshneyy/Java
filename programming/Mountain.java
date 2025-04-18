import java.util.Arrays;
import java.util.Scanner;

public class Mountain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int c=0;
        int j=1;
        int k=1;
        int mid=n/2;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(n%2==0){
            for(int i=0;i<mid-1;i++){
                if(arr[mid-1-j]!=arr[mid]-j){
                    c++;
                    arr[mid-j-1]=arr[mid]-1;
                }
                j++;
                if(arr[mid+k]!=arr[mid]-k){
                    c++;
                    arr[mid+k]=arr[mid]-k;
                }
                k++;
            }
        }else{
            for(int i=0;i<mid;i++){
                if(arr[mid-j]!=arr[mid]-j){
                    c++;
                    arr[mid-j]=arr[mid]-j;
                }
                j++;
                if(arr[mid+k]!=arr[mid]-k){
                    c++;
                    arr[mid+k]=arr[mid]-k;
                }
                k++;
            }
        }
        System.out.println(c);
        System.out.println(Arrays.toString(arr));
    }
    

}
