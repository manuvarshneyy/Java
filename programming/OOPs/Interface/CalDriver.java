import java.util.Scanner;

public class CalDriver {
    public static void main(String[] args) {
        System.out.println("enter numbers");
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt(); 
        int n2=sc.nextInt(); 
        System.out.println("enter operator");
        char ch=sc.next().charAt(0);
        Cal c=new CalAdv();//upcasting
        System.out.println(c.calculate(n1, n2, ch));
        sc.close();
    }
}
