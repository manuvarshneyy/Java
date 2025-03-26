import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        System.out.println("enter limits");
        Scanner sc=new Scanner(System.in);
        int ll=sc.nextInt();
        int up=sc.nextInt();
        range(ll,up);
    }
    public static void range(int ll,int ul){
        for(int i=ll;i<=ul;i++){
            if(prime(i))
            System.out.println(i);
        }
    }
    public static boolean prime(int num){
        int i=2;
        int c=0;
        while(i<=num/2){
            if(num%i==0){
            c++;}
            i++;
        }
        
        if(c==0){
            return true;
        }
        return false;
    }
}
