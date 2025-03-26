import java.util.Scanner;

public class FinalKeyword {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        final int num2=4;//final keyword
        switch (n) {
            case 1,2,3://multiple cases using ,
                System.out.println("same");
                break;
            case num2://use of variable bcoz of final keyword
                System.out.println("Final keyword");
                break;    
            default:System.out.println(-1);
                break;
        }
    }
}
