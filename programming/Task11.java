import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(res(num));
    }
    public static int res(int num){
        while(num>=10){
            int ans=0;
            while(num>0){
                int x=num%10;
                if(x%2==0){
                 ans+=x;
                }
                num/=10;
           }
           num=ans;
        }
        return num;
    }
}
