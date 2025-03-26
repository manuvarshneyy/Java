import java.util.Arrays;
import java.util.Scanner;

public class Assignment25_3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int E= sc.nextInt();
        int N= sc.nextInt();
        int[] arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(count(arr, E));
    }
    public static int count(int[] arr2,int E){
        int c=0;
        for(int i=arr2.length-1;i>=0;i--){
            for(int j=0;j<2;j++){
                if(arr2[i]<=E){
                    E-=arr2[i];
                    c++;
                }
            }
            if(E==0){
                return c;
            }
        }
        return -1;
    }
}
