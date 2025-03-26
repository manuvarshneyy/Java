import java.util.*;
public class TAsk5 {
    public static void main(String[] args) {
        System.out.println("enter the character");
        Scanner src= new Scanner(System.in);
        char ch=src.next().charAt(0);
        lowercase(ch);
    }
    public static void lowercase(char xy){
        char ch=(xy>='A'&&xy<='Z')?(char)(xy+32):xy;
        System.out.println(ch);
    }
}
