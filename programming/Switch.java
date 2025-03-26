import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the operator");
        char ch=sc.next().charAt(0);
        System.out.println("enter the numbers");
        double n1=sc.nextDouble();
        double n2=sc.nextDouble();
        cal(ch,n1,n2);
    }
    public static void cal(char ch,double n1,double n2){
        switch (ch) {
            case '+':{
                System.out.println(n1+n2);
            }break;
            case '-':{
                System.out.println(n1-n2);
            }break;
            case '*':{
                System.out.println(n1*n2);
            }break;
            case '/':{
                System.out.println(n1/n2);
            }break;
            default:{
                System.out.println(-1);
            }
        }
    }
}
