import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        factors(num);
    }
    public static void factors(int num){
        int i=1;
        while(i<=num){
            if(num%i==0){
                System.out.println(i + " ");
            }
            i++;
            
        }
    }
}
