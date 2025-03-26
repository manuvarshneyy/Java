import java.util.*;

public class Rtn {
    public static void main(String[] args) {
        Scanner src= new Scanner(System.in);
        int a=src.nextInt();
        int b=src.nextInt();
        int sum=add(a,b);
        System.out.println("sum is "+sum);
    }
    public static int add(int n1, int n2){
        int sum=n1+n2;
        return sum;
    }
}
