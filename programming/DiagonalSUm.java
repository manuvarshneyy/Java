import java.util.Arrays;
import java.util.Scanner;

public class DiagonalSUm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter dimensions");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        System.out.println("enter elements");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Sum :"+diagonal(arr, n, m));
    }
    public static int diagonal(int[][] arr,int n,int m){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(i==j){
                    sum+=arr[i][j];
                }
            }
        }
        return sum;
    }
}
