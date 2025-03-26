import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        System.out.println("enter 2 no");
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        Para(n1,n2);
    }
    public static void Para(int n1, int n2){
        if(n1==0 || n2==0){
            System.out.println(3);
        }
        else if(n1%n2==0){
            System.out.println(2);
        }
        else {
            System.out.println(1);
        }
    }
}
