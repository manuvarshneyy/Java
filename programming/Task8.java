import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        System.out.println("Enter 3 numbers");
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        met(n1,n2,n3);
    }
    public static void met(int n1, int n2, int n3){
        if(n1%2==0){
            if(n2%2==0){
                if(n3%2==0){
                    System.out.println("All three are even :"+(n1*n2*n3));
                }
                else {
                    System.out.println("n1 and n2 are even :"+(n1+n2));
                }
            }
            else if(n3%2==0)
            {
                System.out.println("n1 and n3 are even :"+(n1+n3));
            }
            else {
                System.out.println("n1 is even :"+n1);
            }
        }
        else if(n2%2==0){
            if(n3%2==0){
                System.out.println("n2 and n3 are even :"+(n2+n3));
            }
            else {
                System.out.println("n2 is even :"+n2);
            }
        }
        else if(n3%2==0){
            System.out.println("n3 is even :"+n3);
        }
        else {
            System.out.println("no is even :"+0);
        }
    }
}
