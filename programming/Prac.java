import java.util.*;
class Prac{
    public static void main(String[] args) {
        System.out.println("Enter a,b,c");
        Scanner src=new Scanner(System.in);
        int a=src.nextInt();
        int b=src.nextInt();
        int c=src.nextInt();
        String x=a>b?(a>c?"a":"c"):(b>c?"b":"c");
        // int y=c>x?c:x;
        System.out.println("Max:"+x);
    }
    
}