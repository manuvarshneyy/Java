import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter r");
        double r=s.nextDouble();
        System.out.println("Area is "+area(r));

        System.out.println("Enter num1");
        int num1=s.nextInt();
        System.out.println("cube is "+cube(num1));

        System.out.println("Enter num2");
        int num2=s.nextInt();
        System.out.println("Number is "+Check(num2));
        
    }
    public static double area(double r){
        double a=3.14*r*r;
        return a;
    }
    public static int cube(int num1){
        int c=num1*num1*num1;
        return(c);
    }
    public static String Check(int num2){
        return(num2%2==0?"Even":"Odd");
    }
}
