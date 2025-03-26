import java.util.Scanner;

public class HasNext {
    public static void main(String[] args) {
        // Scanner sc= new Scanner("10 20 30");

        // System.out.println(sc.next());
        // System.out.println(sc.hasNext());
        // System.out.println(sc.next());
        // System.out.println(sc.hasNext());
        // System.out.println(sc.next());
        // System.out.println(sc.hasNext());

        String s="10:20:30";
        Scanner sc= new Scanner(s);
        sc.useDelimiter(":");
        System.out.println(sc.next());
        System.out.println(sc.hasNext());
        System.out.println(sc.next());
        System.out.println(sc.hasNext());
        System.out.println(sc.next());
        System.out.println(sc.hasNext());
    }
}
