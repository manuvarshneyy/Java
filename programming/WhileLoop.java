import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        System.out.println("enter the numbers");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println(res(num1,num2));
    }
    public static int res(int num1,int num2){
        int revnum1 =0;
        int res=0;
        while(num1>0){
            revnum1=revnum1*10 +num1%10;
            num1/=10;
        }
        while(num2>0 || revnum1>0){
            if(revnum1>0){
                res=res*10 + revnum1%10;
                revnum1/=10;
            }
            if(num2>0){
                res=res*10 + num2%10;
                num2/=10;
            }
        }
        return res;
    }
}
