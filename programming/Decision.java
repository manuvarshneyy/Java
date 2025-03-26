import java.util.Scanner;

public class Decision {
    public static void main(String[] args) {
        System.out.println("Enter a character");
        Scanner src=new Scanner(System.in);
        char ch=src.next().charAt(0);
        check(ch);
    }
    public static void check(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
        System.out.println("IT IS A VOVEL");
        else
        System.out.println("IT IS A CONSONANT");
    }
}
