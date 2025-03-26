import java.util.Scanner;

public class MaxCol {
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
        for(int j=0;j<arr[0].length;j++){
            int max=0;
            for(int i=0;i<arr.length;i++){
                if(max<arr[i][j]){
                    max=arr[i][j];
                }
            }
            System.out.println("max : "+ max);
        }
    }
}
