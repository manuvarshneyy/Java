import java.util.*;
public class task4 {

    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);

        System.out.println("Enter the number");
        int n=src.nextInt();

        System.out.println("Enter the character");
        char ch=src.next().charAt(0);
        
        String st=(n>20 && n<80)?"In limit":"Out of limit";
        System.out.println(st);

        String s=(ch>64 && ch<92)?"UpperCase":"LowerCase";
        System.out.println(s);

    }
}