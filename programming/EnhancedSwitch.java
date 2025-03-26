import java.util.Scanner;

public class EnhancedSwitch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the operator");
        char ch=sc.next().charAt(0);
        System.out.println("enter the numbers");
        double n1=sc.nextDouble();
        double n2=sc.nextDouble();
        System.out.println(cal(ch,n1,n2));
    }
    public static double cal(char ch,double a, double b){
    double s= switch(ch){
        case '+' -> (a+b);
        case '-' -> (a-b);
        case '*' -> (a*b);
        case '/' -> (a/b);
        default-> -1;
    };
    return s;
    }
}
